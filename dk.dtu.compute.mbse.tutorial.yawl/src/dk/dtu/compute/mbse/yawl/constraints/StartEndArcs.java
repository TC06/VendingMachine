package dk.dtu.compute.mbse.yawl.constraints;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.compute.mbse.yawl.PType;
import dk.dtu.compute.mbse.yawl.Place;
import dk.dtu.compute.mbse.yawl.YAWLNet;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

// imports missing

/**
 * This is a constraint saying that a YAWL net should have exactly one start
 * place and one end place.
 *
 * @author Harun s150366
 * @generated NOT
 */
public class StartEndArcs extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();

		// TODO YAWLNet must refer to your java class for YAWL nets
		if (object instanceof YAWLNet) {
			EObject container = object.eContainer();
			if (container instanceof PetriNet) {
				int startCount = 0;
				int endCount = 0;
				Iterator<EObject> iterator = container.eAllContents();
				while (iterator.hasNext()) {
					EObject content = iterator.next();

					// TODO count number of places that are start places
					// and number of places that are end places
					if (content instanceof Place) {
						Place condition = (Place) content;
						PType type = YAWLFunctions.getPlaceType(condition);
						if (type.equals(PType.START) && !condition.getIn().isEmpty()) {
							startCount++;
							break;

						} else if (type.equals(PType.FINISH) && !condition.getOut().isEmpty()) {
							endCount++;
							break;
						}
					}
				}
				if (startCount > 0 || endCount > 0) {
					// if there is not exactly one start place and exactly one
					// end place, return a failure status.
					return ctx.createFailureStatus(new Object[] { container });
				}
			}
		}
		// otherwise return a success status
		return ctx.createSuccessStatus();
	}

}