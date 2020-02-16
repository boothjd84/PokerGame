package PokerGame;

import java.util.*;



public class PokerParticipant {
	public ArrayList<Card> hand = new ArrayList<>();
	public PokerParticipant() {
		// TODO Auto-generated constructor stub
	}

	public void setScore() {
		
	}
	public void getScore() {
		
	}
	public ArrayList<Card> getHand(ArrayList<Card> h) {
		if(this.hand != null) {
			return this.hand;
		}else {
			return h;
		}
	}
	public void setHand(ArrayList<Card> h) {
		this.hand = h;
	}
}
