package examples.MarketSimulator.orderBookDataStructure.orderBookEntry;

public class OrderBookEntryHandler {

	private OrderBookEntryType orderBookEntryType;
	
	public OrderBookEntryHandler(String type) {
		
		if (type.equals("Buy")) {
			
			this.orderBookEntryType = new OrderBookEntryBuy();
		
		} else if(type.equals("Sell")) {
			
			this.orderBookEntryType = new OrderBookEntrySell();
		
		} else if(type.equals("Bid")) {
			
			this.orderBookEntryType = new OrderBookEntryBid();
		
		}  else if(type.equals("Offer")) {
		
			this.orderBookEntryType = new OrderBookEntryOffer();
		}
	}
	
	public OrderBookEntryType getType() {
		
		return orderBookEntryType;
	}
}
