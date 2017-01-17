/**
 * generated by Xtext 2.10.0
 */
package secureuml2SQL.secureUML2SQL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import secureuml2SQL.secureUML2SQL.BConstant;
import secureuml2SQL.secureUML2SQL.BESet;
import secureuml2SQL.secureUML2SQL.BMachine;
import secureuml2SQL.secureUML2SQL.BProperties;
import secureuml2SQL.secureUML2SQL.BSet;
import secureuml2SQL.secureUML2SQL.BSetValue;
import secureuml2SQL.secureUML2SQL.BTuple;
import secureuml2SQL.secureUML2SQL.SecureUML2SQL;
import secureuml2SQL.secureUML2SQL.SecureUML2SQLFactory;
import secureuml2SQL.secureUML2SQL.SecureUML2SQLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecureUML2SQLPackageImpl extends EPackageImpl implements SecureUML2SQLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass secureUML2SQLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bMachineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bTupleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bSetValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bConstantEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see secureuml2SQL.secureUML2SQL.SecureUML2SQLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SecureUML2SQLPackageImpl()
  {
    super(eNS_URI, SecureUML2SQLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SecureUML2SQLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SecureUML2SQLPackage init()
  {
    if (isInited) return (SecureUML2SQLPackage)EPackage.Registry.INSTANCE.getEPackage(SecureUML2SQLPackage.eNS_URI);

    // Obtain or create and register package
    SecureUML2SQLPackageImpl theSecureUML2SQLPackage = (SecureUML2SQLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecureUML2SQLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecureUML2SQLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSecureUML2SQLPackage.createPackageContents();

    // Initialize created meta-data
    theSecureUML2SQLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSecureUML2SQLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SecureUML2SQLPackage.eNS_URI, theSecureUML2SQLPackage);
    return theSecureUML2SQLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EClass getSecureUML2SQL()
  {
    return secureUML2SQLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EClass getBMachine()
  {
    return bMachineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EAttribute getBMachine_M_name()
  {
    return (EAttribute)bMachineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EReference getBMachine_Esets()
  {
    return (EReference)bMachineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EReference getBMachine_Cons()
  {
    return (EReference)bMachineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EReference getBMachine_Pros()
  {
    return (EReference)bMachineEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EClass getBProperties()
  {
    return bPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EAttribute getBProperties_Cons()
  {
    return (EAttribute)bPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EAttribute getBProperties_Prop()
  {
    return (EAttribute)bPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EReference getBProperties_Pairs()
  {
    return (EReference)bPropertiesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EClass getBTuple()
  {
    return bTupleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EAttribute getBTuple_Ran()
  {
    return (EAttribute)bTupleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EAttribute getBTuple_Dom()
  {
    return (EAttribute)bTupleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EClass getBSet()
  {
    return bSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EAttribute getBSet_Set_name()
  {
    return (EAttribute)bSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EClass getBESet()
  {
    return beSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EAttribute getBESet_Set_name()
  {
    return (EAttribute)beSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EReference getBESet_Values()
  {
    return (EReference)beSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EClass getBSetValue()
  {
    return bSetValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EAttribute getBSetValue_Value_name()
  {
    return (EAttribute)bSetValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EClass getBConstant()
  {
    return bConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public EAttribute getBConstant_Constant_name()
  {
    return (EAttribute)bConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public SecureUML2SQLFactory getSecureUML2SQLFactory()
  {
    return (SecureUML2SQLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    secureUML2SQLEClass = createEClass(SECURE_UML2SQL);

    bMachineEClass = createEClass(BMACHINE);
    createEAttribute(bMachineEClass, BMACHINE__MNAME);
    createEReference(bMachineEClass, BMACHINE__ESETS);
    createEReference(bMachineEClass, BMACHINE__CONS);
    createEReference(bMachineEClass, BMACHINE__PROS);

    bPropertiesEClass = createEClass(BPROPERTIES);
    createEAttribute(bPropertiesEClass, BPROPERTIES__CONS);
    createEAttribute(bPropertiesEClass, BPROPERTIES__PROP);
    createEReference(bPropertiesEClass, BPROPERTIES__PAIRS);

    bTupleEClass = createEClass(BTUPLE);
    createEAttribute(bTupleEClass, BTUPLE__RAN);
    createEAttribute(bTupleEClass, BTUPLE__DOM);

    bSetEClass = createEClass(BSET);
    createEAttribute(bSetEClass, BSET__SET_NAME);

    beSetEClass = createEClass(BE_SET);
    createEAttribute(beSetEClass, BE_SET__SET_NAME);
    createEReference(beSetEClass, BE_SET__VALUES);

    bSetValueEClass = createEClass(BSET_VALUE);
    createEAttribute(bSetValueEClass, BSET_VALUE__VALUE_NAME);

    bConstantEClass = createEClass(BCONSTANT);
    createEAttribute(bConstantEClass, BCONSTANT__CONSTANT_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    bMachineEClass.getESuperTypes().add(this.getSecureUML2SQL());

    // Initialize classes and features; add operations and parameters
    initEClass(secureUML2SQLEClass, SecureUML2SQL.class, "SecureUML2SQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bMachineEClass, BMachine.class, "BMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBMachine_M_name(), ecorePackage.getEString(), "m_name", null, 0, 1, BMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBMachine_Esets(), this.getBESet(), null, "esets", null, 0, -1, BMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBMachine_Cons(), this.getBConstant(), null, "cons", null, 0, -1, BMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBMachine_Pros(), this.getBProperties(), null, "pros", null, 0, -1, BMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bPropertiesEClass, BProperties.class, "BProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBProperties_Cons(), ecorePackage.getEString(), "cons", null, 0, 1, BProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBProperties_Prop(), ecorePackage.getEString(), "prop", null, 0, 1, BProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBProperties_Pairs(), this.getBTuple(), null, "pairs", null, 0, -1, BProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bTupleEClass, BTuple.class, "BTuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBTuple_Ran(), ecorePackage.getEString(), "ran", null, 0, 1, BTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBTuple_Dom(), ecorePackage.getEString(), "dom", null, 0, 1, BTuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bSetEClass, BSet.class, "BSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSet_Set_name(), ecorePackage.getEString(), "set_name", null, 0, 1, BSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beSetEClass, BESet.class, "BESet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBESet_Set_name(), ecorePackage.getEString(), "set_name", null, 0, 1, BESet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBESet_Values(), this.getBSetValue(), null, "values", null, 0, -1, BESet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bSetValueEClass, BSetValue.class, "BSetValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSetValue_Value_name(), ecorePackage.getEString(), "value_name", null, 0, 1, BSetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bConstantEClass, BConstant.class, "BConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBConstant_Constant_name(), ecorePackage.getEString(), "constant_name", null, 0, 1, BConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SecureUML2SQLPackageImpl