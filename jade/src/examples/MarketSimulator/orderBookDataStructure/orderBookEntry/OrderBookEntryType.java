package examples.MarketSimulator.orderBookDataStructure.orderBookEntry;

public abstract class OrderBookEntryType {

	public static final OrderBookEntryType BUY = new OrderBookEntryBuy();
	public static final OrderBookEntryType SELL = new OrderBookEntrySell();
	public static final OrderBookEntryType BID = new OrderBookEntryBid();
	public static final OrderBookEntryType OFFER = new OrderBookEntryOffer();
	//public static final OrderBookEntryType CANCEL = new OrderBookEntryCancel();
	
	public abstract int getPrice();
	public abstract void execute(OrderBookEntry orderBookEntry);
	
}
