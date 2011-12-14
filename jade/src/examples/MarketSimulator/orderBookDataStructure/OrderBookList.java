package examples.MarketSimulator.orderBookDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import examples.MarketSimulator.orderBookDataStructure.orderBookEntry.OrderBookEntry;
import examples.MarketSimulator.orderBookDataStructure.orderBookEntry.OrderBookEntryType;


public abstract class OrderBookList extends OrderBookingEngine {
	
	public OrderBookList() {
		
		super(new LinkedList<ArrayList<OrderBookEntry>>());
	}

	public boolean bookOrder(String orderID, OrderBookEntryType type, int price, int quantity) {
		
		return  book(orderID, type, price, quantity);
	}
	
	public boolean bookOrder(OrderBookEntry orderBookEntry) {
		
		return  book(orderBookEntry.getOrderID(), orderBookEntry.getType(), orderBookEntry.getPrice(), orderBookEntry.getQuantity());
	}
	
	public void remove(int i) {
		
		orderBookList.remove(i);
	}
	
	public ArrayList<OrderBookEntry> getBestPrice() {
		
		return orderBookList.get(0);
	}
	
	public void removeBestOrder() {
		
		if (getBestPrice().size() > 1) getBestPrice().remove(0);
		else orderBookList.remove(0);
	}
	
	public ArrayList<OrderBookEntry> get(int i) {
		
		return orderBookList.get(i);
	}
	
	public int size() {
		
		return orderBookList.size();
	}
	
	public void printTree() {
		
		ListIterator<ArrayList<OrderBookEntry>> iterator = orderBookList.listIterator();

		//iterator.next();
		while (iterator.hasNext()) {
			
			for (OrderBookEntry i : iterator.next()) {
				System.out.print(String.format("%s, %s, %s; ", i.getOrderID(), i.getPrice(), i.getQuantity()));
			}
		System.out.println();
		}
	}
}
