package examples.MarketSimulator.orderBookDataStructure.orderBookEntry;

import examples.MarketSimulator.marketInstance.MarketAgent;

public class OrderBookEntryBid extends OrderBookEntryLimit {
	
	public OrderBookEntryBid() {
		
		super (MarketAgent.agent.orderBook.orderBookOffers, MarketAgent.agent.orderBook.orderBookBids);
	}

	public void execute(OrderBookEntry orderBookEntry) {
		
		super.execute(orderBookEntry);
	}
}
