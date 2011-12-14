package examples.MarketSimulator.traderInstance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class TraderAgentGuiActionListener {
	
	private JTextField quantity, price;
	private String market, orderType;
	private TraderOrder traderOrder;
	
	public TraderAgentGuiActionListener(String market, String orderType) {
		
		this.market = market;
		this.orderType = orderType;
	}
	
	public void addTraderAction(JButton jButton, JTextField jTextField) {
		
		quantity = jTextField;
		
		jButton.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
            	
            	traderOrder = new TraderOrder(orderType, quantity.getText());
            	TraderAgent.agent.traderOrderList.add(traderOrder);
            	TraderAgent.agent.addBehaviour(new TraderMessageClient(market, traderOrder.tokenize()));
            	
            	for (TraderOrder i : TraderAgent.agent.traderOrderList.traderOrders) {
            		
            		System.out.println(i.getOrderID());
            	}
            }
        }); 
	}
	
	public void addTraderAction(JButton jButton, JTextField jTextField, JTextField jTextField1) {
		
		quantity = jTextField;
		price = jTextField1;

		jButton.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
            	traderOrder = new TraderOrder(orderType, quantity.getText(), price.getText());
            	TraderAgent.agent.traderOrderList.add(traderOrder);
            	TraderAgent.agent.addBehaviour(new TraderMessageClient(market, traderOrder.tokenize()));
            }
        }); 
	}
}
