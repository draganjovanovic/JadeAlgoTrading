package examples.MarketSimulator.orderBookDataStructure.orderBookEntry;

import examples.MarketSimulator.orderBookDataStructure.OrderBookList;

public class OrderBookEntryExecute extends OrderBookEntryType {

	private int price = 0;
	private OrderBookList orderBookListExecute, orderBookListBook;

	public OrderBookEntryExecute(OrderBookList orderBookListExecute, OrderBookList orderBookListBook) {

		this.orderBookListExecute = orderBookListExecute;
		this.orderBookListBook = orderBookListBook;	
	}
	
	public int getPrice() {
		
		if (orderBookListExecute.size() != 0) {
			
			price = orderBookListExecute.get(0).get(0).getPrice();
		} else {
			this.price = 0;
		}

	return price;
	}
	
	public void execute(OrderBookEntry orderBookEntry) {
		
		int quantity = orderBookEntry.getQuantity();
		OrderBookEntry bestOrder;
		
		if (price != 0) {
			
			while (quantity > 0) {
				
				bestOrder = orderBookListExecute.getBestPrice().get(0); 
				 
				if (quantity < bestOrder.getQuantity()) {

					// Fill
					bestOrder.ammendQuantity(
							bestOrder.getQuantity() - quantity);
					break;
					
				} else if ((quantity >= bestOrder.getQuantity())) {
					
					// Partial Fill
					quantity -= bestOrder.getQuantity();
					orderBookListExecute.removeBestOrder();
				}
				
				if (orderBookListExecute.size() == 0) {
					
					orderBookEntry.setPrice(-1*bestOrder.getPrice());
					orderBookEntry.setQuantity(quantity);
					orderBookListBook.bookOrder(orderBookEntry);
					break;
				}
			}
			
		} else {
		
			// reject order
			System.out.println("Rejected");
		}
	}
}
