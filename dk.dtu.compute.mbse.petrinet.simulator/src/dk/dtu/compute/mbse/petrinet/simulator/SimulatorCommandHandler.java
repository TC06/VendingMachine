package dk.dtu.compute.mbse.petrinet.simulator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;

import dk.dtu.compute.mbse.petrinet.Arc;
import dk.dtu.compute.mbse.petrinet.Node;
import dk.dtu.compute.mbse.petrinet.PetrinetFactory;
import dk.dtu.compute.mbse.petrinet.Place;
import dk.dtu.compute.mbse.petrinet.Token;
import dk.dtu.compute.mbse.petrinet.Transition;
import dk.dtu.compute.mbse.petrinet.commands.FireTransitionCommand;

public class SimulatorCommandHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final Transition transition = getTransition(event.getApplicationContext());
		if (isEnabled(transition)) {
			EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(transition);
			if (domain instanceof TransactionalEditingDomain) {
				domain.getCommandStack().execute(
						new RecordingCommand((TransactionalEditingDomain) domain, "Fire Transition (RC)") {
							@Override
							protected void doExecute() {
								fire(transition);
							}
						});
			} else if (domain != null) {
				domain.getCommandStack().execute(new FireTransitionCommand(domain, transition));
			} else {
				fire(transition);
			}
		}
		return null;
	}

	@Override
	public void setEnabled(Object context) {
		Transition transition = getTransition(context);
		setBaseEnabled(isEnabled(transition));
	}

	static private boolean isEnabled(Transition transition) {
		if (transition != null) {
			// compute the number of tokens needed for each place for firing
			// the given transition and check whether the place that many tokens
			Map<Place, Integer> needed = new HashMap<Place, Integer>();
			for(Arc arc : transition.getIn()){
				Node node = arc.getSource();
				if(node instanceof Place){
					Place source = (Place) node;
					needed.put(source, needed.getOrDefault(source, 0)+1);
				}
			}

			for(Place place : needed.keySet()){
				if(place.getTokens().size() < needed.get(place)){
					return false;
				}

			}
			return true; 
		}
		return false;
	}

	static private void fire(Transition transition) {
		if (transition != null && isEnabled(transition)) {
			// remove the one tokens from each places of the incoming arcs
			List<Arc> arcs = transition.getIn();

			Map<Place, Integer> needed = new HashMap<Place,Integer>();
			/*for(Place place : needed.keySet()){
				for(int i = 0; i < needed.get(place) && i < place.getTokens().size(); i++){
					place.getTokens().remove(i);
				}
			}

			for(Arc arc : transition.getOut()){
				Node node = arc.getTarget();
				if(node instanceof Place){
					Place place = (Place) node;
					Token token = PetrinetFactory.eINSTANCE.createToken();
					place.getTokens().add(token);
				}
			}*/

			for(Arc arc : arcs){

				Node node = arc.getSource();

				if(node instanceof Place){

					Place place = (Place) node;

					place.getTokens().remove(place.getTokens().size()-1);
				}
			}

			// add the one token to each outgoing place

			List<Arc> arcs2 = transition.getOut();

			for(Arc arc : arcs2){

				Node node = arc.getTarget();

				if(node instanceof Place){

					Place place = (Place) node;

					Token t = PetrinetFactory.eINSTANCE.createToken();

					place.getTokens().add(t);
				}			
			}
		}
	}

	static private Transition getTransition(Object context) {
		if (context instanceof IEvaluationContext) {
			IEvaluationContext evaluationContext = (IEvaluationContext) context;
			Object object = evaluationContext.getDefaultVariable();
			if (object instanceof List) {
				@SuppressWarnings("rawtypes")
				List list = (List) object;
				if (list.size() == 1) {
					object = list.get(0);
					if (object instanceof Transition) {
						return (Transition) object;
					} else if (object instanceof IGraphicalEditPart) {
						IGraphicalEditPart editPart = (IGraphicalEditPart) object;
						Object model = editPart.getModel();
						if (model instanceof View) {
							Object element = ((View) model).getElement();
							if (element instanceof Transition) {
								return (Transition) element;
							}
						}
					}
				}
			}
		}
		return null;
	}

}
