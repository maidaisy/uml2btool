/*
 * generated by Xtext 2.10.0
 */
package secureuml2Java.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SecureUML2JavaAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("secureuml2Java/parser/antlr/internal/InternalSecureUML2Java.tokens");
	}
}