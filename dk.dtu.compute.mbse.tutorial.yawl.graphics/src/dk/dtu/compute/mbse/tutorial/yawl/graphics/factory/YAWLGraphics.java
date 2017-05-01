package dk.dtu.compute.mbse.tutorial.yawl.graphics.factory;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

import dk.dtu.compute.mbse.tutorial.yawl.graphics.figures.YAWLArcFigure;
import dk.dtu.compute.mbse.yawl.YawlPackage;

/**
 * The graphical extension the the Technical Net extension. This is
 * the class plugged in to the ePNK  (see plugin.xml).
 * 
 * @author Umais s153403
 *
 */
public class YAWLGraphics extends GraphicalExtension {

	
	public YAWLGraphics() {
		super();
	}

	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> results = new ArrayList<EClass>();
		results.add(YawlPackage.eINSTANCE.getYAWLNet());
		return results;
	}

	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> results = new ArrayList<EClass>();
		if (netType.equals(YawlPackage.eINSTANCE.getYAWLNet())) {
			results.add(YawlPackage.eINSTANCE.getArc());
			// No graphical extension for places
			// results.add((TechnicalPackage.eINSTANCE.getPlace());
			// results.add(TechnicalPackage.eINSTANCE.getTransition());
		}
		return results;
	}

	@Override
	public IArcFigure createArcFigure(Arc arc) {
		if (arc instanceof dk.dtu.compute.mbse.yawl.Arc) {
			return new YAWLArcFigure(arc);
		}
		return null;
	}

	/*
	   No graphical extension for places
	   
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		return null;
	}
	*/
	/*
	@Override
	public IUpdateableFigure createTransitionFigure(Transition transition) {
		if (transition instanceof org.pnml.tools.epnk.tutorials.app.technical.Transition) {
			return new TechnicalNetTypeTransitionFigure(transition);
		}
		return null;
	}
	*/
}
