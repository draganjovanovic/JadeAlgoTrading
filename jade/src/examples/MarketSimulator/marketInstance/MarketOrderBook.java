package examples.MarketSimulator.marketInstance;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JLabel;

public class MarketOrderBook {

	static LinkedList <ArrayList<Integer>> orderBookSell = new LinkedList<ArrayList<Integer>>();
	static Iterator iterator;
	static JTextField priceField1;
	static JTextField priceField2;
	static JTextField priceField3;
	static JTextField priceField4;
	static JTextField priceField5;
	static JTextField priceField6;
	static JTextField priceField7;
	static JTextField priceField8;
	static JTextField priceField9;
	static JTextField priceField10;
	
	public void buildOrderBookSell() {
		
		orderBookSell.add(0, null);
		orderBookSell.add(1, new ArrayList<Integer>(Arrays.asList(23,46,23,76,23,67)));
		orderBookSell.add(2, new ArrayList<Integer>(Arrays.asList(23,45,23,12,13)));
		orderBookSell.add(3, new ArrayList<Integer>(Arrays.asList(12,33,12,23)));
		orderBookSell.add(4, new ArrayList<Integer>(Arrays.asList(12,42,1)));
		orderBookSell.add(5, new ArrayList<Integer>(Arrays.asList(12,13,13)));
		orderBookSell.add(6, new ArrayList<Integer>(Arrays.asList(12,4,6)));
		orderBookSell.add(7, new ArrayList<Integer>(Arrays.asList(12,3,6)));
		orderBookSell.add(8, new ArrayList<Integer>(Arrays.asList(4,6,2,6)));
		orderBookSell.add(9, new ArrayList<Integer>(Arrays.asList(1,5)));
		orderBookSell.add(10, new ArrayList<Integer>(Arrays.asList(3)));
		
	}
	
	public static void drawOrderBookSell() {
		
		JFrame orderBookSellGui = new JFrame();

		orderBookSellGui.setBounds(0, 400, 300, 300);
		orderBookSellGui.setLayout(new GridLayout(11,1));
		
		
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		
		priceField1 = new JTextField();
		panel1.add(new JLabel("$1"), BorderLayout.WEST);
		panel1.add(priceField1, BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		
		priceField2 = new JTextField();
		panel2.add(new JLabel("$2"), BorderLayout.WEST);
		panel2.add(priceField2, BorderLayout.CENTER);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		
		priceField3 = new JTextField();
		panel3.add(new JLabel("$3"), BorderLayout.WEST);
		panel3.add(priceField3, BorderLayout.CENTER);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new BorderLayout());
		
		priceField4 = new JTextField();
		panel4.add(new JLabel("$4"), BorderLayout.WEST);
		panel4.add(priceField4, BorderLayout.CENTER);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new BorderLayout());
		
		priceField5 = new JTextField();
		panel5.add(new JLabel("$5"), BorderLayout.WEST);
		panel5.add(priceField5, BorderLayout.CENTER);
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(new BorderLayout());
		
		priceField6 = new JTextField();
		panel6.add(new JLabel("$6"), BorderLayout.WEST);
		panel6.add(priceField6, BorderLayout.CENTER);

		JPanel panel7 = new JPanel();
		panel7.setLayout(new BorderLayout());
		
		priceField7 = new JTextField();
		panel7.add(new JLabel("$7"), BorderLayout.WEST);
		panel7.add(priceField7, BorderLayout.CENTER);
		
		JPanel panel8 = new JPanel();
		panel8.setLayout(new BorderLayout());
		
		priceField8 = new JTextField();
		panel8.add(new JLabel("$8"), BorderLayout.WEST);
		panel8.add(priceField8, BorderLayout.CENTER);
		
		JPanel panel9 = new JPanel();
		panel9.setLayout(new BorderLayout());
		
		priceField9 = new JTextField();
		panel9.add(new JLabel("$9"), BorderLayout.WEST);
		panel9.add(priceField9, BorderLayout.CENTER);
		
		JPanel panel10 = new JPanel();
		panel10.setLayout(new BorderLayout());
		
		priceField10 = new JTextField();
		panel10.add(new JLabel("$10"), BorderLayout.WEST);
		panel10.add(priceField10, BorderLayout.CENTER);
		
		orderBookSellGui.add(new JLabel("Order Book Sell"));
		orderBookSellGui.add(panel1);
		orderBookSellGui.add(panel2);
		orderBookSellGui.add(panel3);
		orderBookSellGui.add(panel4);
		orderBookSellGui.add(panel5);
		orderBookSellGui.add(panel6);
		orderBookSellGui.add(panel7);
		orderBookSellGui.add(panel8);
		orderBookSellGui.add(panel9);
		orderBookSellGui.add(panel10);
		
		orderBookSellGui.setVisible(true);
	}
	
	public static void print() {
		
		System.out.println("\n-------Order Book Sells and Offers-------");
		
		iterator = orderBookSell.iterator();

		iterator.next();
		
		priceField1.setText(iterator.next().toString());
		priceField2.setText(iterator.next().toString());
		priceField3.setText(iterator.next().toString());
		priceField4.setText(iterator.next().toString());
		priceField5.setText(iterator.next().toString());
		priceField6.setText(iterator.next().toString());
		priceField7.setText(iterator.next().toString());
		priceField8.setText(iterator.next().toString());
		priceField9.setText(iterator.next().toString());
		priceField10.setText(iterator.next().toString());
		
		/*int i =1;
		while (iterator.hasNext()) {
			
			System.out.println("$" +i++ + " " +iterator.next());
		}*/
	
	}
	
}
