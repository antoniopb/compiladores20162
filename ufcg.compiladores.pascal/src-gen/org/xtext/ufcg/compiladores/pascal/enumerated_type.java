/**
 * generated by Xtext 2.11.0
 */
package org.xtext.ufcg.compiladores.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enumerated type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.enumerated_type#getIdentifiers <em>Identifiers</em>}</li>
 * </ul>
 *
 * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getenumerated_type()
 * @model
 * @generated
 */
public interface enumerated_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifiers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifiers</em>' containment reference.
   * @see #setIdentifiers(identifier_list)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getenumerated_type_Identifiers()
   * @model containment="true"
   * @generated
   */
  identifier_list getIdentifiers();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.enumerated_type#getIdentifiers <em>Identifiers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifiers</em>' containment reference.
   * @see #getIdentifiers()
   * @generated
   */
  void setIdentifiers(identifier_list value);

} // enumerated_type
