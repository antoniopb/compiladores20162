/**
 * generated by Xtext 2.11.0
 */
package org.xtext.ufcg.compiladores.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ufcg.compiladores.pascal.PascalPackage;
import org.xtext.ufcg.compiladores.pascal.compound_statement;
import org.xtext.ufcg.compiladores.pascal.statement_sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>compound statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.compound_statementImpl#getStmt_seq <em>Stmt seq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class compound_statementImpl extends MinimalEObjectImpl.Container implements compound_statement
{
  /**
   * The cached value of the '{@link #getStmt_seq() <em>Stmt seq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmt_seq()
   * @generated
   * @ordered
   */
  protected statement_sequence stmt_seq;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected compound_statementImpl()
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
    return PascalPackage.Literals.COMPOUND_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_sequence getStmt_seq()
  {
    return stmt_seq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmt_seq(statement_sequence newStmt_seq, NotificationChain msgs)
  {
    statement_sequence oldStmt_seq = stmt_seq;
    stmt_seq = newStmt_seq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.COMPOUND_STATEMENT__STMT_SEQ, oldStmt_seq, newStmt_seq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStmt_seq(statement_sequence newStmt_seq)
  {
    if (newStmt_seq != stmt_seq)
    {
      NotificationChain msgs = null;
      if (stmt_seq != null)
        msgs = ((InternalEObject)stmt_seq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.COMPOUND_STATEMENT__STMT_SEQ, null, msgs);
      if (newStmt_seq != null)
        msgs = ((InternalEObject)newStmt_seq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.COMPOUND_STATEMENT__STMT_SEQ, null, msgs);
      msgs = basicSetStmt_seq(newStmt_seq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.COMPOUND_STATEMENT__STMT_SEQ, newStmt_seq, newStmt_seq));
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
      case PascalPackage.COMPOUND_STATEMENT__STMT_SEQ:
        return basicSetStmt_seq(null, msgs);
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
      case PascalPackage.COMPOUND_STATEMENT__STMT_SEQ:
        return getStmt_seq();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.COMPOUND_STATEMENT__STMT_SEQ:
        setStmt_seq((statement_sequence)newValue);
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
      case PascalPackage.COMPOUND_STATEMENT__STMT_SEQ:
        setStmt_seq((statement_sequence)null);
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
      case PascalPackage.COMPOUND_STATEMENT__STMT_SEQ:
        return stmt_seq != null;
    }
    return super.eIsSet(featureID);
  }

} //compound_statementImpl