package examples.MarketSimulator.orderBookDataStructure.orderBookEntry;

import examples.MarketSimulator.orderBookDataStructure.OrderBookList;

public class OrderBookEntryLimit extends OrderBookEntryType {

	private OrderBookList orderBookListExecute, orderBookListBook;
	private int price, quantity;
	private OrderBookEntry orderBookEntry;

	public OrderBookEntryLimit(OrderBookList orderBookListExecute, OrderBookList orderBookListBook) {

		this.orderBookListExecute = orderBookListExecute;
		this.orderBookListBook = orderBookListBook;	
	}
	
	public void bookOrder(OrderBookEntry orderBookEntry) {
		
		orderBookListBook.bookOrder(orderBookEntry);
	}
	
	@Override
	public int getPrice() {
	
		if (orderBookListExecute.size() != 0) {
			
			return this.orderBookEntry.getPrice();
		} else {
			
			return 0;
		}
	}
	
	public void execute(OrderBookEntry orderBookEntry) {
		
		this.orderBookEntry = orderBookEntry;
		quantity = orderBookEntry.getQuantity();
		OrderBookEntry bestOrder;
		
		if (price != 0) {
			
			while (quantity > 0) {
				
				bestOrder = orderBookListExecute.getBestPrice().get(0); 

				
				System.out.println("Order Price" + price);
				System.out.println("Book Price" + bestOrder.getPrice());
				
				if (quantity < bestOrder.getQuantity() && price < bestOrder.getPrice()*-1) {

					// Fill
					bestOrder.ammendQuantity(
							bestOrder.getQuantity() - quantity);
					break;
					
				} else if (quantity >= bestOrder.getQuantity() && price < bestOrder.getPrice()*-1) {
					
					// Partial Fill
					quantity -= bestOrder.getQuantity();
					orderBookListExecute.removeBestOrder();
				} else {

					bookOrder(orderBookEntry);
					break;
				}
				
				if (orderBookListExecute.size() == 0) {
					

					bookOrder(orderBookEntry);
					break;
				}
			}
			
		} else {
		
			bookOrder(orderBookEntry);
		}
	}
}
