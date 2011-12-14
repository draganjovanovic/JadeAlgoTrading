package examples.MarketSimulator.marketInstance;

import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JFrame;

import examples.MarketSimulator.AgentGui;
import examples.MarketSimulator.orderBookGui.OrderBookGui;

public class MarketGuiFrame {

	private int frameWidth = 400;
	private int frameHeight = 700;
	
	private JFrame marketFrame;
	private OrderBookGui orderBookGui;
	
	public MarketGuiFrame() {
		
		marketFrame = new JFrame();
		marketFrame.setLayout(new GridLayout(1,1));
		
		orderBookGui = new OrderBookGui();
		orderBookGui.setSize(300, 500);
		
		render();
	}
	
	private void render() {

		marketFrame.add(orderBookGui);
	}

	public void show() {
		
		GraphicsConfiguration gc = marketFrame.getGraphicsConfiguration();  
		Rectangle bounds = gc.getBounds();
		   
		// Set the Location and Activate  
		marketFrame.setLocation((int) ((bounds.width / 2) - (frameWidth) - 50), (int) ((bounds.height / 2) - (frameHeight / 2))); 

		marketFrame.setSize(frameWidth, frameHeight);
		marketFrame.setVisible(true);
	}
}