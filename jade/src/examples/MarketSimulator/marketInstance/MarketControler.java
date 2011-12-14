package examples.MarketSimulator.marketInstance;

import examples.MarketSimulator.orderBookDataStructure.orderBookEntry.OrderBookEntry;
import examples.MarketSimulator.orderBookDataStructure.orderBookEntry.OrderBookEntryType;
import java.util.Random;

public class MarketControler {
	
	private OrderBookEntry orderBookEntry;
	private static Random generator = new Random();
	private static Random generator1 = new Random();
	
	
	public MarketControler(String orderID, OrderBookEntryType type, int quantity, int price) {
		
		this.orderBookEntry = new OrderBookEntry(orderID, type, quantity, price);
	}
	
	public MarketControler(String orderID, OrderBookEntryType type, int quantity) {

		this.orderBookEntry = new OrderBookEntry(orderID, type, quantity);
	}
	
	public void handle() {
		
		this.orderBookEntry.execute();
	}

	public static void main(String args[]) {
		
		MarketAgent marketAgent = new MarketAgent();
		//arketAgent.agent.orderBook.printTreeBids();
		int i = 0;

		for (int r = 0 ; r <= 200 ; r++) {
			
		    int price = generator.nextInt(100) + 1;
		    int quantity = generator1.nextInt(450) + 51;
		    new MarketControler("Offer" + r, OrderBookEntryType.OFFER, price, quantity).handle();
		}

		MarketAgent.agent.orderBook.orderBookOffers.printTree();
		
		
		/*System.out.println("///");
		MarketAgent.agent.orderBook.orderBookBids.printTree();
		MarketAgent.agent.orderBook.orderBookOffers.printTree();*/
	}
}
