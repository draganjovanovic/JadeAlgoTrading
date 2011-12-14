package examples.MarketSimulator.traderInstance;

import java.util.ArrayList;

public class TraderOrderList {
	
	public ArrayList<TraderOrder> traderOrders;
	
	public TraderOrderList(){
		
		traderOrders = new ArrayList<TraderOrder>();
	}
	
	public void add(TraderOrder traderOrder) {
		
		traderOrders.add(traderOrder);
	}
}
