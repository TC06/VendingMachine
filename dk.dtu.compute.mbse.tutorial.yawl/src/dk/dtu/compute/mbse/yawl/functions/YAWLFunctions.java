package dk.dtu.compute.mbse.yawl.functions;

import java.util.concurrent.CountDownLatch;

import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;

import dk.dtu.compute.mbse.yawl.AType;
import dk.dtu.compute.mbse.yawl.ArcType;
import dk.dtu.compute.mbse.yawl.PType;
import dk.dtu.compute.mbse.yawl.PlaceType;
import dk.dtu.compute.mbse.yawl.TType;
import dk.dtu.compute.mbse.yawl.Transition;
import dk.dtu.compute.mbse.yawl.TransitionType;

public class YAWLFunctions {

	
	public static PType getPlaceType(Place place) {
		if(place instanceof Place) {
			dk.dtu.compute.mbse.yawl.Place p = (dk.dtu.compute.mbse.yawl.Place) place;
			PlaceType type = p.getPlacetype();
			if(type != null) {
				return type.getText();
			} 
			else {
				return PType.NORMAL;
			} 
		} 
		else {
			return PType.NORMAL;
		}
	}
	

	public static AType getArcType(Arc arc) {
		if (arc.getSource() instanceof TransitionNode) {
			return AType.NORMAL;
		}
		if (arc instanceof dk.dtu.compute.mbse.yawl.Arc) {
			dk.dtu.compute.mbse.yawl.Arc a = (dk.dtu.compute.mbse.yawl.Arc) arc;
			ArcType type = a.getArctype();
			if (type != null) {
				return type.getText();
			}
		}

		return AType.NORMAL;
	}

	public static boolean isResetArc(Arc arc) {
		return getArcType(arc).equals(AType.RESET);
	}
	
	/*
	public static ControlFlowType getJoinType(Transition transition) {
		FlatAccess flat = FlatAccess.getFlatAccess(NetFunctions.getPetriNet(transition));
		if(transition instanceof Action && flat != null) {
			int count = 0;
			for(Arc a: flat.getIn(action)) {
				if(a instanceof dk.dtu.compute.mbse.yawl.Arc) {
				dk.dtu.compute.mbse.yawl.Arc arc = (dk.dtu.compute.mbse.yawl.Arc) a;
					if(arc.getArctype() == null || arc.getArctype().getText().equals(AType.NORMAL)) {
						count++;
					}
				}
			}
			if(count > 1) {
				TransitionType joinType = action.getJoinType();
				if(joinType != null) {
					if(joinType.getText().equals(TT ype.XOR)) {
						return ControlFlowType.XOR;
					}
					else if(joinType.getText().equals(TType.OR)) {
						return ControlFlowType.OR;
					}
				}
				return ControlFlowType.AND;
			}
			else if(count == 1) {
				return ControlFlowType.SINGLE;
			}
		}
		return ControlFlowType.NULL;
	}
	*/

}
