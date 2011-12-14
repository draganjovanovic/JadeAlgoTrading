package examples.MarketSimulator.orderBookGui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class OrderBookGuiYAxis {

	private Graphics2D g2d;
	private static Line2D.Double lineYAxis;
	
	public OrderBookGuiYAxis(Graphics g) {
		
		g2d = (Graphics2D) g;
		lineYAxis = new Line2D.Double(200, 0, 200, 700);
		paintComponent();
	}
	
	public void paintComponent() {

		g2d.draw(lineYAxis);
	
		Integer y = 70;
		for (int i = 10; i < 700; i += 10) {
			y -= 1;
			g2d.setColor(Color.black);
			g2d.draw(new Line2D.Double(197, i, 203, i));
        
			if (i%6 == 0) {
    		
				g2d.setFont(new Font("LucidaBrightDemiBold", Font.BOLD, 10));
				g2d.setColor(Color.GRAY);
				g2d.drawString(y.toString(), 190, i-5);
			}
		}
	}
}
