/*
 * generated by Xtext 2.10.0
 */
package bsql2java.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BSQL2JavaAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("bsql2java/parser/antlr/internal/InternalBSQL2Java.tokens");
	}
}
