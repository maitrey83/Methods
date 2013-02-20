/**
 * File: BeautifulCollage.java
 * 
 * A program that draws a magnificent, high-quality collage.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class BeautifulCollage extends GraphicsProgram {
	/* Constants controlling the position of our rectangle. */
	private static final double RECT_X = 10;
	private static final double RECT_Y = 40;
	private static final double RECT_WIDTH = 100;
	private static final double RECT_HEIGHT = 200;
	
	/* Constants controlling the position of our oval. */
	private static final double OVAL_WIDTH = 500;
	private static final double OVAL_HEIGHT = 50;
	
	public void run() {
		/* Create a nice, green rectangle. */
		GRect rect = new GRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
		rect.setColor(Color.GREEN);
		rect.setFilled(true);
		add(rect);
		
		/* Create a shiny blue oval with a red outline. */
		double x = (getWidth() - OVAL_WIDTH) / 2.0;
		double y =  (getHeight() - OVAL_HEIGHT) / 2.0;
		GOval oval = new GOval(x, y, OVAL_WIDTH, OVAL_HEIGHT);
		
		oval.setColor(Color.RED);
		oval.setFillColor(Color.BLUE);
		oval.setFilled(true);
		
		add(oval);
	}
}
