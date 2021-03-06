/*
 * generated by Xtext 2.10.0
 */
package bsql2sql.tests

import bsql2sql.bSQL2SQL.BSQL2SQL
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(BSQL2SQLInjectorProvider)
class BSQL2SQLParsingTest{

	@Inject
	ParseHelper<BSQL2SQL> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
