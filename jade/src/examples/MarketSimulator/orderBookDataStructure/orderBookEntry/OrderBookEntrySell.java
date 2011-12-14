package examples.MarketSimulator.orderBookDataStructure.orderBookEntry;

import examples.MarketSimulator.marketInstance.MarketAgent;

public class OrderBookEntrySell extends OrderBookEntryExecute {
	
	public OrderBookEntrySell() {
		
		super (MarketAgent.agent.orderBook.orderBookBids, MarketAgent.agent.orderBook.orderBookOffers);
	}

	public void execute(OrderBookEntry orderBookEntry) {
		
		super.execute(orderBookEntry);
	}
}
