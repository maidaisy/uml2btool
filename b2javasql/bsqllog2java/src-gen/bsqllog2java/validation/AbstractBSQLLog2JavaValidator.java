/*
 * generated by Xtext 2.10.0
 */
package bsqllog2java.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractBSQLLog2JavaValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(bsqllog2java.bSQLLog2Java.BSQLLog2JavaPackage.eINSTANCE);
		return result;
	}
	
}