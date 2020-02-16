package PokerGame;

public class Card {

	public Card() {
		// TODO Auto-generated constructor stub
	}
	public void setSuit() {
	
	}
	public int getSuit() {
		double randNum = Math.random()*4+1;
		int suit = (int) randNum;
		return suit;
	}
	public void setRank() {
		
	}
	public int getRank() {
		double randNum = Math.random()*13+1;
		int rank = (int) randNum;
		return rank;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c = new Card();
		
		  int cs = c.getSuit();
	        String cardSuit = null;
	        switch (cs) {
	            case 1:  cardSuit = "Spade";
	                     break;
	            case 2:  cardSuit = "Club";
	                     break;
	            case 3:  cardSuit = "Heart";
                	break;
	            case 4:  cardSuit = "Diamond";
                	break;
	            default: cardSuit = "Invalid";
                	break;
	        }
	        int cardNumRank = (int)c.getRank();
	        String cardHighRank = null;
	        switch (cardNumRank) {
	            case 1:  cardHighRank = "Ace";
	                     break;
	            case 11:  cardHighRank = "Jack";
	                     break;
	            case 12:  cardHighRank = "Queen";
                	break;
	            case 13:  cardHighRank = "King";
                	break;
	            default: cardNumRank = cs;
                	break;
	        }
	        if(cardHighRank != (null)) {
				System.out.println(cardHighRank + " of " + cardSuit);
	        }else {
				System.out.println(cardNumRank + " of " + cardSuit);
	        }

		System.gc();
        Runtime.getRuntime().gc(); 
	}

}
