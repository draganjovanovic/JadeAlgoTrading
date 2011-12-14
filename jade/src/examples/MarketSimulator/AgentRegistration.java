package examples.MarketSimulator;

import examples.MarketSimulator.AgentRegistration;
import jade.core.AID;
import jade.core.Agent;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;

/*
 * Registers the Trader Agent onto the JADE Agent Framework
 */

public class AgentRegistration {
	
	private DFAgentDescription dfd;
	private Agent agent;
	
	public AgentRegistration(Agent agent) {
		
		dfd = new DFAgentDescription();
		this.agent = agent;
	}
	
	public void register(AID id) {
		
		//Register yourself as an agent
		dfd.setName(id);
		
		try {
			DFService.register(agent, dfd);
		} catch (FIPAException fe) {
			fe.printStackTrace();
		}
	}
}
