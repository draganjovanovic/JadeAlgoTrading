package examples.MarketSimulator.orderBookGui;

import javax.swing.*; // For JPanel, etc.
import java.awt.*;           // For Graphics, etc.
import java.awt.geom.*;      // For Ellipse2D, etc.

/** An example of drawing/filling shapes with Java2D in Java 1.2.
 *
 *  From tutorial on learning Java2D at
 *  http://www.apl.jhu.edu/~hall/java/Java2D-Tutorial.html
 *
 *  1998 Marty Hall, http://www.apl.jhu.edu/~hall/java/
 */

public class OrderBookGui extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Graphics2D g2d;
	
	public OrderBookGui() {
		
        //WindowUtilities.openInJFrame(this, 400, 700);
        //orderBookGuiAddOrder = new OrderBookGuiAddOrder(g2d);
	}
	
	private OrderBookGuiAddOrder orderBookGuiAddOrder;

	public void paintComponent(Graphics g) {
		
		clear(g);
		g2d = (Graphics2D)g;
		
		new OrderBookGuiYAxis(g2d);
	}
  
	public void addOrder(int price, int quantity) {

		orderBookGuiAddOrder.draw(price, quantity);
	}

	protected void clear(Graphics g) {
		super.paintComponent(g);
  	}
}