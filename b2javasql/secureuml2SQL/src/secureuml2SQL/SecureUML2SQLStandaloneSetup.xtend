/*
 * generated by Xtext 2.10.0
 */
package secureuml2SQL


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SecureUML2SQLStandaloneSetup extends SecureUML2SQLStandaloneSetupGenerated {

	def static void doSetup() {
		new SecureUML2SQLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
