/**
 * generated by Xtext 2.11.0
 */
package org.xtext.ufcg.compiladores.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.ufcg.compiladores.pascal.PascalPackage;
import org.xtext.ufcg.compiladores.pascal.statement;
import org.xtext.ufcg.compiladores.pascal.with_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>with statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.with_statementImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.with_statementImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.with_statementImpl#getStmt <em>Stmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class with_statementImpl extends MinimalEObjectImpl.Container implements with_statement
{
  /**
   * The default value of the '{@link #getRecord() <em>Record</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecord()
   * @generated
   * @ordered
   */
  protected static final String RECORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRecord() <em>Record</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecord()
   * @generated
   * @ordered
   */
  protected String record = RECORD_EDEFAULT;

  /**
   * The cached value of the '{@link #getRecords() <em>Records</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecords()
   * @generated
   * @ordered
   */
  protected EList<String> records;

  /**
   * The cached value of the '{@link #getStmt() <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt()
   * @generated
   * @ordered
   */
  protected statement stmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected with_statementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.WITH_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRecord()
  {
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecord(String newRecord)
  {
    String oldRecord = record;
    record = newRecord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.WITH_STATEMENT__RECORD, oldRecord, record));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRecords()
  {
    if (records == null)
    {
      records = new EDataTypeEList<String>(String.class, this, PascalPackage.WITH_STATEMENT__RECORDS);
    }
    return records;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getStmt()
  {
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmt(statement newStmt, NotificationChain msgs)
  {
    statement oldStmt = stmt;
    stmt = newStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.WITH_STATEMENT__STMT, oldStmt, newStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmt(statement newStmt)
  {
    if (newStmt != stmt)
    {
      NotificationChain msgs = null;
      if (stmt != null)
        msgs = ((InternalEObject)stmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.WITH_STATEMENT__STMT, null, msgs);
      if (newStmt != null)
        msgs = ((InternalEObject)newStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.WITH_STATEMENT__STMT, null, msgs);
      msgs = basicSetStmt(newStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.WITH_STATEMENT__STMT, newStmt, newStmt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.WITH_STATEMENT__STMT:
        return basicSetStmt(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.WITH_STATEMENT__RECORD:
        return getRecord();
      case PascalPackage.WITH_STATEMENT__RECORDS:
        return getRecords();
      case PascalPackage.WITH_STATEMENT__STMT:
        return getStmt();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.WITH_STATEMENT__RECORD:
        setRecord((String)newValue);
        return;
      case PascalPackage.WITH_STATEMENT__RECORDS:
        getRecords().clear();
        getRecords().addAll((Collection<? extends String>)newValue);
        return;
      case PascalPackage.WITH_STATEMENT__STMT:
        setStmt((statement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.WITH_STATEMENT__RECORD:
        setRecord(RECORD_EDEFAULT);
        return;
      case PascalPackage.WITH_STATEMENT__RECORDS:
        getRecords().clear();
        return;
      case PascalPackage.WITH_STATEMENT__STMT:
        setStmt((statement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.WITH_STATEMENT__RECORD:
        return RECORD_EDEFAULT == null ? record != null : !RECORD_EDEFAULT.equals(record);
      case PascalPackage.WITH_STATEMENT__RECORDS:
        return records != null && !records.isEmpty();
      case PascalPackage.WITH_STATEMENT__STMT:
        return stmt != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (record: ");
    result.append(record);
    result.append(", records: ");
    result.append(records);
    result.append(')');
    return result.toString();
  }

} //with_statementImpl
