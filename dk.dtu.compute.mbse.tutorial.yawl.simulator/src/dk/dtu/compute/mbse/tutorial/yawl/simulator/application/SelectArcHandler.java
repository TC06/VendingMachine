package dk.dtu.compute.mbse.tutorial.yawl.simulator.application;

import org.eclipse.draw2d.MouseEvent;
import org.eclipse.emf.common.util.EList;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotation;
import org.pnml.tools.epnk.annotations.netannotations.NetAnnotations;
import org.pnml.tools.epnk.annotations.netannotations.ObjectAnnotation;
import org.pnml.tools.epnk.applications.ui.IActionHandler;

import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.EnabledTransition;
import dk.dtu.compute.mbse.tutorial.yawl.simulator.yawlannotations.SelectArc;
import dk.dtu.compute.mbse.yawl.TType;
import dk.dtu.compute.mbse.yawl.Transition;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;
import dk.dtu.compute.mbse.yawl.helpers.TransitionHelper;

/**
 * Action handler dealing with clicks on InvolvedArc annotations. It
 * will toggle the active status of the arc and update the enabledness
 * status of the attached transition.
 * 
 * @author Tolga
 *
 */
public class SelectArcHandler implements IActionHandler {

	private YAWLSimulator application;
	
	public SelectArcHandler(YAWLSimulator application) {
		super();		
		this.application = application;
	}

	@Override
	public boolean mouseDoubleClicked(MouseEvent arg0, ObjectAnnotation annotation) {
		return false;
	}

	@Override
	public boolean mousePressed(MouseEvent arg0, ObjectAnnotation annotation) {
		/*if (annotation instanceof SelectArc) {
			SelectArc selectArc = (SelectArc) annotation;
			// change status of the involved arc
			selectArc.setSelected(!selectArc.isSelected());
			
			EnabledTransition transition = selectArc.getTargetTransition();
			if (transition != null) {
				// check whether the change of active status of the
				// arc changes the enabledness of the transition
				boolean active = transition.isEnabled();
				boolean result = true;
				for (SelectArc other: transition.getInArcs()) {
					if (other.isSelected()) {
						result = false;
						break;
					}
				}
				if (active != result) {
					// if the enabledness of the transition changed, update
					// the status for the transition and the Ref transitions
					transition.setEnabled(result);
					for (EnabledTransition refTrans: transition.getRefs()) {
						refTrans.setEnabled(result);
					}
				}
				
				int size = application.getNetAnnotations().getNetAnnotations().size();
				application.deleteNetAnnotationAfterCurrent();
				if (size == application.getNetAnnotations().getNetAnnotations().size()) {
					// application.deleteNetAnnotationAfterCurrent() automatically issues
					// an update if some annotation are deleted; if not, we need to update
					// explicitly
					application.update();
				}
				return true;
			}
		}
		return false;*/
		if (annotation instanceof SelectArc) {
			NetAnnotations netAnnotations = application.getNetAnnotations();
			NetAnnotation current = netAnnotations.getCurrent();
			SelectArc arcAnnotation = (SelectArc) annotation;
			// change status of the involved arc
			EnabledTransition srcTransition = arcAnnotation.getSourceTransition();
			if (current.getObjectAnnotations().contains(srcTransition)) {
				Object object = srcTransition.getObject();

				if (object instanceof Transition) {
					Transition transition = (Transition) object;
					TType[] types = YAWLFunctions.getTransitionType(transition);
					if (types[1] == TType.OR || types[1] == TType.XOR) {
						getArcsList(srcTransition.getOutArcs(), arcAnnotation, transition);
					} else {
						arcAnnotation.setSelected(!arcAnnotation.isSelected());
					}
				}
			}
			EnabledTransition targetTransition = arcAnnotation.getTargetTransition();
			if (current.getObjectAnnotations().contains(srcTransition)) {
				Object object = srcTransition.getObject();

				if (object instanceof Transition) {
					Transition transition = (Transition) object;
					TType[] types = YAWLFunctions.getTransitionType(transition);
					if (types[0] == TType.XOR || types[0] == TType.OR) {
						getArcsList(srcTransition.getInArcs(), arcAnnotation, transition);
					} else {
						arcAnnotation.setSelected(!arcAnnotation.isSelected());
					}
				}
			}
			application.update();

			return true;
		}
		return false;
	}
	
	public EList<SelectArc> getArcsList(EList<SelectArc> arcs, SelectArc arcAnnotation, Transition transition) {
		TType[] types = YAWLFunctions.getTransitionType(transition);
		if (arcAnnotation.isSelected()) {
			boolean AtleasOneSelected = false;
			if (arcs.size() > 1) {
				arcAnnotation.setSelected(false);
				for (SelectArc arc : arcs) {
					if (arc.isSelected()) {
						AtleasOneSelected = true;					
						break;
					}
				}
				if (!AtleasOneSelected) {
					for (SelectArc arc : arcs) {
						if (arc != arcAnnotation) {
							arc.setSelected(true);
							break;
						}
					}
				}
			}
		} else if (types[1] == TType.OR || types[0] == TType.OR) {
			arcAnnotation.setSelected(true);
		} else if (types[1] == TType.XOR || types[0] == TType.XOR) {
			for (SelectArc outArc : arcs) {
				outArc.setSelected(false);
			}
			arcAnnotation.setSelected(true);
		}
		return arcs;
	}

	@Override
	public boolean mouseReleased(MouseEvent arg0, ObjectAnnotation annotation) {
		return false;
	}

}