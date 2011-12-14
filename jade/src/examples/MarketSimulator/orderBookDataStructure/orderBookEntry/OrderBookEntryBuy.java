package examples.MarketSimulator.orderBookDataStructure.orderBookEntry;

import examples.MarketSimulator.marketInstance.MarketAgent;

public class OrderBookEntryBuy extends OrderBookEntryExecute {
	
	public OrderBookEntryBuy() {
		
		super (MarketAgent.agent.orderBook.orderBookOffers, MarketAgent.agent.orderBook.orderBookBids);
	}

	public void execute(OrderBookEntry orderBookEntry) {
		
		super.execute(orderBookEntry);
	}
}
