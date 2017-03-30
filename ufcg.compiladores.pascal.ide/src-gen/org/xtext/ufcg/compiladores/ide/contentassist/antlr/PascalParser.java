/*
 * generated by Xtext 2.11.0
 */
package org.xtext.ufcg.compiladores.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ufcg.compiladores.ide.contentassist.antlr.internal.InternalPascalParser;
import org.xtext.ufcg.compiladores.services.PascalGrammarAccess;

public class PascalParser extends AbstractContentAssistParser {

	@Inject
	private PascalGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalPascalParser createParser() {
		InternalPascalParser result = new InternalPascalParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getProcedure_and_function_declaration_partAccess().getAlternatives_0(), "rule__Procedure_and_function_declaration_part__Alternatives_0");
					put(grammarAccess.getProcedure_declarationAccess().getAlternatives_2(), "rule__Procedure_declaration__Alternatives_2");
					put(grammarAccess.getFunction_declarationAccess().getAlternatives_2(), "rule__Function_declaration__Alternatives_2");
					put(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives(), "rule__Formal_parameter_section__Alternatives");
					put(grammarAccess.getParameter_typeAccess().getAlternatives(), "rule__Parameter_type__Alternatives");
					put(grammarAccess.getConformant_array_schemaAccess().getAlternatives(), "rule__Conformant_array_schema__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives_1(), "rule__Statement__Alternatives_1");
					put(grammarAccess.getSimple_statementAccess().getAlternatives(), "rule__Simple_statement__Alternatives");
					put(grammarAccess.getStructured_statementAccess().getAlternatives(), "rule__Structured_statement__Alternatives");
					put(grammarAccess.getRepetitive_statementAccess().getAlternatives(), "rule__Repetitive_statement__Alternatives");
					put(grammarAccess.getFor_statementAccess().getAlternatives_4(), "rule__For_statement__Alternatives_4");
					put(grammarAccess.getConditional_statementAccess().getAlternatives(), "rule__Conditional_statement__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives_1_0(), "rule__Expression__Alternatives_1_0");
					put(grammarAccess.getSimple_expressionAccess().getAlternatives_2(), "rule__Simple_expression__Alternatives_2");
					put(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0(), "rule__Simple_expression__Alternatives_2_0_0");
					put(grammarAccess.getTermAccess().getAlternatives_1_0(), "rule__Term__Alternatives_1_0");
					put(grammarAccess.getFactorAccess().getAlternatives(), "rule__Factor__Alternatives");
					put(grammarAccess.getRestoAccess().getAlternatives(), "rule__Resto__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getSimple_typeAccess().getAlternatives(), "rule__Simple_type__Alternatives");
					put(grammarAccess.getSubrange_typeAccess().getAlternatives(), "rule__Subrange_type__Alternatives");
					put(grammarAccess.getUnpacked_structured_typeAccess().getAlternatives(), "rule__Unpacked_structured_type__Alternatives");
					put(grammarAccess.getField_listAccess().getAlternatives_0(), "rule__Field_list__Alternatives_0");
					put(grammarAccess.getAny_numberAccess().getAlternatives(), "rule__Any_number__Alternatives");
					put(grammarAccess.getUnsigned_numberAccess().getAlternatives(), "rule__Unsigned_number__Alternatives");
					put(grammarAccess.getSigned_numberAccess().getAlternatives(), "rule__Signed_number__Alternatives");
					put(grammarAccess.getLabelAccess().getAlternatives(), "rule__Label__Alternatives");
					put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
					put(grammarAccess.getConstantAccess().getAlternatives_0_1(), "rule__Constant__Alternatives_0_1");
					put(grammarAccess.getAbstraction_declarationAccess().getAlternatives(), "rule__Abstraction_declaration__Alternatives");
					put(grammarAccess.getAbstraction_headingAccess().getAlternatives(), "rule__Abstraction_heading__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgram_headingAccess().getGroup(), "rule__Program_heading__Group__0");
					put(grammarAccess.getProgram_headingAccess().getGroup_2(), "rule__Program_heading__Group_2__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getDeclaration_partAccess().getGroup(), "rule__Declaration_part__Group__0");
					put(grammarAccess.getLabel_declaration_partAccess().getGroup(), "rule__Label_declaration_part__Group__0");
					put(grammarAccess.getLabel_declaration_partAccess().getGroup_2(), "rule__Label_declaration_part__Group_2__0");
					put(grammarAccess.getConstant_definition_partAccess().getGroup(), "rule__Constant_definition_part__Group__0");
					put(grammarAccess.getConstant_definition_partAccess().getGroup_1(), "rule__Constant_definition_part__Group_1__0");
					put(grammarAccess.getConstant_definitionAccess().getGroup(), "rule__Constant_definition__Group__0");
					put(grammarAccess.getType_definition_partAccess().getGroup(), "rule__Type_definition_part__Group__0");
					put(grammarAccess.getType_definition_partAccess().getGroup_1(), "rule__Type_definition_part__Group_1__0");
					put(grammarAccess.getType_definitionAccess().getGroup(), "rule__Type_definition__Group__0");
					put(grammarAccess.getVariable_declaration_partAccess().getGroup(), "rule__Variable_declaration_part__Group__0");
					put(grammarAccess.getVariable_declaration_partAccess().getGroup_3(), "rule__Variable_declaration_part__Group_3__0");
					put(grammarAccess.getVariable_sectionAccess().getGroup(), "rule__Variable_section__Group__0");
					put(grammarAccess.getProcedure_and_function_declaration_partAccess().getGroup(), "rule__Procedure_and_function_declaration_part__Group__0");
					put(grammarAccess.getProcedure_declarationAccess().getGroup(), "rule__Procedure_declaration__Group__0");
					put(grammarAccess.getFunction_declarationAccess().getGroup(), "rule__Function_declaration__Group__0");
					put(grammarAccess.getStatement_partAccess().getGroup(), "rule__Statement_part__Group__0");
					put(grammarAccess.getProcedure_headingAccess().getGroup(), "rule__Procedure_heading__Group__0");
					put(grammarAccess.getFunction_headingAccess().getGroup(), "rule__Function_heading__Group__0");
					put(grammarAccess.getFormal_parameter_listAccess().getGroup(), "rule__Formal_parameter_list__Group__0");
					put(grammarAccess.getFormal_parameter_listAccess().getGroup_2(), "rule__Formal_parameter_list__Group_2__0");
					put(grammarAccess.getValue_parameter_sectionAccess().getGroup(), "rule__Value_parameter_section__Group__0");
					put(grammarAccess.getVariable_parameter_sectionAccess().getGroup(), "rule__Variable_parameter_section__Group__0");
					put(grammarAccess.getPacked_conformant_array_schemaAccess().getGroup(), "rule__Packed_conformant_array_schema__Group__0");
					put(grammarAccess.getUnpacked_conformant_array_schemaAccess().getGroup(), "rule__Unpacked_conformant_array_schema__Group__0");
					put(grammarAccess.getUnpacked_conformant_array_schemaAccess().getGroup_3(), "rule__Unpacked_conformant_array_schema__Group_3__0");
					put(grammarAccess.getBound_specificationAccess().getGroup(), "rule__Bound_specification__Group__0");
					put(grammarAccess.getStatement_sequenceAccess().getGroup(), "rule__Statement_sequence__Group__0");
					put(grammarAccess.getStatement_sequenceAccess().getGroup_1(), "rule__Statement_sequence__Group_1__0");
					put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
					put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
					put(grammarAccess.getAssignment_statementAccess().getGroup(), "rule__Assignment_statement__Group__0");
					put(grammarAccess.getGoto_statementAccess().getGroup(), "rule__Goto_statement__Group__0");
					put(grammarAccess.getCompound_statementAccess().getGroup(), "rule__Compound_statement__Group__0");
					put(grammarAccess.getWhile_statementAccess().getGroup(), "rule__While_statement__Group__0");
					put(grammarAccess.getRepeat_statementAccess().getGroup(), "rule__Repeat_statement__Group__0");
					put(grammarAccess.getFor_statementAccess().getGroup(), "rule__For_statement__Group__0");
					put(grammarAccess.getIf_statementAccess().getGroup(), "rule__If_statement__Group__0");
					put(grammarAccess.getIf_statementAccess().getGroup_4(), "rule__If_statement__Group_4__0");
					put(grammarAccess.getCase_statementAccess().getGroup(), "rule__Case_statement__Group__0");
					put(grammarAccess.getCase_statementAccess().getGroup_4(), "rule__Case_statement__Group_4__0");
					put(grammarAccess.getCase_limbAccess().getGroup(), "rule__Case_limb__Group__0");
					put(grammarAccess.getCase_label_listAccess().getGroup(), "rule__Case_label_list__Group__0");
					put(grammarAccess.getCase_label_listAccess().getGroup_1(), "rule__Case_label_list__Group_1__0");
					put(grammarAccess.getWith_statementAccess().getGroup(), "rule__With_statement__Group__0");
					put(grammarAccess.getWith_statementAccess().getGroup_2(), "rule__With_statement__Group_2__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getSimple_expressionAccess().getGroup(), "rule__Simple_expression__Group__0");
					put(grammarAccess.getSimple_expressionAccess().getGroup_2_0(), "rule__Simple_expression__Group_2_0__0");
					put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
					put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
					put(grammarAccess.getFactorAccess().getGroup_6(), "rule__Factor__Group_6__0");
					put(grammarAccess.getFactorAccess().getGroup_7(), "rule__Factor__Group_7__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getRestoAccess().getGroup_0(), "rule__Resto__Group_0__0");
					put(grammarAccess.getRestoAccess().getGroup_1(), "rule__Resto__Group_1__0");
					put(grammarAccess.getRestoAccess().getGroup_2(), "rule__Resto__Group_2__0");
					put(grammarAccess.getSetAccess().getGroup(), "rule__Set__Group__0");
					put(grammarAccess.getExpression_listAccess().getGroup(), "rule__Expression_list__Group__0");
					put(grammarAccess.getExpression_listAccess().getGroup_1(), "rule__Expression_list__Group_1__0");
					put(grammarAccess.getFunction_designatorAccess().getGroup(), "rule__Function_designator__Group__0");
					put(grammarAccess.getEnumerated_typeAccess().getGroup(), "rule__Enumerated_type__Group__0");
					put(grammarAccess.getSubrange_typeAccess().getGroup_0(), "rule__Subrange_type__Group_0__0");
					put(grammarAccess.getSubrange_typeAccess().getGroup_1(), "rule__Subrange_type__Group_1__0");
					put(grammarAccess.getStructured_typeAccess().getGroup(), "rule__Structured_type__Group__0");
					put(grammarAccess.getArray_typeAccess().getGroup(), "rule__Array_type__Group__0");
					put(grammarAccess.getArray_typeAccess().getGroup_3(), "rule__Array_type__Group_3__0");
					put(grammarAccess.getRecord_typeAccess().getGroup(), "rule__Record_type__Group__0");
					put(grammarAccess.getSet_typeAccess().getGroup(), "rule__Set_type__Group__0");
					put(grammarAccess.getFile_typeAccess().getGroup(), "rule__File_type__Group__0");
					put(grammarAccess.getPointer_typeAccess().getGroup(), "rule__Pointer_type__Group__0");
					put(grammarAccess.getField_listAccess().getGroup(), "rule__Field_list__Group__0");
					put(grammarAccess.getField_listAccess().getGroup_0_0(), "rule__Field_list__Group_0_0__0");
					put(grammarAccess.getField_listAccess().getGroup_0_0_1(), "rule__Field_list__Group_0_0_1__0");
					put(grammarAccess.getFixed_partAccess().getGroup(), "rule__Fixed_part__Group__0");
					put(grammarAccess.getFixed_partAccess().getGroup_1(), "rule__Fixed_part__Group_1__0");
					put(grammarAccess.getRecord_sectionAccess().getGroup(), "rule__Record_section__Group__0");
					put(grammarAccess.getVariant_partAccess().getGroup(), "rule__Variant_part__Group__0");
					put(grammarAccess.getVariant_partAccess().getGroup_5(), "rule__Variant_part__Group_5__0");
					put(grammarAccess.getTag_fieldAccess().getGroup(), "rule__Tag_field__Group__0");
					put(grammarAccess.getVariantAccess().getGroup(), "rule__Variant__Group__0");
					put(grammarAccess.getVariable_identifier_listAccess().getGroup(), "rule__Variable_identifier_list__Group__0");
					put(grammarAccess.getVariable_identifier_listAccess().getGroup_1(), "rule__Variable_identifier_list__Group_1__0");
					put(grammarAccess.getIdentifier_listAccess().getGroup(), "rule__Identifier_list__Group__0");
					put(grammarAccess.getIdentifier_listAccess().getGroup_1(), "rule__Identifier_list__Group_1__0");
					put(grammarAccess.getConstantAccess().getGroup_0(), "rule__Constant__Group_0__0");
					put(grammarAccess.getProgramAccess().getHeadingAssignment_0(), "rule__Program__HeadingAssignment_0");
					put(grammarAccess.getProgramAccess().getBlockAssignment_1(), "rule__Program__BlockAssignment_1");
					put(grammarAccess.getProgram_headingAccess().getNameAssignment_1(), "rule__Program_heading__NameAssignment_1");
					put(grammarAccess.getProgram_headingAccess().getIdentifiersAssignment_2_1(), "rule__Program_heading__IdentifiersAssignment_2_1");
					put(grammarAccess.getBlockAccess().getDeclarationAssignment_0(), "rule__Block__DeclarationAssignment_0");
					put(grammarAccess.getBlockAccess().getStatementAssignment_1(), "rule__Block__StatementAssignment_1");
					put(grammarAccess.getDeclaration_partAccess().getLabel_declAssignment_0(), "rule__Declaration_part__Label_declAssignment_0");
					put(grammarAccess.getDeclaration_partAccess().getConstant_defAssignment_1(), "rule__Declaration_part__Constant_defAssignment_1");
					put(grammarAccess.getDeclaration_partAccess().getType_defAssignment_2(), "rule__Declaration_part__Type_defAssignment_2");
					put(grammarAccess.getDeclaration_partAccess().getVariable_declAssignment_3(), "rule__Declaration_part__Variable_declAssignment_3");
					put(grammarAccess.getDeclaration_partAccess().getAbstractionAssignment_4(), "rule__Declaration_part__AbstractionAssignment_4");
					put(grammarAccess.getLabel_declaration_partAccess().getLabelsAssignment_1(), "rule__Label_declaration_part__LabelsAssignment_1");
					put(grammarAccess.getLabel_declaration_partAccess().getLabelsAssignment_2_1(), "rule__Label_declaration_part__LabelsAssignment_2_1");
					put(grammarAccess.getConstant_definition_partAccess().getConstsAssignment_1_0(), "rule__Constant_definition_part__ConstsAssignment_1_0");
					put(grammarAccess.getConstant_definitionAccess().getNameAssignment_0(), "rule__Constant_definition__NameAssignment_0");
					put(grammarAccess.getConstant_definitionAccess().getConstAssignment_2(), "rule__Constant_definition__ConstAssignment_2");
					put(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0(), "rule__Type_definition_part__TypesAssignment_1_0");
					put(grammarAccess.getType_definitionAccess().getNameAssignment_0(), "rule__Type_definition__NameAssignment_0");
					put(grammarAccess.getType_definitionAccess().getTypeAssignment_2(), "rule__Type_definition__TypeAssignment_2");
					put(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_1(), "rule__Variable_declaration_part__SectionsAssignment_1");
					put(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_3_0(), "rule__Variable_declaration_part__SectionsAssignment_3_0");
					put(grammarAccess.getVariable_sectionAccess().getIdentifiersAssignment_0(), "rule__Variable_section__IdentifiersAssignment_0");
					put(grammarAccess.getVariable_sectionAccess().getTypeAssignment_2(), "rule__Variable_section__TypeAssignment_2");
					put(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresAssignment_0_0(), "rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0");
					put(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsAssignment_0_1(), "rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1");
					put(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0(), "rule__Procedure_declaration__HeadingAssignment_0");
					put(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2_0(), "rule__Procedure_declaration__BlockAssignment_2_0");
					put(grammarAccess.getProcedure_declarationAccess().getForwardAssignment_2_1(), "rule__Procedure_declaration__ForwardAssignment_2_1");
					put(grammarAccess.getFunction_declarationAccess().getHeadingAssignment_0(), "rule__Function_declaration__HeadingAssignment_0");
					put(grammarAccess.getFunction_declarationAccess().getBlockAssignment_2_0(), "rule__Function_declaration__BlockAssignment_2_0");
					put(grammarAccess.getFunction_declarationAccess().getForwardAssignment_2_1(), "rule__Function_declaration__ForwardAssignment_2_1");
					put(grammarAccess.getStatement_partAccess().getSequenceAssignment_1(), "rule__Statement_part__SequenceAssignment_1");
					put(grammarAccess.getProcedure_headingAccess().getNameAssignment_1(), "rule__Procedure_heading__NameAssignment_1");
					put(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2(), "rule__Procedure_heading__ParametersAssignment_2");
					put(grammarAccess.getFunction_headingAccess().getNameAssignment_1(), "rule__Function_heading__NameAssignment_1");
					put(grammarAccess.getFunction_headingAccess().getParametersAssignment_2(), "rule__Function_heading__ParametersAssignment_2");
					put(grammarAccess.getFunction_headingAccess().getResultTypeAssignment_4(), "rule__Function_heading__ResultTypeAssignment_4");
					put(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1(), "rule__Formal_parameter_list__ParametersAssignment_1");
					put(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1(), "rule__Formal_parameter_list__ParametersAssignment_2_1");
					put(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0(), "rule__Formal_parameter_section__ValueAssignment_0");
					put(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1(), "rule__Formal_parameter_section__VariableAssignment_1");
					put(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2(), "rule__Formal_parameter_section__ProcedureAssignment_2");
					put(grammarAccess.getFormal_parameter_sectionAccess().getFunctionAssignment_3(), "rule__Formal_parameter_section__FunctionAssignment_3");
					put(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0(), "rule__Value_parameter_section__IdentifiersAssignment_0");
					put(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2(), "rule__Value_parameter_section__TypeAssignment_2");
					put(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersAssignment_1(), "rule__Variable_parameter_section__IdentifiersAssignment_1");
					put(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3(), "rule__Variable_parameter_section__TypeAssignment_3");
					put(grammarAccess.getParameter_typeAccess().getNameAssignment_0(), "rule__Parameter_type__NameAssignment_0");
					put(grammarAccess.getParameter_typeAccess().getArrayAssignment_1(), "rule__Parameter_type__ArrayAssignment_1");
					put(grammarAccess.getConformant_array_schemaAccess().getPackedAssignment_0(), "rule__Conformant_array_schema__PackedAssignment_0");
					put(grammarAccess.getConformant_array_schemaAccess().getUnpackedAssignment_1(), "rule__Conformant_array_schema__UnpackedAssignment_1");
					put(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundAssignment_3(), "rule__Packed_conformant_array_schema__BoundAssignment_3");
					put(grammarAccess.getPacked_conformant_array_schemaAccess().getNameAssignment_6(), "rule__Packed_conformant_array_schema__NameAssignment_6");
					put(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsAssignment_2(), "rule__Unpacked_conformant_array_schema__BoundsAssignment_2");
					put(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsAssignment_3_1(), "rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1");
					put(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeAssignment_6(), "rule__Unpacked_conformant_array_schema__TypeAssignment_6");
					put(grammarAccess.getBound_specificationAccess().getInitAssignment_0(), "rule__Bound_specification__InitAssignment_0");
					put(grammarAccess.getBound_specificationAccess().getFinAssignment_2(), "rule__Bound_specification__FinAssignment_2");
					put(grammarAccess.getBound_specificationAccess().getNameAssignment_4(), "rule__Bound_specification__NameAssignment_4");
					put(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0(), "rule__Statement_sequence__StatementsAssignment_0");
					put(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1(), "rule__Statement_sequence__StatementsAssignment_1_1");
					put(grammarAccess.getStatementAccess().getLabelAssignment_0_0(), "rule__Statement__LabelAssignment_0_0");
					put(grammarAccess.getStatementAccess().getSimpleAssignment_1_0(), "rule__Statement__SimpleAssignment_1_0");
					put(grammarAccess.getStatementAccess().getStructuredAssignment_1_1(), "rule__Statement__StructuredAssignment_1_1");
					put(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0(), "rule__Simple_statement__AssignmentAssignment_0");
					put(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1(), "rule__Simple_statement__FunctionAssignment_1");
					put(grammarAccess.getSimple_statementAccess().getGotoAssignment_2(), "rule__Simple_statement__GotoAssignment_2");
					put(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0(), "rule__Assignment_statement__VariableAssignment_0");
					put(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2(), "rule__Assignment_statement__ExpressionAssignment_2");
					put(grammarAccess.getGoto_statementAccess().getLabelAssignment_1(), "rule__Goto_statement__LabelAssignment_1");
					put(grammarAccess.getStructured_statementAccess().getCompoundAssignment_0(), "rule__Structured_statement__CompoundAssignment_0");
					put(grammarAccess.getStructured_statementAccess().getRepetitiveAssignment_1(), "rule__Structured_statement__RepetitiveAssignment_1");
					put(grammarAccess.getStructured_statementAccess().getConditionalAssignment_2(), "rule__Structured_statement__ConditionalAssignment_2");
					put(grammarAccess.getStructured_statementAccess().getWith_sttAssignment_3(), "rule__Structured_statement__With_sttAssignment_3");
					put(grammarAccess.getCompound_statementAccess().getStmt_seqAssignment_1(), "rule__Compound_statement__Stmt_seqAssignment_1");
					put(grammarAccess.getRepetitive_statementAccess().getWhileAssignment_0(), "rule__Repetitive_statement__WhileAssignment_0");
					put(grammarAccess.getRepetitive_statementAccess().getRepeatAssignment_1(), "rule__Repetitive_statement__RepeatAssignment_1");
					put(grammarAccess.getRepetitive_statementAccess().getForAssignment_2(), "rule__Repetitive_statement__ForAssignment_2");
					put(grammarAccess.getWhile_statementAccess().getExpressionAssignment_1(), "rule__While_statement__ExpressionAssignment_1");
					put(grammarAccess.getWhile_statementAccess().getStatementAssignment_3(), "rule__While_statement__StatementAssignment_3");
					put(grammarAccess.getRepeat_statementAccess().getStmt_seqAssignment_1(), "rule__Repeat_statement__Stmt_seqAssignment_1");
					put(grammarAccess.getRepeat_statementAccess().getExpressionAssignment_3(), "rule__Repeat_statement__ExpressionAssignment_3");
					put(grammarAccess.getFor_statementAccess().getInitIDAssignment_1(), "rule__For_statement__InitIDAssignment_1");
					put(grammarAccess.getFor_statementAccess().getExpressionInitAssignment_3(), "rule__For_statement__ExpressionInitAssignment_3");
					put(grammarAccess.getFor_statementAccess().getExpressionFinAssignment_5(), "rule__For_statement__ExpressionFinAssignment_5");
					put(grammarAccess.getFor_statementAccess().getStmtAssignment_7(), "rule__For_statement__StmtAssignment_7");
					put(grammarAccess.getConditional_statementAccess().getIfStmtAssignment_0(), "rule__Conditional_statement__IfStmtAssignment_0");
					put(grammarAccess.getConditional_statementAccess().getCaseStmtAssignment_1(), "rule__Conditional_statement__CaseStmtAssignment_1");
					put(grammarAccess.getIf_statementAccess().getExpressionAssignment_1(), "rule__If_statement__ExpressionAssignment_1");
					put(grammarAccess.getIf_statementAccess().getIfStatementAssignment_3(), "rule__If_statement__IfStatementAssignment_3");
					put(grammarAccess.getIf_statementAccess().getElseStatementAssignment_4_1(), "rule__If_statement__ElseStatementAssignment_4_1");
					put(grammarAccess.getCase_statementAccess().getExpressionAssignment_1(), "rule__Case_statement__ExpressionAssignment_1");
					put(grammarAccess.getCase_statementAccess().getCase_limbsAssignment_3(), "rule__Case_statement__Case_limbsAssignment_3");
					put(grammarAccess.getCase_statementAccess().getCase_limbsAssignment_4_1(), "rule__Case_statement__Case_limbsAssignment_4_1");
					put(grammarAccess.getCase_limbAccess().getCase_listAssignment_0(), "rule__Case_limb__Case_listAssignment_0");
					put(grammarAccess.getCase_limbAccess().getStmtAssignment_2(), "rule__Case_limb__StmtAssignment_2");
					put(grammarAccess.getCase_label_listAccess().getConstantsAssignment_0(), "rule__Case_label_list__ConstantsAssignment_0");
					put(grammarAccess.getCase_label_listAccess().getConstantsAssignment_1_1(), "rule__Case_label_list__ConstantsAssignment_1_1");
					put(grammarAccess.getWith_statementAccess().getRecordAssignment_1(), "rule__With_statement__RecordAssignment_1");
					put(grammarAccess.getWith_statementAccess().getRecordsAssignment_2_1(), "rule__With_statement__RecordsAssignment_2_1");
					put(grammarAccess.getWith_statementAccess().getStmtAssignment_4(), "rule__With_statement__StmtAssignment_4");
					put(grammarAccess.getExpressionAccess().getExpressionsAssignment_0(), "rule__Expression__ExpressionsAssignment_0");
					put(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0(), "rule__Expression__OperatorsAssignment_1_0_0");
					put(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1(), "rule__Expression__OperatorsAssignment_1_0_1");
					put(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2(), "rule__Expression__OperatorsAssignment_1_0_2");
					put(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1(), "rule__Expression__ExpressionsAssignment_1_1");
					put(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0(), "rule__Simple_expression__PrefixOperatorAssignment_0");
					put(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1(), "rule__Simple_expression__TermsAssignment_1");
					put(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0(), "rule__Simple_expression__OperatorsAssignment_2_0_0_0");
					put(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1(), "rule__Simple_expression__OperatorsAssignment_2_0_0_1");
					put(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1(), "rule__Simple_expression__TermsAssignment_2_0_1");
					put(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1(), "rule__Simple_expression__TermsAssignment_2_1");
					put(grammarAccess.getTermAccess().getFactorsAssignment_0(), "rule__Term__FactorsAssignment_0");
					put(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0(), "rule__Term__OperatorsAssignment_1_0_0");
					put(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1(), "rule__Term__OperatorsAssignment_1_0_1");
					put(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2(), "rule__Term__OperatorsAssignment_1_0_2");
					put(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3(), "rule__Term__OperatorsAssignment_1_0_3");
					put(grammarAccess.getTermAccess().getFactorsAssignment_1_1(), "rule__Term__FactorsAssignment_1_1");
					put(grammarAccess.getFactorAccess().getVariableAssignment_0(), "rule__Factor__VariableAssignment_0");
					put(grammarAccess.getFactorAccess().getNumberAssignment_1(), "rule__Factor__NumberAssignment_1");
					put(grammarAccess.getFactorAccess().getStringAssignment_2(), "rule__Factor__StringAssignment_2");
					put(grammarAccess.getFactorAccess().getSetAssignment_3(), "rule__Factor__SetAssignment_3");
					put(grammarAccess.getFactorAccess().getNilAssignment_4(), "rule__Factor__NilAssignment_4");
					put(grammarAccess.getFactorAccess().getFunctionAssignment_5(), "rule__Factor__FunctionAssignment_5");
					put(grammarAccess.getFactorAccess().getExpressionAssignment_6_1(), "rule__Factor__ExpressionAssignment_6_1");
					put(grammarAccess.getFactorAccess().getNotAssignment_7_1(), "rule__Factor__NotAssignment_7_1");
					put(grammarAccess.getFactorAccess().getBooleanAssignment_8(), "rule__Factor__BooleanAssignment_8");
					put(grammarAccess.getFactorAccess().getBooleanAssignment_9(), "rule__Factor__BooleanAssignment_9");
					put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
					put(grammarAccess.getVariableAccess().getVariableAssignment_1(), "rule__Variable__VariableAssignment_1");
					put(grammarAccess.getRestoAccess().getExpressionsAssignment_0_1(), "rule__Resto__ExpressionsAssignment_0_1");
					put(grammarAccess.getRestoAccess().getArrayAssignment_0_3(), "rule__Resto__ArrayAssignment_0_3");
					put(grammarAccess.getRestoAccess().getAccessorAssignment_1_0(), "rule__Resto__AccessorAssignment_1_0");
					put(grammarAccess.getRestoAccess().getNameAssignment_1_1(), "rule__Resto__NameAssignment_1_1");
					put(grammarAccess.getRestoAccess().getVariableAssignment_1_2(), "rule__Resto__VariableAssignment_1_2");
					put(grammarAccess.getRestoAccess().getPointerAssignment_2_1(), "rule__Resto__PointerAssignment_2_1");
					put(grammarAccess.getSetAccess().getBracketsAssignment_0(), "rule__Set__BracketsAssignment_0");
					put(grammarAccess.getSetAccess().getExpressionsAssignment_1(), "rule__Set__ExpressionsAssignment_1");
					put(grammarAccess.getSetAccess().getBracketsAssignment_2(), "rule__Set__BracketsAssignment_2");
					put(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0(), "rule__Expression_list__ExpressionsAssignment_0");
					put(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1(), "rule__Expression_list__ExpressionsAssignment_1_1");
					put(grammarAccess.getFunction_designatorAccess().getNameAssignment_0(), "rule__Function_designator__NameAssignment_0");
					put(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2(), "rule__Function_designator__ExpressionsAssignment_2");
					put(grammarAccess.getTypeAccess().getSimpleAssignment_0(), "rule__Type__SimpleAssignment_0");
					put(grammarAccess.getTypeAccess().getStructuredAssignment_1(), "rule__Type__StructuredAssignment_1");
					put(grammarAccess.getTypeAccess().getPointerAssignment_2(), "rule__Type__PointerAssignment_2");
					put(grammarAccess.getSimple_typeAccess().getSubrangeAssignment_0(), "rule__Simple_type__SubrangeAssignment_0");
					put(grammarAccess.getSimple_typeAccess().getEnumeratedAssignment_1(), "rule__Simple_type__EnumeratedAssignment_1");
					put(grammarAccess.getSimple_typeAccess().getNameAssignment_2(), "rule__Simple_type__NameAssignment_2");
					put(grammarAccess.getEnumerated_typeAccess().getIdentifiersAssignment_1(), "rule__Enumerated_type__IdentifiersAssignment_1");
					put(grammarAccess.getSubrange_typeAccess().getInitialConstAssignment_0_0(), "rule__Subrange_type__InitialConstAssignment_0_0");
					put(grammarAccess.getSubrange_typeAccess().getFinalConstAssignment_0_2(), "rule__Subrange_type__FinalConstAssignment_0_2");
					put(grammarAccess.getSubrange_typeAccess().getSubrangeAssignment_1_0(), "rule__Subrange_type__SubrangeAssignment_1_0");
					put(grammarAccess.getSubrange_typeAccess().getConstAssignment_1_1(), "rule__Subrange_type__ConstAssignment_1_1");
					put(grammarAccess.getStructured_typeAccess().getPackedAssignment_0(), "rule__Structured_type__PackedAssignment_0");
					put(grammarAccess.getStructured_typeAccess().getTypeAssignment_1(), "rule__Structured_type__TypeAssignment_1");
					put(grammarAccess.getUnpacked_structured_typeAccess().getArrayAssignment_0(), "rule__Unpacked_structured_type__ArrayAssignment_0");
					put(grammarAccess.getUnpacked_structured_typeAccess().getRecordAssignment_1(), "rule__Unpacked_structured_type__RecordAssignment_1");
					put(grammarAccess.getUnpacked_structured_typeAccess().getSetAssignment_2(), "rule__Unpacked_structured_type__SetAssignment_2");
					put(grammarAccess.getUnpacked_structured_typeAccess().getFileAssignment_3(), "rule__Unpacked_structured_type__FileAssignment_3");
					put(grammarAccess.getArray_typeAccess().getIndexesAssignment_2(), "rule__Array_type__IndexesAssignment_2");
					put(grammarAccess.getArray_typeAccess().getIndexesAssignment_3_1(), "rule__Array_type__IndexesAssignment_3_1");
					put(grammarAccess.getArray_typeAccess().getTypeAssignment_6(), "rule__Array_type__TypeAssignment_6");
					put(grammarAccess.getRecord_typeAccess().getRecordAssignment_0(), "rule__Record_type__RecordAssignment_0");
					put(grammarAccess.getRecord_typeAccess().getFieldsAssignment_1(), "rule__Record_type__FieldsAssignment_1");
					put(grammarAccess.getRecord_typeAccess().getEndAssignment_2(), "rule__Record_type__EndAssignment_2");
					put(grammarAccess.getSet_typeAccess().getTypeAssignment_2(), "rule__Set_type__TypeAssignment_2");
					put(grammarAccess.getFile_typeAccess().getTypeAssignment_2(), "rule__File_type__TypeAssignment_2");
					put(grammarAccess.getPointer_typeAccess().getTypeAssignment_1(), "rule__Pointer_type__TypeAssignment_1");
					put(grammarAccess.getField_listAccess().getFixedAssignment_0_0_0(), "rule__Field_list__FixedAssignment_0_0_0");
					put(grammarAccess.getField_listAccess().getVariantsAssignment_0_0_1_1(), "rule__Field_list__VariantsAssignment_0_0_1_1");
					put(grammarAccess.getField_listAccess().getVariantsAssignment_0_1(), "rule__Field_list__VariantsAssignment_0_1");
					put(grammarAccess.getFixed_partAccess().getSectionsAssignment_0(), "rule__Fixed_part__SectionsAssignment_0");
					put(grammarAccess.getFixed_partAccess().getSectionsAssignment_1_1(), "rule__Fixed_part__SectionsAssignment_1_1");
					put(grammarAccess.getRecord_sectionAccess().getIdentifiersAssignment_0(), "rule__Record_section__IdentifiersAssignment_0");
					put(grammarAccess.getRecord_sectionAccess().getTypeAssignment_2(), "rule__Record_section__TypeAssignment_2");
					put(grammarAccess.getVariant_partAccess().getTagAssignment_1(), "rule__Variant_part__TagAssignment_1");
					put(grammarAccess.getVariant_partAccess().getNameAssignment_2(), "rule__Variant_part__NameAssignment_2");
					put(grammarAccess.getVariant_partAccess().getVariantsAssignment_4(), "rule__Variant_part__VariantsAssignment_4");
					put(grammarAccess.getVariant_partAccess().getVariantsAssignment_5_1(), "rule__Variant_part__VariantsAssignment_5_1");
					put(grammarAccess.getTag_fieldAccess().getNameAssignment_0(), "rule__Tag_field__NameAssignment_0");
					put(grammarAccess.getVariantAccess().getLabelsAssignment_0(), "rule__Variant__LabelsAssignment_0");
					put(grammarAccess.getVariantAccess().getFieldsAssignment_3(), "rule__Variant__FieldsAssignment_3");
					put(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_0(), "rule__Variable_identifier_list__NamesAssignment_0");
					put(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_1_1(), "rule__Variable_identifier_list__NamesAssignment_1_1");
					put(grammarAccess.getIdentifier_listAccess().getIdsAssignment_0(), "rule__Identifier_list__IdsAssignment_0");
					put(grammarAccess.getIdentifier_listAccess().getIdsAssignment_1_1(), "rule__Identifier_list__IdsAssignment_1_1");
					put(grammarAccess.getNumberAccess().getNumberAssignment(), "rule__Number__NumberAssignment");
					put(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment_0(), "rule__Unsigned_number__IntegerAssignment_0");
					put(grammarAccess.getUnsigned_numberAccess().getRealAssignment_1(), "rule__Unsigned_number__RealAssignment_1");
					put(grammarAccess.getSigned_numberAccess().getIntegerAssignment_0(), "rule__Signed_number__IntegerAssignment_0");
					put(grammarAccess.getSigned_numberAccess().getRealAssignment_1(), "rule__Signed_number__RealAssignment_1");
					put(grammarAccess.getLabelAccess().getNumberAssignment_0(), "rule__Label__NumberAssignment_0");
					put(grammarAccess.getLabelAccess().getNumberAssignment_1(), "rule__Label__NumberAssignment_1");
					put(grammarAccess.getConstantAccess().getOpteratorAssignment_0_0(), "rule__Constant__OpteratorAssignment_0_0");
					put(grammarAccess.getConstantAccess().getNameAssignment_0_1_0(), "rule__Constant__NameAssignment_0_1_0");
					put(grammarAccess.getConstantAccess().getNumberAssignment_0_1_1(), "rule__Constant__NumberAssignment_0_1_1");
					put(grammarAccess.getConstantAccess().getStringAssignment_1(), "rule__Constant__StringAssignment_1");
					put(grammarAccess.getConstantAccess().getBoolLiteralAssignment_2(), "rule__Constant__BoolLiteralAssignment_2");
					put(grammarAccess.getConstantAccess().getBoolLiteralAssignment_3(), "rule__Constant__BoolLiteralAssignment_3");
					put(grammarAccess.getConstantAccess().getNilAssignment_4(), "rule__Constant__NilAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PascalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
