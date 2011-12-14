package examples.MarketSimulator.orderBookDataStructure.orderBookEntry;

import examples.MarketSimulator.marketInstance.MarketAgent;

public class OrderBookEntryOffer extends OrderBookEntryLimit {
	
	public OrderBookEntryOffer() {
		
		super (MarketAgent.agent.orderBook.orderBookBids, MarketAgent.agent.orderBook.orderBookOffers);
	}

	public void execute(OrderBookEntry orderBookEntry) {
		
		super.execute(orderBookEntry);
	}
}
