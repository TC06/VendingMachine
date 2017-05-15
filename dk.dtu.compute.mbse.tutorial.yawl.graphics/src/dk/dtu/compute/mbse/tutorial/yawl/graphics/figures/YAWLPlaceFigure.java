package dk.dtu.compute.mbse.tutorial.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

import dk.dtu.compute.mbse.yawl.PType;
import dk.dtu.compute.mbse.yawl.functions.YAWLFunctions;

/**
 * The figure defining implementing the graphical appearance of transitions in
 * the Technical Net Type. The transitions will be shown with a cross in on the
 * left or ride side of the transition if the transition does not have NORMAL
 * incoming or outgoing arcs.
 * 
 * 
 */
public class YAWLPlaceFigure extends PlaceFigure {

	private PType placeType;

	public YAWLPlaceFigure(Place place) {
		super(place);
		placeType = YAWLFunctions.getPlaceType(place);

	}

	/**
	 * This method is called whenever some attribute of the transition which
	 * might influence the graphical appearance of the transition changes.
	 */
	@Override
	public void update() {
		PType oldType = placeType;
		placeType = YAWLFunctions.getPlaceType(place);
		if (oldType != placeType) {
			// only call the repaint() method, when there was a change that has
			// an effect to the graphical appearance of the transition
			this.repaint();
		}
	}

	/**
	 * @author s133959 - Tolga Cetin
	 */
	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);

		Rectangle rectangle = this.getClientArea();
		int d1 = rectangle.width / 3;
		int d2 = rectangle.height / 3;

		if (placeType.equals(PType.START)) {
			graphics.pushState();
			Display display = Display.getCurrent();
			Color green = display.getSystemColor(SWT.COLOR_GREEN);
			graphics.setBackgroundColor(green);
			graphics.setLineWidth(1);
			int x1 = rectangle.x + d1 + 1;
			int y1 = rectangle.y + d2;
			int x2 = rectangle.x + 2 * d1 + 2;
			int y2 = rectangle.y + rectangle.height / 2;
			int x3 = x1;
			int y3 = rectangle.y + 2 * d2;
			graphics.fillPolygon(new int[] { x1, y1, x2, y2, x3, y3 });
			graphics.drawPolygon(new int[] { x1, y1, x2, y2, x3, y3 });
			graphics.popState();
		}

		else if (placeType.equals(PType.FINISH)) {
			graphics.pushState();
			Display display = Display.getCurrent();
			Color red = display.getSystemColor(SWT.COLOR_RED);
			graphics.setBackgroundColor(red);
			graphics.setLineWidth(1);
			int x1 = rectangle.x + d1;
			int y1 = rectangle.y + d2;
			int x2 = rectangle.x + (d1 * 2);
			int y2 = rectangle.y + d2;
			int x3 = rectangle.x + (d1 * 2);
			int y3 = rectangle.y + (d2 * 2);
			int x4 = rectangle.x + d1;
			int y4 = rectangle.y + (d2 * 2);
			graphics.fillPolygon(new int[] { x1, y1, x2, y2, x3, y3, x4, y4 });
			graphics.drawPolygon(new int[] { x1, y1, x2, y2, x3, y3, x4, y4 });
			graphics.popState();
		}
	}
}
