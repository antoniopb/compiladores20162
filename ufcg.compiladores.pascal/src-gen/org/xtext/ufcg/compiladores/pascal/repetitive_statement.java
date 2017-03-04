/**
 * generated by Xtext 2.11.0
 */
package org.xtext.ufcg.compiladores.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>repetitive statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.repetitive_statement#getWhile <em>While</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.repetitive_statement#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.repetitive_statement#getFor <em>For</em>}</li>
 * </ul>
 *
 * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getrepetitive_statement()
 * @model
 * @generated
 */
public interface repetitive_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>While</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While</em>' containment reference.
   * @see #setWhile(while_statement)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getrepetitive_statement_While()
   * @model containment="true"
   * @generated
   */
  while_statement getWhile();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.repetitive_statement#getWhile <em>While</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While</em>' containment reference.
   * @see #getWhile()
   * @generated
   */
  void setWhile(while_statement value);

  /**
   * Returns the value of the '<em><b>Repeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeat</em>' containment reference.
   * @see #setRepeat(repeat_statement)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getrepetitive_statement_Repeat()
   * @model containment="true"
   * @generated
   */
  repeat_statement getRepeat();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.repetitive_statement#getRepeat <em>Repeat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeat</em>' containment reference.
   * @see #getRepeat()
   * @generated
   */
  void setRepeat(repeat_statement value);

  /**
   * Returns the value of the '<em><b>For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For</em>' containment reference.
   * @see #setFor(for_statement)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getrepetitive_statement_For()
   * @model containment="true"
   * @generated
   */
  for_statement getFor();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.repetitive_statement#getFor <em>For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For</em>' containment reference.
   * @see #getFor()
   * @generated
   */
  void setFor(for_statement value);

} // repetitive_statement