/*
 * generated by Xtext 2.11.0.RC2
 */
package org.xtext.ufcg.compiladores.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import ufcg.compiladores.pascal.ui.internal.PascalActivator;

public class PascalUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PascalActivator.getInstance().getInjector("org.xtext.ufcg.compiladores.Pascal");
	}

}
