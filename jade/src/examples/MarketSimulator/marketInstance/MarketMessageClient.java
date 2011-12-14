package examples.MarketSimulator.marketInstance;

import java.util.StringTokenizer;

import examples.MarketSimulator.orderBookDataStructure.orderBookEntry.OrderBookEntryType;
import examples.MarketSimulator.orderBookGui.OrderBookGui;

import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class MarketMessageClient extends CyclicBehaviour{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MarketControler marketControler;
	String tradeID, type;
	int quantity, price;
	OrderBookGui orderBookGui;
	
	public MarketMessageClient() {
		
	}
	

	public OrderBookEntryType orderType(int type) {
		
		switch (type) {

			case(0): return OrderBookEntryType.BUY;
			case(1): return OrderBookEntryType.SELL;
			case(2): return OrderBookEntryType.BID;
			case(3): return OrderBookEntryType.OFFER;
			//case(5): return CANCEL;
		}
		return null;
	}
	
	public void action() {
			
		ACLMessage reply = MarketAgent.agent.receive();
		
		if (reply!=null) {

			StringTokenizer st1 = new StringTokenizer(reply.getContent(), ",");
			tradeID = st1.nextToken();
			type = st1.nextToken();
			quantity = Integer.parseInt(st1.nextToken());
			
			if (st1.hasMoreTokens()) {
				price = Integer.parseInt(st1.nextToken());
				new MarketControler(tradeID,orderType(Integer.parseInt(type)),quantity,price);
			} else new MarketControler(tradeID,orderType(Integer.parseInt(type)),quantity);
			
			reply = null;
		}
	}
}
