package examples.MarketSimulator.orderBookDataStructure;

public class OrderBook {

	public OrderBookList orderBookBids, orderBookOffers;

	public OrderBook() {

		orderBookBids = new OrderBookBids();
		orderBookOffers = new OrderBookOffers();
	}
}
