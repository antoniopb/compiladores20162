/**
 * generated by Xtext 2.11.0
 */
package org.xtext.ufcg.compiladores.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ufcg.compiladores.pascal.PascalPackage;
import org.xtext.ufcg.compiladores.pascal.abstraction_heading;
import org.xtext.ufcg.compiladores.pascal.formal_parameter_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>abstraction heading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.abstraction_headingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.abstraction_headingImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.abstraction_headingImpl#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class abstraction_headingImpl extends abstraction_declarationImpl implements abstraction_heading
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected formal_parameter_list parameters;

  /**
   * The default value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultType()
   * @generated
   * @ordered
   */
  protected static final String RESULT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultType()
   * @generated
   * @ordered
   */
  protected String resultType = RESULT_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected abstraction_headingImpl()
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
    return PascalPackage.Literals.ABSTRACTION_HEADING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.ABSTRACTION_HEADING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formal_parameter_list getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(formal_parameter_list newParameters, NotificationChain msgs)
  {
    formal_parameter_list oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.ABSTRACTION_HEADING__PARAMETERS, oldParameters, newParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(formal_parameter_list newParameters)
  {
    if (newParameters != parameters)
    {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ABSTRACTION_HEADING__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ABSTRACTION_HEADING__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.ABSTRACTION_HEADING__PARAMETERS, newParameters, newParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResultType()
  {
    return resultType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultType(String newResultType)
  {
    String oldResultType = resultType;
    resultType = newResultType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.ABSTRACTION_HEADING__RESULT_TYPE, oldResultType, resultType));
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
      case PascalPackage.ABSTRACTION_HEADING__PARAMETERS:
        return basicSetParameters(null, msgs);
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
      case PascalPackage.ABSTRACTION_HEADING__NAME:
        return getName();
      case PascalPackage.ABSTRACTION_HEADING__PARAMETERS:
        return getParameters();
      case PascalPackage.ABSTRACTION_HEADING__RESULT_TYPE:
        return getResultType();
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
      case PascalPackage.ABSTRACTION_HEADING__NAME:
        setName((String)newValue);
        return;
      case PascalPackage.ABSTRACTION_HEADING__PARAMETERS:
        setParameters((formal_parameter_list)newValue);
        return;
      case PascalPackage.ABSTRACTION_HEADING__RESULT_TYPE:
        setResultType((String)newValue);
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
      case PascalPackage.ABSTRACTION_HEADING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PascalPackage.ABSTRACTION_HEADING__PARAMETERS:
        setParameters((formal_parameter_list)null);
        return;
      case PascalPackage.ABSTRACTION_HEADING__RESULT_TYPE:
        setResultType(RESULT_TYPE_EDEFAULT);
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
      case PascalPackage.ABSTRACTION_HEADING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PascalPackage.ABSTRACTION_HEADING__PARAMETERS:
        return parameters != null;
      case PascalPackage.ABSTRACTION_HEADING__RESULT_TYPE:
        return RESULT_TYPE_EDEFAULT == null ? resultType != null : !RESULT_TYPE_EDEFAULT.equals(resultType);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", resultType: ");
    result.append(resultType);
    result.append(')');
    return result.toString();
  }

} //abstraction_headingImpl
