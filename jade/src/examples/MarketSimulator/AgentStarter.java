package examples.MarketSimulator;

import jade.core.Agent;

public abstract class AgentStarter extends Agent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AgentRegistration traderRegistration;
	private AgentGui agentGui;
	
	public AgentStarter(AgentGui agentGui) {
		
		traderRegistration = new AgentRegistration(this);
		this.agentGui = agentGui;
	}
	
	protected void setup() {
		
		// Start Up Trader GUI
		agentGui.setup();
				
		// Register to the JADE Framework
		traderRegistration.register(getAID());
				
		// Acknowledge Initiation
		System.out.println("Thanks for starting me up! I'm: " + getAID().getLocalName());
			
	}
	
	protected void takeDown() {
		
		// Printout a dismissal message
		System.out.println("Buyer-agent "+getAID().getName()+" terminating.");
	}
	
}
