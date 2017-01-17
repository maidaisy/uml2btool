/**
 * generated by Xtext 2.10.0
 */
package bsql2sql.bSQL2SQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bsql2sql.bSQL2SQL.BSOperation#getBop <em>Bop</em>}</li>
 *   <li>{@link bsql2sql.bSQL2SQL.BSOperation#getVop <em>Vop</em>}</li>
 * </ul>
 *
 * @see bsql2sql.bSQL2SQL.BSQL2SQLPackage#getBSOperation()
 * @model
 * @generated
 */
public interface BSOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Bop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bop</em>' containment reference.
   * @see #setBop(BoolOperation)
   * @see bsql2sql.bSQL2SQL.BSQL2SQLPackage#getBSOperation_Bop()
   * @model containment="true"
   * @generated
   */
  BoolOperation getBop();

  /**
   * Sets the value of the '{@link bsql2sql.bSQL2SQL.BSOperation#getBop <em>Bop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bop</em>' containment reference.
   * @see #getBop()
   * @generated
   */
  void setBop(BoolOperation value);

  /**
   * Returns the value of the '<em><b>Vop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vop</em>' containment reference.
   * @see #setVop(VoidOperation)
   * @see bsql2sql.bSQL2SQL.BSQL2SQLPackage#getBSOperation_Vop()
   * @model containment="true"
   * @generated
   */
  VoidOperation getVop();

  /**
   * Sets the value of the '{@link bsql2sql.bSQL2SQL.BSOperation#getVop <em>Vop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vop</em>' containment reference.
   * @see #getVop()
   * @generated
   */
  void setVop(VoidOperation value);

} // BSOperation