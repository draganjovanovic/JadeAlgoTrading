package examples.MarketSimulator;

public abstract class AgentOrder {

	protected String type,quantity, price;

	public AgentOrder(String type, String price, String quantity) {
		
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	
	public AgentOrder(String type, String quantity) {
	
	this.type = type;
	this.quantity = quantity;
}

	public abstract String getOrderID();
	
	public String getType() {
		
		return type;
	}
	
	public String getQuantity() {
		
		return quantity;
	}
}
