/**
 * generated by Xtext 2.11.0.RC2
 */
package org.xtext.ufcg.compiladores.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ufcg.compiladores.pascal.PascalPackage;
import org.xtext.ufcg.compiladores.pascal.simple_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.simple_expressionImpl#getPrefixOperator <em>Prefix Operator</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.simple_expressionImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.simple_expressionImpl#getOperators <em>Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class simple_expressionImpl extends MinimalEObjectImpl.Container implements simple_expression
{
  /**
   * The default value of the '{@link #getPrefixOperator() <em>Prefix Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixOperator()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefixOperator() <em>Prefix Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefixOperator()
   * @generated
   * @ordered
   */
  protected String prefixOperator = PREFIX_OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected EList<EObject> terms;

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
  protected simple_expressionImpl()
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
    return PascalPackage.Literals.SIMPLE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrefixOperator()
  {
    return prefixOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefixOperator(String newPrefixOperator)
  {
    String oldPrefixOperator = prefixOperator;
    prefixOperator = newPrefixOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__PREFIX_OPERATOR, oldPrefixOperator, prefixOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getTerms()
  {
    if (terms == null)
    {
      terms = new EObjectContainmentEList<EObject>(EObject.class, this, PascalPackage.SIMPLE_EXPRESSION__TERMS);
    }
    return terms;
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
      operators = new EDataTypeEList<String>(String.class, this, PascalPackage.SIMPLE_EXPRESSION__OPERATORS);
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
      case PascalPackage.SIMPLE_EXPRESSION__TERMS:
        return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.SIMPLE_EXPRESSION__PREFIX_OPERATOR:
        return getPrefixOperator();
      case PascalPackage.SIMPLE_EXPRESSION__TERMS:
        return getTerms();
      case PascalPackage.SIMPLE_EXPRESSION__OPERATORS:
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
      case PascalPackage.SIMPLE_EXPRESSION__PREFIX_OPERATOR:
        setPrefixOperator((String)newValue);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__TERMS:
        getTerms().clear();
        getTerms().addAll((Collection<? extends EObject>)newValue);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__OPERATORS:
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
      case PascalPackage.SIMPLE_EXPRESSION__PREFIX_OPERATOR:
        setPrefixOperator(PREFIX_OPERATOR_EDEFAULT);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__TERMS:
        getTerms().clear();
        return;
      case PascalPackage.SIMPLE_EXPRESSION__OPERATORS:
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
      case PascalPackage.SIMPLE_EXPRESSION__PREFIX_OPERATOR:
        return PREFIX_OPERATOR_EDEFAULT == null ? prefixOperator != null : !PREFIX_OPERATOR_EDEFAULT.equals(prefixOperator);
      case PascalPackage.SIMPLE_EXPRESSION__TERMS:
        return terms != null && !terms.isEmpty();
      case PascalPackage.SIMPLE_EXPRESSION__OPERATORS:
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
    result.append(" (prefixOperator: ");
    result.append(prefixOperator);
    result.append(", operators: ");
    result.append(operators);
    result.append(')');
    return result.toString();
  }

} //simple_expressionImpl
