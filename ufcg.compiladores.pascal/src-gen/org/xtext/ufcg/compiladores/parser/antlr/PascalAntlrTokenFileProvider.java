/*
 * generated by Xtext 2.11.0.RC2
 */
package org.xtext.ufcg.compiladores.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PascalAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/ufcg/compiladores/parser/antlr/internal/InternalPascal.tokens");
	}
}
