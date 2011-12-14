package examples.MarketSimulator.orderBookGui;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class OrderBookGuiAddOrder {

	private Graphics2D g2d;
	
	private int indexOffsetX = 205;
	private int indexHeight = 700;
	
	public OrderBookGuiAddOrder(Graphics2D g2d) {

		this.g2d = g2d;
	}
	
	public void draw(int price, int quantity) {

		Rectangle2D.Double rect = new Rectangle2D.Double(indexOffsetX, 700-(price*10)+2, quantity, 7);
	  
		g2d.setColor(Color.GREEN);
		g2d.fill(rect);
	}
	
	public void separator() {
		
		g2d.setColor(Color.BLACK);
	  	//Rectangle2D.Double rectSep = new Rectangle2D.Double(indexX + quantity, 700-(price*10)+2, 3, 7);
	  	//g2d.fill(rectSep);
	}
}
