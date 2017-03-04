/**
 * generated by Xtext 2.11.0
 */
package org.xtext.ufcg.compiladores.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ufcg.compiladores.pascal.PascalPackage;
import org.xtext.ufcg.compiladores.pascal.expression;
import org.xtext.ufcg.compiladores.pascal.simple_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.expressionImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.expressionImpl#getOperators <em>Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class expressionImpl extends MinimalEObjectImpl.Container implements expression
{
  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<simple_expression> expressions;

  /**
   * The cached value of the '{@link #getOperators() <em>Operators</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
  protected EList<String> operators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expressionImpl()
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
    return PascalPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<simple_expression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<simple_expression>(simple_expression.class, this, PascalPackage.EXPRESSION__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOperators()
  {
    if (operators == null)
    {
      operators = new EDataTypeEList<String>(String.class, this, PascalPackage.EXPRESSION__OPERATORS);
    }
    return operators;
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
      case PascalPackage.EXPRESSION__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.EXPRESSION__EXPRESSIONS:
        return getExpressions();
      case PascalPackage.EXPRESSION__OPERATORS:
        return getOperators();
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
      case PascalPackage.EXPRESSION__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends simple_expression>)newValue);
        return;
      case PascalPackage.EXPRESSION__OPERATORS:
        getOperators().clear();
        getOperators().addAll((Collection<? extends String>)newValue);
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
      case PascalPackage.EXPRESSION__EXPRESSIONS:
        getExpressions().clear();
        return;
      case PascalPackage.EXPRESSION__OPERATORS:
        getOperators().clear();
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
      case PascalPackage.EXPRESSION__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
      case PascalPackage.EXPRESSION__OPERATORS:
        return operators != null && !operators.isEmpty();
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
    result.append(" (operators: ");
    result.append(operators);
    result.append(')');
    return result.toString();
  }

} //expressionImpl
