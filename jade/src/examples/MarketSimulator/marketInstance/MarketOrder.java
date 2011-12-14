package examples.MarketSimulator.marketInstance;

import examples.MarketSimulator.AgentOrder;

public class MarketOrder extends AgentOrder {

	private String orderID;
	private int orderCount = 0;
	
	public MarketOrder(String orderID, String type, String quantity) {
		
		super(type, quantity);
		this.orderID = orderID;
	}
	
	public MarketOrder(String orderID, String type, String quantity, String price) {

		super(type, quantity, price);
		this.orderID = orderID + orderCount++; 
	}
	
	public String getOrderID() {
		
		return orderID;
	}
}
