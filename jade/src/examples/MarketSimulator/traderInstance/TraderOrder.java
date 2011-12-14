package examples.MarketSimulator.traderInstance;

import examples.MarketSimulator.AgentOrder;

public class TraderOrder extends AgentOrder {

	private String orderID;
	private String tradeTokens;

	public TraderOrder(String type, String quantity) {
		
		super(type, quantity);
		this.tradeTokens = String.format("%s,%s,%s,%s", orderID, type, quantity, price);
	}
	
	public TraderOrder(String type, String quantity, String price) {

		super(type, quantity, price);
		this.tradeTokens = String.format("%s,%s,%s,%s", orderID, type, quantity, price);
	}
	
	public String getOrderID() {
		
		return orderID;
	}
	
	public String tokenize() {
		
		return tradeTokens;
	}
}
