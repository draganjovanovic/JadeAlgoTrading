package examples.MarketSimulator.marketInstance;

import examples.MarketSimulator.AgentStarter;
import examples.MarketSimulator.orderBookDataStructure.OrderBook;

public class MarketAgent extends AgentStarter {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static MarketAgent agent;
	public OrderBook orderBook;
	
	
	public MarketAgent() {
		
		super(new MarketGui());
		MarketAgent.agent = this;
		orderBook = new OrderBook();
		
		addBehaviour(new MarketMessageClient());
	}
}
