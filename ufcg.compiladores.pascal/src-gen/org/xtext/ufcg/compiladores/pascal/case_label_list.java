/**
 * generated by Xtext 2.11.0
 */
package org.xtext.ufcg.compiladores.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>case label list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.case_label_list#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getcase_label_list()
 * @model
 * @generated
 */
public interface case_label_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ufcg.compiladores.pascal.constant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getcase_label_list_Constants()
   * @model containment="true"
   * @generated
   */
  EList<constant> getConstants();

} // case_label_list
