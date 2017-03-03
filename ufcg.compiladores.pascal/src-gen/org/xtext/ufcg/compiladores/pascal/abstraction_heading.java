/**
 * generated by Xtext 2.11.0.RC2
 */
package org.xtext.ufcg.compiladores.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>abstraction heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.abstraction_heading#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.abstraction_heading#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.abstraction_heading#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getabstraction_heading()
 * @model
 * @generated
 */
public interface abstraction_heading extends abstraction_declaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getabstraction_heading_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.abstraction_heading#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(formal_parameter_list)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getabstraction_heading_Parameters()
   * @model containment="true"
   * @generated
   */
  formal_parameter_list getParameters();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.abstraction_heading#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(formal_parameter_list value);

  /**
   * Returns the value of the '<em><b>Result Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Type</em>' attribute.
   * @see #setResultType(String)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getabstraction_heading_ResultType()
   * @model
   * @generated
   */
  String getResultType();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.abstraction_heading#getResultType <em>Result Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Type</em>' attribute.
   * @see #getResultType()
   * @generated
   */
  void setResultType(String value);

} // abstraction_heading
