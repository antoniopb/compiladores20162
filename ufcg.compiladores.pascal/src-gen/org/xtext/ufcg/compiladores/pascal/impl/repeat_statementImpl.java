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
import org.xtext.ufcg.compiladores.pascal.expression;
import org.xtext.ufcg.compiladores.pascal.repeat_statement;
import org.xtext.ufcg.compiladores.pascal.statement_sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>repeat statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.repeat_statementImpl#getStmt_seq <em>Stmt seq</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.repeat_statementImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class repeat_statementImpl extends MinimalEObjectImpl.Container implements repeat_statement
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
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected repeat_statementImpl()
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
    return PascalPackage.Literals.REPEAT_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPEAT_STATEMENT__STMT_SEQ, oldStmt_seq, newStmt_seq);
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
        msgs = ((InternalEObject)stmt_seq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPEAT_STATEMENT__STMT_SEQ, null, msgs);
      if (newStmt_seq != null)
        msgs = ((InternalEObject)newStmt_seq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPEAT_STATEMENT__STMT_SEQ, null, msgs);
      msgs = basicSetStmt_seq(newStmt_seq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPEAT_STATEMENT__STMT_SEQ, newStmt_seq, newStmt_seq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPEAT_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPEAT_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPEAT_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPEAT_STATEMENT__EXPRESSION, newExpression, newExpression));
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
      case PascalPackage.REPEAT_STATEMENT__STMT_SEQ:
        return basicSetStmt_seq(null, msgs);
      case PascalPackage.REPEAT_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case PascalPackage.REPEAT_STATEMENT__STMT_SEQ:
        return getStmt_seq();
      case PascalPackage.REPEAT_STATEMENT__EXPRESSION:
        return getExpression();
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
      case PascalPackage.REPEAT_STATEMENT__STMT_SEQ:
        setStmt_seq((statement_sequence)newValue);
        return;
      case PascalPackage.REPEAT_STATEMENT__EXPRESSION:
        setExpression((expression)newValue);
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
      case PascalPackage.REPEAT_STATEMENT__STMT_SEQ:
        setStmt_seq((statement_sequence)null);
        return;
      case PascalPackage.REPEAT_STATEMENT__EXPRESSION:
        setExpression((expression)null);
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
      case PascalPackage.REPEAT_STATEMENT__STMT_SEQ:
        return stmt_seq != null;
      case PascalPackage.REPEAT_STATEMENT__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //repeat_statementImpl
