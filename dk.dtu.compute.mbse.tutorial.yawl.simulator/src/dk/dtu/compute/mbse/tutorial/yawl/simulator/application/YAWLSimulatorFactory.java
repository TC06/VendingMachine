package dk.dtu.compute.mbse.tutorial.yawl.simulator.application;

import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.compute.mbse.yawl.YAWLNet;

/**
 * The application factory which is plugged in for registering the YAWL
 * simulator with the ePNK (see plugin.xml).
 * 
 * @author ekki@dtu.dk
 *
 */
public class YAWLSimulatorFactory extends ApplicationFactory {

	public YAWLSimulatorFactory() {
		super();
	}

	@Override
	public String getName() {
		return "First YAWL Simulator";
	}

	@Override
	public String getDescription() {
		return "A quick adaptation of the technical simulator to a YAWL simulator";
	}

	@Override
	public boolean isApplicable(PetriNet net) {
		return net.getType() instanceof YAWLNet;
	}

	@Override
	public ApplicationWithUIManager startApplication(PetriNet net) {
		return new YAWLSimulator(net);
	}

}
