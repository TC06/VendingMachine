package dk.dtu.compute.mbse.yawl.constraints;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.compute.mbse.yawl.AType;
import dk.dtu.compute.mbse.yawl.Arc;
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
public class SameArcSamePlace extends AbstractModelConstraint {

	public IStatus validate(IValidationContext ctx) {
		EObject object = ctx.getTarget();
		if (object instanceof YAWLNet) {
			EObject container = object.eContainer();

			if (container instanceof PetriNet) {
				int startCount = 0;
				int endCount = 0;
				Iterator<EObject> iterator = container.eAllContents();

				while (iterator.hasNext()) {
					EObject content = iterator.next();

					if (content instanceof Arc) {
						Arc arc = (Arc) content;
						AType arctype = YAWLFunctions.getArcType(arc);
						Place condition = (Place) content;
						PType placetype = YAWLFunctions.getPlaceType(condition);

						if (placetype.equals(PType.START) && condition.getOut().contains(arctype)) {
							startCount++;
							break;
						} else if (placetype.equals(PType.FINISH) && !condition.getOut().isEmpty()) {
							endCount++;
							break;
						}
					}
				}
				if (startCount > 0 || endCount > 0) {
					return ctx.createFailureStatus(new Object[] { container });
				}
			}
		}
		return ctx.createSuccessStatus();
	}
}