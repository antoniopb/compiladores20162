/**
 * generated by Xtext 2.11.0.RC2
 */
package org.xtext.ufcg.compiladores.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unpacked structured type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.unpacked_structured_type#getArray <em>Array</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.unpacked_structured_type#getRecord <em>Record</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.unpacked_structured_type#getSet <em>Set</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.unpacked_structured_type#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getunpacked_structured_type()
 * @model
 * @generated
 */
public interface unpacked_structured_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(array_type)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getunpacked_structured_type_Array()
   * @model containment="true"
   * @generated
   */
  array_type getArray();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.unpacked_structured_type#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(array_type value);

  /**
   * Returns the value of the '<em><b>Record</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record</em>' containment reference.
   * @see #setRecord(record_type)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getunpacked_structured_type_Record()
   * @model containment="true"
   * @generated
   */
  record_type getRecord();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.unpacked_structured_type#getRecord <em>Record</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' containment reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(record_type value);

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(set_type)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getunpacked_structured_type_Set()
   * @model containment="true"
   * @generated
   */
  set_type getSet();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.unpacked_structured_type#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(set_type value);

  /**
   * Returns the value of the '<em><b>File</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' containment reference.
   * @see #setFile(file_type)
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getunpacked_structured_type_File()
   * @model containment="true"
   * @generated
   */
  file_type getFile();

  /**
   * Sets the value of the '{@link org.xtext.ufcg.compiladores.pascal.unpacked_structured_type#getFile <em>File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' containment reference.
   * @see #getFile()
   * @generated
   */
  void setFile(file_type value);

} // unpacked_structured_type
