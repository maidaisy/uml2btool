/**
 * generated by Xtext 2.10.0
 */
package bsqllog2java.bSQLLog2Java.impl;

import bsqllog2java.bSQLLog2Java.BAnyBlock;
import bsqllog2java.bSQLLog2Java.BParameterTyping;
import bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage;
import bsqllog2java.bSQLLog2Java.StringOperation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.StringOperationImpl#getRes <em>Res</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.StringOperationImpl#getOp_name <em>Op name</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.StringOperationImpl#getPList <em>PList</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.StringOperationImpl#getPTyping <em>PTyping</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.impl.StringOperationImpl#getAnyblock <em>Anyblock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringOperationImpl extends MinimalEObjectImpl.Container implements StringOperation
{
  /**
   * The default value of the '{@link #getRes() <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes()
   * @generated
   * @ordered
   */
  protected static final String RES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRes() <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRes()
   * @generated
   * @ordered
   */
  protected String res = RES_EDEFAULT;

  /**
   * The default value of the '{@link #getOp_name() <em>Op name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp_name()
   * @generated
   * @ordered
   */
  protected static final String OP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp_name() <em>Op name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp_name()
   * @generated
   * @ordered
   */
  protected String op_name = OP_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPList() <em>PList</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPList()
   * @generated
   * @ordered
   */
  protected EList<String> pList;

  /**
   * The cached value of the '{@link #getPTyping() <em>PTyping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPTyping()
   * @generated
   * @ordered
   */
  protected EList<BParameterTyping> pTyping;

  /**
   * The cached value of the '{@link #getAnyblock() <em>Anyblock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnyblock()
   * @generated
   * @ordered
   */
  protected BAnyBlock anyblock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringOperationImpl()
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
    return BSQLLog2JavaPackage.Literals.STRING_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRes()
  {
    return res;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRes(String newRes)
  {
    String oldRes = res;
    res = newRes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.STRING_OPERATION__RES, oldRes, res));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp_name()
  {
    return op_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp_name(String newOp_name)
  {
    String oldOp_name = op_name;
    op_name = newOp_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.STRING_OPERATION__OP_NAME, oldOp_name, op_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPList()
  {
    if (pList == null)
    {
      pList = new EDataTypeEList<String>(String.class, this, BSQLLog2JavaPackage.STRING_OPERATION__PLIST);
    }
    return pList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BParameterTyping> getPTyping()
  {
    if (pTyping == null)
    {
      pTyping = new EObjectContainmentEList<BParameterTyping>(BParameterTyping.class, this, BSQLLog2JavaPackage.STRING_OPERATION__PTYPING);
    }
    return pTyping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BAnyBlock getAnyblock()
  {
    return anyblock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnyblock(BAnyBlock newAnyblock, NotificationChain msgs)
  {
    BAnyBlock oldAnyblock = anyblock;
    anyblock = newAnyblock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.STRING_OPERATION__ANYBLOCK, oldAnyblock, newAnyblock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnyblock(BAnyBlock newAnyblock)
  {
    if (newAnyblock != anyblock)
    {
      NotificationChain msgs = null;
      if (anyblock != null)
        msgs = ((InternalEObject)anyblock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSQLLog2JavaPackage.STRING_OPERATION__ANYBLOCK, null, msgs);
      if (newAnyblock != null)
        msgs = ((InternalEObject)newAnyblock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSQLLog2JavaPackage.STRING_OPERATION__ANYBLOCK, null, msgs);
      msgs = basicSetAnyblock(newAnyblock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSQLLog2JavaPackage.STRING_OPERATION__ANYBLOCK, newAnyblock, newAnyblock));
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
      case BSQLLog2JavaPackage.STRING_OPERATION__PTYPING:
        return ((InternalEList<?>)getPTyping()).basicRemove(otherEnd, msgs);
      case BSQLLog2JavaPackage.STRING_OPERATION__ANYBLOCK:
        return basicSetAnyblock(null, msgs);
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
      case BSQLLog2JavaPackage.STRING_OPERATION__RES:
        return getRes();
      case BSQLLog2JavaPackage.STRING_OPERATION__OP_NAME:
        return getOp_name();
      case BSQLLog2JavaPackage.STRING_OPERATION__PLIST:
        return getPList();
      case BSQLLog2JavaPackage.STRING_OPERATION__PTYPING:
        return getPTyping();
      case BSQLLog2JavaPackage.STRING_OPERATION__ANYBLOCK:
        return getAnyblock();
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
      case BSQLLog2JavaPackage.STRING_OPERATION__RES:
        setRes((String)newValue);
        return;
      case BSQLLog2JavaPackage.STRING_OPERATION__OP_NAME:
        setOp_name((String)newValue);
        return;
      case BSQLLog2JavaPackage.STRING_OPERATION__PLIST:
        getPList().clear();
        getPList().addAll((Collection<? extends String>)newValue);
        return;
      case BSQLLog2JavaPackage.STRING_OPERATION__PTYPING:
        getPTyping().clear();
        getPTyping().addAll((Collection<? extends BParameterTyping>)newValue);
        return;
      case BSQLLog2JavaPackage.STRING_OPERATION__ANYBLOCK:
        setAnyblock((BAnyBlock)newValue);
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
      case BSQLLog2JavaPackage.STRING_OPERATION__RES:
        setRes(RES_EDEFAULT);
        return;
      case BSQLLog2JavaPackage.STRING_OPERATION__OP_NAME:
        setOp_name(OP_NAME_EDEFAULT);
        return;
      case BSQLLog2JavaPackage.STRING_OPERATION__PLIST:
        getPList().clear();
        return;
      case BSQLLog2JavaPackage.STRING_OPERATION__PTYPING:
        getPTyping().clear();
        return;
      case BSQLLog2JavaPackage.STRING_OPERATION__ANYBLOCK:
        setAnyblock((BAnyBlock)null);
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
      case BSQLLog2JavaPackage.STRING_OPERATION__RES:
        return RES_EDEFAULT == null ? res != null : !RES_EDEFAULT.equals(res);
      case BSQLLog2JavaPackage.STRING_OPERATION__OP_NAME:
        return OP_NAME_EDEFAULT == null ? op_name != null : !OP_NAME_EDEFAULT.equals(op_name);
      case BSQLLog2JavaPackage.STRING_OPERATION__PLIST:
        return pList != null && !pList.isEmpty();
      case BSQLLog2JavaPackage.STRING_OPERATION__PTYPING:
        return pTyping != null && !pTyping.isEmpty();
      case BSQLLog2JavaPackage.STRING_OPERATION__ANYBLOCK:
        return anyblock != null;
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
    result.append(" (res: ");
    result.append(res);
    result.append(", op_name: ");
    result.append(op_name);
    result.append(", pList: ");
    result.append(pList);
    result.append(')');
    return result.toString();
  }

} //StringOperationImpl