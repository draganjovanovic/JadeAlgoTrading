package examples.MarketSimulator.orderBookDataStructure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

import examples.MarketSimulator.orderBookDataStructure.orderBookEntry.OrderBookEntry;
import examples.MarketSimulator.orderBookDataStructure.orderBookEntry.OrderBookEntryType;

public class OrderBookingEngine {
	
	protected LinkedList <ArrayList<OrderBookEntry>> orderBookList;
	//private Iterator<ArrayList<OrderBookEntry>> iterator;
	
	protected OrderBookingEngine(LinkedList <ArrayList<OrderBookEntry>> orderBookList) {
		
		this.orderBookList = orderBookList;
 		//this.iterator = orderBookList.iterator();
	}
	
	private ArrayList<OrderBookEntry> createOrder(String orderID, OrderBookEntryType type, int price, int quantity) { 
		
		return new ArrayList<OrderBookEntry>(Arrays.asList(
				new OrderBookEntry(orderID, type, price, quantity)));
	}
	
	ArrayList<OrderBookEntry> temp;
	
	protected boolean book(String orderID, OrderBookEntryType type, int price, int quantity) {
		
		ListIterator<ArrayList<OrderBookEntry>> iterator = orderBookList.listIterator();;
		while (iterator.hasNext()) {
		
			temp = iterator.next();
			int nextBestPrice = temp.get(0).getPrice();
			
			if (nextBestPrice == price) {
				temp.add(new OrderBookEntry(orderID, type, price, quantity));
				return true;
				
			} else if ((nextBestPrice > price)) {
				
				orderBookList.add(iterator.previousIndex(),
						createOrder(orderID, type, price, quantity));
				return true;
				
			} else if ((nextBestPrice < price) && (iterator.hasNext())) {
				continue;
				
			} else if (nextBestPrice < price) {
				orderBookList.addLast(createOrder(orderID, type, price, quantity));
				return true;
			}
		}
		
		if (orderBookList.size() == 0) {

			orderBookList.addFirst(createOrder(orderID, type, price, quantity));
			return true;
		}
		
		return false;
	}
}
