/**
 * generated by Xtext 2.10.0
 */
package bsql2java.bSQL2Java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Void Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bsql2java.bSQL2Java.VoidOperation#getOp_name <em>Op name</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java.VoidOperation#getPList <em>PList</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java.VoidOperation#getParams <em>Params</em>}</li>
 *   <li>{@link bsql2java.bSQL2Java.VoidOperation#getSubs <em>Subs</em>}</li>
 * </ul>
 *
 * @see bsql2java.bSQL2Java.BSQL2JavaPackage#getVoidOperation()
 * @model
 * @generated
 */
public interface VoidOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Op name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op name</em>' attribute.
   * @see #setOp_name(String)
   * @see bsql2java.bSQL2Java.BSQL2JavaPackage#getVoidOperation_Op_name()
   * @model
   * @generated
   */
  String getOp_name();

  /**
   * Sets the value of the '{@link bsql2java.bSQL2Java.VoidOperation#getOp_name <em>Op name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op name</em>' attribute.
   * @see #getOp_name()
   * @generated
   */
  void setOp_name(String value);

  /**
   * Returns the value of the '<em><b>PList</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PList</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PList</em>' attribute list.
   * @see bsql2java.bSQL2Java.BSQL2JavaPackage#getVoidOperation_PList()
   * @model unique="false"
   * @generated
   */
  EList<String> getPList();

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link bsql2java.bSQL2Java.BParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see bsql2java.bSQL2Java.BSQL2JavaPackage#getVoidOperation_Params()
   * @model containment="true"
   * @generated
   */
  EList<BParameter> getParams();

  /**
   * Returns the value of the '<em><b>Subs</b></em>' containment reference list.
   * The list contents are of type {@link bsql2java.bSQL2Java.BSubstitution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subs</em>' containment reference list.
   * @see bsql2java.bSQL2Java.BSQL2JavaPackage#getVoidOperation_Subs()
   * @model containment="true"
   * @generated
   */
  EList<BSubstitution> getSubs();

} // VoidOperation
