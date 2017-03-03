/**
 * generated by Xtext 2.11.0.RC2
 */
package org.xtext.ufcg.compiladores.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable identifier list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.variable_identifier_list#getNames <em>Names</em>}</li>
 * </ul>
 *
 * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getvariable_identifier_list()
 * @model
 * @generated
 */
public interface variable_identifier_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getvariable_identifier_list_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

} // variable_identifier_list
