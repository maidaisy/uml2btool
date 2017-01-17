/**
 * generated by Xtext 2.10.0
 */
package secureuml2Java.secureUML2Java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link secureuml2Java.secureUML2Java.BDom#getObj <em>Obj</em>}</li>
 * </ul>
 *
 * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getBDom()
 * @model
 * @generated
 */
public interface BDom extends EObject
{
  /**
   * Returns the value of the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj</em>' containment reference.
   * @see #setObj(BType)
   * @see secureuml2Java.secureUML2Java.SecureUML2JavaPackage#getBDom_Obj()
   * @model containment="true"
   * @generated
   */
  BType getObj();

  /**
   * Sets the value of the '{@link secureuml2Java.secureUML2Java.BDom#getObj <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj</em>' containment reference.
   * @see #getObj()
   * @generated
   */
  void setObj(BType value);

} // BDom