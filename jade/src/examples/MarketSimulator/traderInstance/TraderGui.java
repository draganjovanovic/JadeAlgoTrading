 package examples.MarketSimulator.traderInstance;

import examples.MarketSimulator.AgentGui;

public class TraderGui extends TraderGuiFrame implements AgentGui {
	
	private String market;

	public TraderGui(String market) {
		
		super();
		this.market = market;
	}

	public void setup() {
		
		show();

		// Initialize Button Actions
		TraderAgentGuiActionListener marketOrderBuy = 
				new TraderAgentGuiActionListener(market, "Buy");
		marketOrderBuy.addTraderAction(marketBuy, marketQuantity);
		
		TraderAgentGuiActionListener marketOrderSell = 
				new TraderAgentGuiActionListener(market, "Sell");
		marketOrderSell.addTraderAction(marketSell, marketQuantity);

		TraderAgentGuiActionListener limitOrderBid = 
				new TraderAgentGuiActionListener(market, "Bid");
		limitOrderBid.addTraderAction(limitBid, limitQuantity, limitPrice);

		TraderAgentGuiActionListener limitOrderOffer = 
				new TraderAgentGuiActionListener(market, "Offer");
		limitOrderOffer.addTraderAction(limitOffer, limitQuantity, limitPrice);
	}
}
