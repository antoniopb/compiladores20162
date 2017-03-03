/**
 * generated by Xtext 2.11.0.RC2
 */
package org.xtext.ufcg.compiladores.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ufcg.compiladores.pascal.PascalPackage;
import org.xtext.ufcg.compiladores.pascal.case_label_list;
import org.xtext.ufcg.compiladores.pascal.field_list;
import org.xtext.ufcg.compiladores.pascal.variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.variantImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.impl.variantImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variantImpl extends MinimalEObjectImpl.Container implements variant
{
  /**
   * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabels()
   * @generated
   * @ordered
   */
  protected case_label_list labels;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected field_list fields;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variantImpl()
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
    return PascalPackage.Literals.VARIANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_label_list getLabels()
  {
    return labels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabels(case_label_list newLabels, NotificationChain msgs)
  {
    case_label_list oldLabels = labels;
    labels = newLabels;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__LABELS, oldLabels, newLabels);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabels(case_label_list newLabels)
  {
    if (newLabels != labels)
    {
      NotificationChain msgs = null;
      if (labels != null)
        msgs = ((InternalEObject)labels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__LABELS, null, msgs);
      if (newLabels != null)
        msgs = ((InternalEObject)newLabels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__LABELS, null, msgs);
      msgs = basicSetLabels(newLabels, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__LABELS, newLabels, newLabels));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_list getFields()
  {
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFields(field_list newFields, NotificationChain msgs)
  {
    field_list oldFields = fields;
    fields = newFields;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__FIELDS, oldFields, newFields);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFields(field_list newFields)
  {
    if (newFields != fields)
    {
      NotificationChain msgs = null;
      if (fields != null)
        msgs = ((InternalEObject)fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__FIELDS, null, msgs);
      if (newFields != null)
        msgs = ((InternalEObject)newFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__FIELDS, null, msgs);
      msgs = basicSetFields(newFields, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__FIELDS, newFields, newFields));
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
      case PascalPackage.VARIANT__LABELS:
        return basicSetLabels(null, msgs);
      case PascalPackage.VARIANT__FIELDS:
        return basicSetFields(null, msgs);
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
      case PascalPackage.VARIANT__LABELS:
        return getLabels();
      case PascalPackage.VARIANT__FIELDS:
        return getFields();
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
      case PascalPackage.VARIANT__LABELS:
        setLabels((case_label_list)newValue);
        return;
      case PascalPackage.VARIANT__FIELDS:
        setFields((field_list)newValue);
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
      case PascalPackage.VARIANT__LABELS:
        setLabels((case_label_list)null);
        return;
      case PascalPackage.VARIANT__FIELDS:
        setFields((field_list)null);
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
      case PascalPackage.VARIANT__LABELS:
        return labels != null;
      case PascalPackage.VARIANT__FIELDS:
        return fields != null;
    }
    return super.eIsSet(featureID);
  }

} //variantImpl
