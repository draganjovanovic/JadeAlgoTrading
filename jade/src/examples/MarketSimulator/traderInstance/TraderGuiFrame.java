package examples.MarketSimulator.traderInstance;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TraderGuiFrame {

	private JFrame traderFrame;
	
	private int frameWidth = 300;
	private int frameHeight = 300;
	
	public JButton marketBuy, marketSell, limitBid, limitOffer;
	public JTextField marketQuantity, limitQuantity, limitPrice;
	
	public TraderGuiFrame() {
		
		traderFrame = new JFrame();
		traderFrame.setLayout(new GridLayout(7,1));
		
		marketBuy = new JButton("Buy");
		marketSell = new JButton("Sell");
		
		marketQuantity = new JTextField();
		
		limitBid = new JButton("Bid");
		limitOffer = new JButton("Offer");

		limitQuantity = new JTextField();
		limitPrice = new JTextField();
		
		
		
		render();
	}
	
	public void render() {
		
		// Add Buy/Sell Buttons onto the Trader Gui
		
		JPanel marketOrderButtons = new JPanel(new GridLayout(1,2));
		
		marketOrderButtons.add(marketBuy);
		marketOrderButtons.add(marketSell);
		
		traderFrame.add(marketOrderButtons);
		
		// Add Market Quantity TextField and TextField Label to Trader Gui
		
		JPanel marketOrderFields = new JPanel(new GridLayout(2,1));
		
		marketOrderFields.add(new JLabel("Quantity"), BorderLayout.WEST);
		marketOrderFields.add(marketQuantity, BorderLayout.CENTER);

		traderFrame.add(marketOrderFields);
		
		// Add Separator to Trader Gui;
		
		traderFrame.add(new JSeparator(SwingConstants.HORIZONTAL));
		
		// Add Bid/Offer Buttons onto the Trader Gui
		JPanel limitOrderButtons = new JPanel(new GridLayout(1,2));
		
		limitOrderButtons.add(limitBid);
		limitOrderButtons.add(limitOffer);
		
		traderFrame.add(limitOrderButtons);
		
		// Add Limit Quantity TextField, Limit Price TextField and TextField Labels to Trader Gui
		JPanel limitOrderFields = new JPanel();
		GridLayout limitOrderFieldsLayout = new GridLayout(2,2);
		limitOrderFields.setLayout(limitOrderFieldsLayout);
		
		limitOrderFields.add(new JLabel("Quantity"));
		limitOrderFields.add(new JLabel("Price"));
		
		limitOrderFields.add(limitQuantity);
		limitOrderFields.add(limitPrice);

		traderFrame.add(limitOrderFields);
		
		// Add Separator to Trader Gui;
		traderFrame.add(new JSeparator(SwingConstants.HORIZONTAL));
		
		// Add Console to Trader Gui
		JPanel traderConsole = new JPanel();
		traderConsole.add(new JLabel("Console"));
		
		traderFrame.add(traderConsole);
	}
	
	public void show() {
		
		GraphicsConfiguration gc = traderFrame.getGraphicsConfiguration();  
		Rectangle bounds = gc.getBounds();
		   
		// Set the Location and Activate  
		traderFrame.setLocation((int) ((bounds.width / 2) + 50), (int) ((bounds.height / 2) - (frameHeight / 2))); 

		traderFrame.setSize(frameWidth, frameHeight);
		
		System.out.println("Works");
		traderFrame.setVisible(true);
	}
}
