package goh.system.gui;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import goh.players.Player;

@SuppressWarnings("serial")
public class Hand extends JFrame {
	
	// Attributes
	private Player handPlayer;
	private ArrayList<String> hand = new ArrayList<String>();
	private String[] handList = new String[hand.size()];
	

	// Getters & Setters
	public ArrayList<String> getHand() {
		return hand;
	}

	public void setHand(ArrayList<String> hand) {
		this.hand = hand;
	}

	public Player getHandPlayer() {
		return handPlayer;
	}

	public void setHandPlayer(Player handPlayer) {
		this.handPlayer = handPlayer;
	}
	
	public String[] getHandList() {
		return handList;
	}

	public void setHandList(String[] handList) {
		this.handList = handList;
	}

	// Constructors
	public Hand() {
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Main");
		this.setSize(300, 300);
		this.setVisible(true);
		
		hand.add("Carte 1");
		hand.add("Carte 2");
		hand.add("Carte 3");
		hand.add("Carte 4");
		hand.add("Carte 5");
		
		
		JList<String> jHand = new JList<String>(hand.toArray(handList));
		this.add(jHand);
		this.pack();
		jHand.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		jHand.setLayoutOrientation(JList.HORIZONTAL_WRAP);

		
		
	}

}
