/**
 * generated by Xtext 2.10.0
 */
package bsql2java;

import bsql2java.BSQL2JavaStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BSQL2JavaStandaloneSetup extends BSQL2JavaStandaloneSetupGenerated {
  public static void doSetup() {
    BSQL2JavaStandaloneSetup _bSQL2JavaStandaloneSetup = new BSQL2JavaStandaloneSetup();
    _bSQL2JavaStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
