/**
 * generated by Xtext 2.10.0
 */
package bsql2sql;

import bsql2sql.BSQL2SQLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BSQL2SQLStandaloneSetup extends BSQL2SQLStandaloneSetupGenerated {
  public static void doSetup() {
    BSQL2SQLStandaloneSetup _bSQL2SQLStandaloneSetup = new BSQL2SQLStandaloneSetup();
    _bSQL2SQLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
