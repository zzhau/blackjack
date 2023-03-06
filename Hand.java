import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> hand;

    public Hand() {
    	hand = new ArrayList<Card>();
    }


    public void drawCard(Deck deck) {
    	hand.add(deck.drawCard());
    }


    public Card getCard(int index) {
        return hand.get(index);
    }


    public int totalValue() {
    	int value = 0;

    	for (Card card : hand) {
    		// The Ace Card only has a value of 1 if the player has more than 2 card.
    		if ((hand.size() > 2) && (card.getValue() == 11)) {
    				value += 1;
    		}
    		else {
    			value += card.getValue();
    		}
    	}
    	return value;
    }

    public String toString() {
    	String temp = "";
    	for (Card card : hand) {
	    	temp += ("[" + card + "]");
    	}
    	return temp;
    }
}
