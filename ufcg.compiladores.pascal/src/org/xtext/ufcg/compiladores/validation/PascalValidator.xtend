/*
 * generated by Xtext 2.11.0.RC2
 */
package org.xtext.ufcg.compiladores.validation

import java.util.ArrayList
import java.util.HashMap
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.validation.Check
import org.xtext.ufcg.compiladores.pascal.PascalPackage
import org.xtext.ufcg.compiladores.pascal.abstraction_declaration
import org.xtext.ufcg.compiladores.pascal.abstraction_heading
import org.xtext.ufcg.compiladores.pascal.any_number
import org.xtext.ufcg.compiladores.pascal.block
import org.xtext.ufcg.compiladores.pascal.constant
import org.xtext.ufcg.compiladores.pascal.constant_definition
import org.xtext.ufcg.compiladores.pascal.expression
import org.xtext.ufcg.compiladores.pascal.expression_list
import org.xtext.ufcg.compiladores.pascal.factor
import org.xtext.ufcg.compiladores.pascal.formal_parameter_section
import org.xtext.ufcg.compiladores.pascal.function_designator
import org.xtext.ufcg.compiladores.pascal.number
import org.xtext.ufcg.compiladores.pascal.parameter_type
import org.xtext.ufcg.compiladores.pascal.program
import org.xtext.ufcg.compiladores.pascal.simple_expression
import org.xtext.ufcg.compiladores.pascal.statement
import org.xtext.ufcg.compiladores.pascal.statement_sequence
import org.xtext.ufcg.compiladores.pascal.term
import org.xtext.ufcg.compiladores.pascal.type
import org.xtext.ufcg.compiladores.pascal.type_definition
import org.xtext.ufcg.compiladores.pascal.variable
import org.xtext.ufcg.compiladores.pascal.variable_section

 @SuppressWarnings("all")
class PascalValidator extends AbstractPascalValidator {
	
	// Tipos basicos
	
	private final String NIL = "nil";
	private final String RECORD = "record";
	private final String CHAR = "char";
	private final String BOOLEAN = "boolean";
	private final String INTEGER = "integer";
	private final String REAL = "real";
	private final String POINTER = "^";
	private final String ARRAY = "array of ";

	
	// Mensagens
	
	private final String UNDEFINED_TYPE_MESSAGE = "Undefined type";
	private final String CANNOT_CONVERT_MESSAGE = "Cannot convert ";
	private final String TO_MESSAGE = " to ";
	
	// inicializando a tabela de simbolos
	public static final Map<String, Map<String, Object>> tabela_de_simbolos = new HashMap<String, Map<String, Object>>();


	// classe responsavel pela manipulacao dos erros
	private final Map<EObject, Set<Error>> errorList = new AdaptativeHashMap<EObject, Error>();
	// classe responsavel pela manipulacao das variaveis
	private final Map<block, Set<Variable>> variables = new AdaptativeHashMap<block, Variable>();
	// classe responsavel pela manipulacao de procedures
	private final Map<block, Set<Procedure>> abstractions = new AdaptativeHashMap<block, Procedure>(APIProvider.procedures);
	// classe responsavel pela manipulacao de tipos
	private final Map<block, Set<Type>> types = new AdaptativeHashMap<block, Type>(APIProvider.types);
	// classe responsavel pela manipulacao de comparacoes
	private final Map<EObject, Type> calculatedTypes = new HashMap<EObject, Type>();
 
	def static <T extends Element> search(Set<T> elements, T key) {
		for (T t : elements) {
			if (t.equals(key))
				return t;
		} 
		return null;	
	}
	
	def static searchWithTypeCoersion(Set<Procedure> elements, Procedure key) {
		var Procedure optimal = null; 
		for (Procedure t : elements) {
			if (t.equals(key))
				return t;
			if (t.equalsWithTypeCoersion(key))
				optimal = t;
		}  
		return optimal;
	}
	 
	def static Type searchByName(Set<Type> types, Type key) {
		for (Type t : types) {
			if (t.name.toLowerCase.equals(key.name.toLowerCase)) {
				return t;
			} 
		}	
		return null;
	}
	
	def insertError(EObject object, String message, ErrorType type, EStructuralFeature feature) {
		errorList.get(object).add(new Error(message, type, feature));
	}
	
	def removeError(EObject object, ErrorType type) {
		errorList.get(object).remove(new Error(type));
		showError(object);
	}  
	 
	def <T extends Element> clear(block b, ElementType type, Map<block, Set<T>> container) {
		var newSet = new AdaptativeTreeSet<T>();
		for (T t : container.get(b)) {
			if (t.type != type || t.isInherited) {
				newSet.add(t);
			}	 
		} 
		container.put(b, newSet);
	}
	def getParameters(block b, function_designator f) {
		var parameters = new ArrayList<Variable>();
		if (f.expressions != null) {
			var count = 0; 
			for (expression e : f.expressions.expressions) {
				parameters.add(new Variable("arg_" + count, getType(b, e), false, b, ElementType.PARAMETER));
				count++;
			} 
		}
		return parameters;
	}
	
	def getAbstraction(block b, function_designator f) {
		var name = f.name; 
		var parameters = getParameters(b, f);
		return new Procedure(name, parameters);	
	}
	
	def String getRealType(block b, String type) {
		var foundType = search(types.get(b), new Type(type));
		if (foundType != null) {
			return foundType.getRealType;
		}	
		return type;
	}
	
	def Type getType(block b, String type) {
		if (type == null) return null;
		if (type.length > 1 && type.substring(0, 1).equals(POINTER)) {
			return new ComposedType(getType(b, type.substring(1)), ComposedTypeKind.POINTER);
		} else if (type.length > 9 && type.substring(0, 9).equals(ARRAY)) {
			return new ComposedType(getType(b, type.substring(9)), ComposedTypeKind.ARRAY);
		}
		return new Type(type, false, getRealType(b, type));	
	}
	
	def Type getComposedType(block b, String type, ComposedTypeKind kind) {
		return new ComposedType(getType(b, type), kind);
	}
	
	def Type getType(block b, type t) {  
		var Type type = new Type(NIL);
		if (t.simple != null) {
			var simple = t.simple;
			if (simple.subrange != null || simple.enumerated != null) {
				type = new Type("enumerated", false, "...enumerated");
			} else if (simple.name != null) {
				if (search(types.get(b), new Type(simple.name)) == null) {
					insertError(t, UNDEFINED_TYPE_MESSAGE, ErrorType.UNDEFINED_TYPE, PascalPackage.Literals.TYPE__SIMPLE);
				} else {
					removeError(t, ErrorType.UNDEFINED_TYPE);
				} 
				type = getType(b, simple.name);
			} 
		} else if (t.structured != null) {
			var structured = t.structured;
			var unpacked = structured.type;
			if (unpacked.array != null) {
				type = new ComposedType(getType(b, unpacked.array.type), ComposedTypeKind.ARRAY);
			} else if (unpacked.record != null) {
				type = new Type(RECORD);
			} else if (unpacked.set != null) {
				type = getType(b, unpacked.set.type);
			} else if (unpacked.file != null) {
				type = getType(b, unpacked.file.type);
			}
		} else if (t.pointer != null) {
			type = new ComposedType(getType(b, t.pointer.type), ComposedTypeKind.POINTER);
		} 
		return type;
	}
	
	def Type getType(block b, parameter_type type) {
		var t = new Type(NIL);
		if (type.array != null) {
			var array = type.array;
			if (array.packed != null) {
				t = new ComposedType(getType(b, array.packed.name), ComposedTypeKind.ARRAY);
			} else if (array.unpacked != null) {
				t = new ComposedType(getType(b, array.unpacked.type), ComposedTypeKind.ARRAY);
			}
		} else if (type.name != null) {
			if (search(types.get(b), new Type(type.name)) == null) {
				insertError(type, UNDEFINED_TYPE_MESSAGE, ErrorType.UNDEFINED_TYPE, PascalPackage.Literals.PARAMETER_TYPE__NAME);
			} else {
				removeError(type, ErrorType.UNDEFINED_TYPE);
			}
			t = getType(b, type.name);
		}	
		return t;
	}
	
	def Type getType(block b, constant const) {
		var type = new Type(NIL);
		if (const.name != null) {
			var varFound = search(variables.get(b), new Variable(const.name));
			if (varFound != null) {
				type = varFound.varType;
			} 
		} else if (const.string != null) {
			type = new ComposedType(new Type(CHAR), ComposedTypeKind.ARRAY);
		} else if (const.boolLiteral != null) {
			type = new Type(BOOLEAN);
		} else if (const.nil != null) {
			type = new Type(NIL);
		} else if (const.number != null) {
			if (const.number.number.integer != null) {
				type = new Type(INTEGER);
			} else if (const.number.number.real != null) {
				type = new Type(REAL);
			} 
		}
		return type;
	}
	
	def Type getType(block b, variable v) {
		var type = new Type(NIL);
		var variableFound = search(variables.get(b), new Variable(v.name)); 
		if (variableFound != null) {
			type = variableFound.varType;
		} 
		return type;
	} 
	
	def Type getType(block b, function_designator f) {
		var type = new Type(NIL);
		var function = getAbstraction(b, f);
		var abstractionFound = searchWithTypeCoersion(abstractions.get(b), function);
		if (abstractionFound != null && abstractionFound.type == ElementType.FUNCTION) {
			var functionFound = abstractionFound as Function;
			type = functionFound.returnType;  
		}
		return type;
	}
	
	def Type getType(block b, factor f) {
		var type = new Type(NIL);
		if (f.variable != null) {
			var variableFound = search(variables.get(b), new Variable(f.variable.name));
			if (variableFound != null) {
				type = variableFound.varType;		
			}
		} else if (f.number != null) {
			var number = f.number.number;
			if (number.integer != null) {
				type = new Type(INTEGER);
			} else if (number.real != null) {
				type = new Type(REAL);
			}
		} else if (f.string != null) {
			type = new ComposedType(new Type(CHAR), ComposedTypeKind.ARRAY);
		} else if (f.set != null) {
			type = getType(b, f.set.expressions, true); 
		} else if (f.nil) {
			type = new Type(NIL);
		} else if (f.boolean != null || f.not != null) {
			type = new Type(BOOLEAN);
		} else if (f.function != null) {
			type = getType(b, f.function);
		} else if (f.expression != null) {
			type = getType(b, f.expression);
		}
		calculatedTypes.put(f, type);
		return type;
	}
	
	def Type getType(block b, term t) {
		var Type greatestType = null; 
		for (factor f : t.factors) {
			var type = getType(b, f);
			greatestType = TypeInferer.greater(type, greatestType);
		}
		calculatedTypes.put(t, greatestType);
		return greatestType;
	}
	
	def Type getType(block b, simple_expression expr) {
		var Type greatestType = null;
		for (EObject obj : expr.terms) {
			if (obj instanceof term) {
				var t = obj as term;
				var type = getType(b, t);
				greatestType = TypeInferer.greater(type, greatestType);
			} else {
				var n = obj as any_number;
				if (n.integer != null) {
					greatestType = TypeInferer.greater(new Type(INTEGER), greatestType);
				} else {
					greatestType = TypeInferer.greater(new Type(REAL), greatestType);
				}
			}
		}
		calculatedTypes.put(expr, greatestType);
		return greatestType;
	}
	
	def Type getType(block b, expression expr) {
		var t = new Type(NIL);
		if (expr.operators != null && !expr.operators.empty) {
			t = new Type(BOOLEAN);
		} else {
			var Type greatestType = null;
			for (simple_expression e : expr.expressions) {
				var type = getType(b, e);
				greatestType = TypeInferer.greater(type, greatestType);
			}
			t = greatestType;
		}
		calculatedTypes.put(expr, t);
		return t;
	}
	
	def Type getType(block b, expression_list expr, boolean isCohese) {
		var Type greatestType = null;
		var hasErrors = true;
		for (expression e : expr.expressions) {
			var type = getType(b, e);
			if (isCohese) {
				if (greatestType != null && TypeInferer.getTypeWeight(greatestType) < 0 && TypeInferer.getTypeWeight(type) >= 0 || 
					TypeInferer.getTypeWeight(type) < 0 && TypeInferer.getTypeWeight(greatestType) >= 0) {
					insertError(expr, CANNOT_CONVERT_MESSAGE + type +  TO_MESSAGE + greatestType + ".", ErrorType.TYPE_COHESION, PascalPackage.Literals.EXPRESSION_LIST__EXPRESSIONS);
					hasErrors = true;
				} 
			}
			greatestType = TypeInferer.greater(type, greatestType);
		}
		if (!hasErrors) {
			removeError(expr, ErrorType.TYPE_COHESION);
		}
		calculatedTypes.put(expr, greatestType);
		return greatestType;
	}
	
	//TODO: SECTION
	//-----------------------------------------------------------------
	// VALUE INFERER FUNCTIONS
	//-----------------------------------------------------------------
	
	def static Object getValue(number num) {
		if (num.number.integer != null) {
			return Integer.valueOf(num.number.integer);
		} else if (num.number.real != null) {
			return Double.valueOf(num.number.real);
		}
		return null;
	}
	
	def static boolean isNumeric(Object obj) {
		try {
			 Double.parseDouble(obj.toString); 
		} catch(Exception e) {
			return false;
		}
		return true;
	}
	
	def static Object getValue(constant const, Set<Variable> variables) {
		var Object value = null;
		if (const.name != null) {
			var variable = search(variables, new Variable(const.name));
			value = variable.getValue;
		} else if (const.number != null) {
			value = getValue(const.number);
		} else if (const.string != null) {
			value = const.string;
		} else if (const.boolLiteral != null) {
			value = Boolean.valueOf(const.boolLiteral);
		} else if (const.nil != null) {
			value = null;
		}
		if (const.opterator != null) {
			if (isNumeric(value) && const.opterator.equals("-")) {
				try {
					return - Integer.parseInt(value.toString);
				} catch(Exception e) {
					return - Double.parseDouble(value.toString);
				}
			}
		}
		return value;
	}
	
	//TODO: SECTION
	//-----------------------------------------------------------------
	// ELEMENTS CREATION FUNCTIONS
	//-----------------------------------------------------------------
	
	def <T extends Element> addElementToAbstraction(abstraction_declaration decl, T element, Map<block, Set<T>> container) {
		if (decl.block == null) {
			decl.block = PascalPackage.eINSTANCE.pascalFactory.createblock;
		}
		var subblock = decl.block;
		container.get(subblock).add(element);
	}
	 
	def <T extends Element> inheritElement(block b, T element, Map<block, Set<T>> container) {
		if (b.declaration.abstraction != null) {
			if (b.declaration.abstraction.procedures != null) {
				for (abstraction_declaration procedure : b.declaration.abstraction.procedures) {
					addElementToAbstraction(procedure, element, container);
				}
			}
			if (b.declaration.abstraction.functions != null) {
				for (abstraction_declaration function : b.declaration.abstraction.functions) {
					addElementToAbstraction(function, element, container);
				}
			}
		}
	} 
	 
	def <T extends Element> addElement(block b, T element, Map<block, Set<T>> container, EObject errorSection, EStructuralFeature errorFeature) {			
		var T elementFound;
		if (container == types) {
			var type = element as Type;
			elementFound = searchByName(types.get(b), type) as T;  
		} else {
			elementFound = search(container.get(b), element);
		}
		if (elementFound != null && !elementFound.isInherited) {
			if (element.type == elementFound.type) { 
				insertError(errorSection, element.type + " cannot be redeclared.", ErrorType.REDECLARATION, errorFeature); 
			} else { 
				if (elementFound.type == ElementType.FUNCTION_RETURN) {
					insertError(errorSection, "Identifier reserved for function return.", ErrorType.REDECLARATION, errorFeature);
				} else {
					insertError(errorSection, "Identifier is already being used by a " + elementFound.type.toString().toLowerCase() + ".", ErrorType.REDECLARATION, errorFeature);
				} 
			}
		} else { 
			removeError(errorSection, ErrorType.REDECLARATION);
			container.get(b).add(element);
			var inheritedElement = element.clone() as T;
			inheritedElement.inherited = true; 
			inheritElement(b, inheritedElement, container);
		}
	}
	
	def getParameters(block b, abstraction_heading heading, block abstractionBlock) {
		var parameters = new ArrayList<Variable>();
		if (heading.parameters != null) {
			var list = heading.parameters;
			if (list.parameters != null) {
				for (formal_parameter_section section : list.parameters) {
					if (section.variable != null) {
						var variable = section.variable;
						for (String varName : variable.identifiers.ids) { 
							var parameter = new Variable(varName, getType(b, section.variable.type), false, abstractionBlock, ElementType.PARAMETER);
							addElement(b, parameter, variables, variable, PascalPackage.Literals.VARIABLE_PARAMETER_SECTION__IDENTIFIERS);
							parameters.add(parameter);
						}
					} else if (section.value != null) {
						var value = section.value;
						for (String valName : value.identifiers.ids) {
							var parameter = new Variable(valName, getType(b, value.type), false, abstractionBlock, ElementType.PARAMETER);
							addElement(b, parameter, variables, value, PascalPackage.Literals.VALUE_PARAMETER_SECTION__IDENTIFIERS);
							parameters.add(parameter);
						}
					}
				}
			}
		}
		return parameters;
	}
	 
	def addAbstraction(block b, abstraction_declaration decl, abstraction_heading heading) {
		var name = heading.name;
		if (decl.block == null) {
			decl.block = PascalPackage.eINSTANCE.pascalFactory.createblock;
		}
		clear(decl.block, ElementType.PARAMETER, variables); 
		var parameters = getParameters(decl.block, heading, decl.block);
		var forward = decl.forward;
		var returnType = heading.resultType;
		if (returnType != null) {  
			if (search(types.get(b), new Type(returnType)) == null) {
				insertError(heading, UNDEFINED_TYPE_MESSAGE, ErrorType.UNDEFINED_TYPE, PascalPackage.Literals.ABSTRACTION_HEADING__RESULT_TYPE);
			} else {
				removeError(heading, ErrorType.UNDEFINED_TYPE);
			} 
			var function = new Function(name, forward, b, decl, parameters, forward, getType(b, returnType));
			addElement(b, function, abstractions, heading, PascalPackage.Literals.ABSTRACTION_HEADING__NAME); 
			var returnVariable = new Variable(name, getType(b, returnType), false, decl.block, ElementType.FUNCTION_RETURN);
			returnVariable.setOwningFunction(function);
			variables.get(decl.block).add(returnVariable);
		} else {
			addElement(b, new Procedure(name, forward, b, decl, parameters, forward), abstractions, heading, PascalPackage.Literals.ABSTRACTION_HEADING__NAME);
		}
	} 
	 
	//TODO: SECTION
	//-----------------------------------------------------------------
	// ELEMENTS VALIDATION FUNCTIONS
	//-----------------------------------------------------------------
	
	def checkAbstractionRedeclaration(block b) {
		if (b.declaration.abstraction != null) {
			clear(b, ElementType.FUNCTION, abstractions); 
			clear(b, ElementType.PROCEDURE, abstractions); 
			var abstraction = b.declaration.abstraction;
			if (abstraction.functions != null) {
				for (abstraction_declaration function : abstraction.functions) {
					addAbstraction(b, function, function.heading);
				}
			}
			if (abstraction.procedures != null) {
				for (abstraction_declaration procedure : abstraction.procedures) {
					addAbstraction(b, procedure, procedure.heading);
				}
			}
		}	
	}
	
	def checkTypeRedeclaration(block b) {
		clear(b, ElementType.TYPE, types);
		if (b.declaration.type_def != null) {
			for (type_definition t : b.declaration.type_def.types) {
				addElement(b, new Type(t.name, false, getType(b, t.type).getRealType), types, t, PascalPackage.Literals.TYPE_DEFINITION__NAME);
			}
		}	 
	}
	 
	def checkConstantRedeclaration(block b) {
		clear(b, ElementType.CONSTANT, variables);
		if (b.declaration.constant_def != null) {
			for (constant_definition const : b.declaration.constant_def.consts) {
				addElement(b, new Variable(const.name, getType(b, const.const), false, b, ElementType.CONSTANT, getValue(const.const, variables.get(b))), variables, const, PascalPackage.Literals.CONSTANT_DEFINITION__NAME);
			}
		}
	} 
	
	def checkVariableRedeclaration(block b) {		
		clear(b, ElementType.VARIABLE, variables);
		if (b.declaration.variable_decl != null) {
			for (variable_section section : b.declaration.variable_decl.sections) {
				for (String name : section.identifiers.names) { 
					var type = getType(b, section.type);
					addElement(b, new Variable(name, type, false, b, ElementType.VARIABLE), variables, section, PascalPackage.Literals.VARIABLE_SECTION__IDENTIFIERS);
				}
			}
		}
	}
	
	def boolean checkVariable(block b, variable v, boolean isAssignment) { 
		var isValid = true;
		if (v == null) return true;
		var searchVariable = search(variables.get(b), new Variable(v.name));
		if (searchVariable == null) {
			isValid = false;
			insertError(v, "Variable was not declared.", ErrorType.NOT_DECLARATION, PascalPackage.Literals.VARIABLE__NAME);
		} else {
			removeError(v, ErrorType.NOT_DECLARATION);
			if (isAssignment) {
				if (searchVariable.type == ElementType.CONSTANT) {
					isValid = false;
					insertError(v, "Constants cannot be assigned.", ErrorType.CONSTANT_ASSIGNMENT, PascalPackage.Literals.VARIABLE__NAME);
				} else {
					removeError(v, ErrorType.CONSTANT_ASSIGNMENT);
				}
			}
		}
		return isValid; 
	}
	
	def checkAbstraction(block b, Procedure proc, boolean functionOnly, EObject object, EStructuralFeature feature) {
		var abstractionFound = searchWithTypeCoersion(abstractions.get(b), proc);
		if (abstractionFound == null) {  
			for (Procedure p : abstractions.get(b)) {
				if (p.name.toLowerCase.equals(proc.name.toLowerCase)) {
					if (p.parameters.size != proc.parameters.size) {
						insertError(object, "Wrong number of arguments. It expected " + p.parameters.size + " received " + proc.parameters.size + " arguments.", ErrorType.NOT_DECLARATION, feature);
					} else {
						var it1 = p.parameters.iterator;
						var it2 = proc.parameters.iterator;
						while (it1.hasNext && it2.hasNext) {
							var type1 = it1.next;
							var type2 = it2.next; 
							if (!TypeInferer.areTypesCompatibles(type1.varType, type2.varType)) {
								insertError(object, "Incompatible types of arguments. It expected " + p.parameters + " received " + proc.parameters + ".", ErrorType.NOT_DECLARATION, feature);
								return;
							}	
						}
					}
					return;
				}
			}
			insertError(object, "Function was not declared.", ErrorType.NOT_DECLARATION, feature); 
		} else {
			removeError(object, ErrorType.NOT_DECLARATION);
			if (abstractionFound.type == ElementType.PROCEDURE && functionOnly) {
				insertError(object, "Procedures calls are not allowed in an expression.", ErrorType.FUNCTION_ONLY, feature);
			} else {
				removeError(object, ErrorType.FUNCTION_ONLY);
			}
		}
	} 
	
	
	def void checkAbstractionCall(block b, function_designator function, boolean functionOnly) {
		if (function.expressions != null) {
			for (expression e : function.expressions.expressions) {
				checkExpression(b, e);
			}
		}
		checkAbstraction(b, getAbstraction(b, function), functionOnly, function, PascalPackage.Literals.FUNCTION_DESIGNATOR__NAME); 
	}  
	
	def void checkFactor(block b, factor f) {
		if (f.variable != null) {
			checkVariable(b, f.variable, false);
			if (variables.containsKey(b)) {
				var v = search(variables.get(b), new Variable(f.variable.name));
				if (v != null && v.value == null) {
					insertError(f, "Variable not initialized.", ErrorType.NOT_INITIALIZED, PascalPackage.Literals.FACTOR__VARIABLE);
				} else {
					removeError(f, ErrorType.NOT_INITIALIZED);
				}		
			}
		} else if (f.function != null) {	
			checkAbstractionCall(b, f.function, true);
		} else if (f.not != null) {
			if (!getType(b, f.not).getRealType.toLowerCase.equals(BOOLEAN)) {
				insertError(f, CANNOT_CONVERT_MESSAGE + getType(b, f.not) + " to boolean.", ErrorType.TYPE_CONVERSION_ERROR, PascalPackage.Literals.FACTOR__NOT);
			} else {
				removeError(f, ErrorType.TYPE_CONVERSION_ERROR);
			}
			checkFactor(b, f.not); 
		} else if (f.expression != null) {
			checkExpression(b, f.expression);
		}
	}
	
	def void checkTerm(block b, term t) {
		var isBoolean = false;
		var isNumeric = false;
		if (t.operators != null) {
			for (String op : t.operators) {
				if (op.toLowerCase.equals("and")) {
					isBoolean = true;
				} else if (!isBoolean) {
					isNumeric = true;
				} else {
					insertError(t, "Invalid operator for boolean.", ErrorType.INVALID_OPERATOR, PascalPackage.Literals.TERM__OPERATORS);	
					return;
				}
			}
		}
		removeError(t, ErrorType.INVALID_OPERATOR);
		for (factor f : t.factors) {
			if (isBoolean) {
				if (!getType(b, f).getRealType.toLowerCase.equals(BOOLEAN)) {
					insertError(t, CANNOT_CONVERT_MESSAGE + getType(b, f) + " to boolean.", ErrorType.TYPE_CONVERSION_ERROR, PascalPackage.Literals.TERM__FACTORS);		
				} else {
					removeError(t, ErrorType.TYPE_CONVERSION_ERROR);
				}
			} else if (isNumeric) {
				if (TypeInferer.getTypeWeight(getType(b, f)) == -1) {
					insertError(t, CANNOT_CONVERT_MESSAGE + getType(b, f) + " to numeric.", ErrorType.TYPE_CONVERSION_ERROR, PascalPackage.Literals.TERM__FACTORS);		
				} else {
					removeError(t, ErrorType.TYPE_CONVERSION_ERROR);
				}
			}
			checkFactor(b, f);
		}
	}
	
	def void checkExpression(block b, expression expr) {
		for (simple_expression s : expr.expressions) {
			var isBoolean = false;
			var isNumeric = false;
			if (s.prefixOperator != null) {
				isNumeric = true;
			}
			if (s.operators != null) {
				for (String op : s.operators) {
					if (op.toLowerCase.equals("or")) {
						isBoolean = true;
					} else if (!isBoolean) {
						isNumeric = true;
					} else {
						insertError(s, "Invalid operator for boolean.", ErrorType.INVALID_OPERATOR, PascalPackage.Literals.SIMPLE_EXPRESSION__OPERATORS);	
						return;
					} 
				}
			}
			if (isNumeric && isBoolean) {
				insertError(s, "Only numeric types are allowed in this expression.", ErrorType.INVALID_OPERATOR, PascalPackage.Literals.SIMPLE_EXPRESSION__OPERATORS);	
			} else {
				removeError(s, ErrorType.INVALID_OPERATOR);
				for (EObject obj : s.terms) {
					if (obj instanceof term) {
						var t = obj as term;
						if (isBoolean) {
							if (!getType(b, t).getRealType.toLowerCase.equals(BOOLEAN)) {
								insertError(s, CANNOT_CONVERT_MESSAGE + getType(b, t) + " to boolean.", ErrorType.TYPE_CONVERSION_ERROR, PascalPackage.Literals.SIMPLE_EXPRESSION__TERMS);		
							} else {
								removeError(s, ErrorType.TYPE_CONVERSION_ERROR);
							}
						} else if (isNumeric) {
							if (TypeInferer.getTypeWeight(getType(b, t)) == -1) {
								insertError(s, CANNOT_CONVERT_MESSAGE + getType(b, t) + " to numeric.", ErrorType.TYPE_CONVERSION_ERROR, PascalPackage.Literals.SIMPLE_EXPRESSION__TERMS);
							} else {
								removeError(s, ErrorType.TYPE_CONVERSION_ERROR);
							}
						}
						checkTerm(b, t);
					} else if (!isNumeric) {
						insertError(s, "Only numeric types are allowed.", ErrorType.TYPE_CONVERSION_ERROR, PascalPackage.Literals.SIMPLE_EXPRESSION__TERMS);
					} else {
						removeError(s, ErrorType.TYPE_CONVERSION_ERROR);
					}
				}
			}
		}
	}
	
	def checkConstant(block b, constant const) {
		if (const.name != null) {
			var searchVariable = search(variables.get(b), new Variable(const.name));
			if (searchVariable == null) {
				insertError(const, "Constant was not declared.", ErrorType.NOT_DECLARATION, PascalPackage.Literals.CONSTANT__NAME);
			} else {
				removeError(const, ErrorType.NOT_DECLARATION);
				if (searchVariable.type != ElementType.CONSTANT) {
					insertError(const, "Only constants are allowed.", ErrorType.CONSTANT_ONLY, PascalPackage.Literals.CONSTANT__NAME);
				} else {
					removeError(const, ErrorType.CONSTANT_ONLY);
				}
				if (const.opterator != null && TypeInferer.getTypeWeight(searchVariable.varType) < 0) {
					insertError(const, "Variable is not a number.", ErrorType.TYPE_CONVERSION_ERROR, PascalPackage.Literals.CONSTANT__NAME);
				} else {
					removeError(const, ErrorType.TYPE_CONVERSION_ERROR);
				}
			}
		}
	}
	
	def void checkStatement(block b, statement stmt) {
		if (stmt.simple != null) {
			var simple = stmt.simple;
			if (simple.assignment != null) {
				if (checkVariable(b, simple.assignment.variable, true)) {
					var variableType = getType(b, simple.assignment.variable);
					var expressionType = getType(b, simple.assignment.expression);
					if (!TypeInferer.areTypesCompatibles(variableType, expressionType)) { 
						 insertError(simple.assignment, "Cannot convert type " + expressionType + TO_MESSAGE + variableType + ".", ErrorType.TYPE_CONVERSION_ERROR, PascalPackage.Literals.ASSIGNMENT_STATEMENT__EXPRESSION);
					} else {
						removeError(simple.assignment, ErrorType.TYPE_CONVERSION_ERROR);
					}
					checkExpression(b, simple.assignment.expression);
					var v = search(variables.get(b), new Variable(simple.assignment.variable.name));
					if (v != null) {
						v.setValue(0); 
					}
				}
			} else if (simple.function != null) {
				checkAbstractionCall(b, simple.function, false); 
			}
		} else if (stmt.structured != null) {
			var structured = stmt.structured;
			 if (structured.conditional != null) {
				var conditional = structured.conditional;
				if (conditional.ifStmt != null) {
					var ifStmt = conditional.ifStmt;
					checkExpression(b, ifStmt.expression);
					if (!getType(b, ifStmt.expression).getRealType.toLowerCase.equals(BOOLEAN)) {
						insertError(ifStmt, "Only booleans are allowed inside a condition.", ErrorType.TYPE_CONVERSION_ERROR, PascalPackage.Literals.IF_STATEMENT__EXPRESSION);
					} else {
						removeError(ifStmt.expression, ErrorType.TYPE_CONVERSION_ERROR);
					}
					checkStatement(b, ifStmt.ifStatement);
					if (ifStmt.elseStatement != null) {
						checkStatement(b, ifStmt.elseStatement);
					}
				} 
			}
		}
	}
	
		
	def checkStatements(block b, statement_sequence sequence) {
		for (statement stmt : sequence.statements) {
			checkStatement(b, stmt);
		}
	} 
	
	def checkBlock(block b) {
		checkStatements(b, b.statement.sequence);
	}
	
	
	//// Os checks estao aqui
	
	@Check
	/*
	 * Responsavel pelo preenchimento da tabela de simbolos pascal
	 */
	def preencherTabela(program prog) {
		var name = prog.heading.name;
		if (!tabela_de_simbolos.containsKey(name)) {
			tabela_de_simbolos.put(name, new HashMap<String, Object>());
			tabela_de_simbolos.get(name).put("variables", variables);
			tabela_de_simbolos.get(name).put("abstractions", abstractions);
			tabela_de_simbolos.get(name).put("types", types);
			tabela_de_simbolos.get(name).put("calculatedTypes", calculatedTypes);
		}	
	}
	
	@Check
	/*
	 * Inicia os checks basicos do sistema
	 * Os outros checks estao sendo chamados dentro destes testes
	 */
	def iniciarChecks(block b) {
		checkTypeRedeclaration(b);
		checkAbstractionRedeclaration(b);
		checkConstantRedeclaration(b);
		checkVariableRedeclaration(b);
		checkBlock(b); 
	}
	
	@Check
	def showError(EObject obj) {
		if (errorList.containsKey(obj)) {
			for (Error err : errorList.get(obj)) {
				error(err.message, obj, err.feature, -1);
			} 
			
		} 
	}
	
}	