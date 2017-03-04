/**
 * generated by Xtext 2.11.0
 */
package org.xtext.ufcg.compiladores.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>record type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.record_type#getRecord <em>Record</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.record_type#getFields <em>Fields</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.record_type#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getrecord_type()
 * @model
 * @generated
 */
public interface record_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Record</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record</em>' attribute.
   * @see #setRecord(String)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getrecord_type_Record()
   * @model
   * @generated
   */
  String getRecord();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.record_type#getRecord <em>Record</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' attribute.
   * @see #getRecord()
   * @generated
   */
  void setRecord(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference.
   * @see #setFields(field_list)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getrecord_type_Fields()
   * @model containment="true"
   * @generated
   */
  field_list getFields();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.record_type#getFields <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fields</em>' containment reference.
   * @see #getFields()
   * @generated
   */
  void setFields(field_list value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getrecord_type_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.record_type#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

} // record_type
