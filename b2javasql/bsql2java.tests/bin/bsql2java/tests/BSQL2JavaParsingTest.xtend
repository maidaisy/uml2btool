/*
 * generated by Xtext 2.10.0
 */
package bsql2java.tests

import bsql2java.bSQL2Java.BSQL2Java
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(BSQL2JavaInjectorProvider)
class BSQL2JavaParsingTest{

	@Inject
	ParseHelper<BSQL2Java> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
