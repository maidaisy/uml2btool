/**
 * generated by Xtext 2.10.0
 */
package bsqllog2java.bSQLLog2Java;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUnion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bsqllog2java.bSQLLog2Java.BUnion#getSet <em>Set</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.BUnion#getAddedSet <em>Added Set</em>}</li>
 *   <li>{@link bsqllog2java.bSQLLog2Java.BUnion#getAddedE <em>Added E</em>}</li>
 * </ul>
 *
 * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getBUnion()
 * @model
 * @generated
 */
public interface BUnion extends EObject
{
  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(BSet)
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getBUnion_Set()
   * @model containment="true"
   * @generated
   */
  BSet getSet();

  /**
   * Sets the value of the '{@link bsqllog2java.bSQLLog2Java.BUnion#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(BSet value);

  /**
   * Returns the value of the '<em><b>Added Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Added Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Added Set</em>' containment reference.
   * @see #setAddedSet(BSet)
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getBUnion_AddedSet()
   * @model containment="true"
   * @generated
   */
  BSet getAddedSet();

  /**
   * Sets the value of the '{@link bsqllog2java.bSQLLog2Java.BUnion#getAddedSet <em>Added Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Added Set</em>' containment reference.
   * @see #getAddedSet()
   * @generated
   */
  void setAddedSet(BSet value);

  /**
   * Returns the value of the '<em><b>Added E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Added E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Added E</em>' containment reference.
   * @see #setAddedE(BElementStructure)
   * @see bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage#getBUnion_AddedE()
   * @model containment="true"
   * @generated
   */
  BElementStructure getAddedE();

  /**
   * Sets the value of the '{@link bsqllog2java.bSQLLog2Java.BUnion#getAddedE <em>Added E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Added E</em>' containment reference.
   * @see #getAddedE()
   * @generated
   */
  void setAddedE(BElementStructure value);

} // BUnion