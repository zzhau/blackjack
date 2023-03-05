/** We use ArrayList instead of the Java built in Array because Arraylist is a resizable array.
 *  This means that we can adjust the array when cards are drawn or added back to the deck.
 *  This also keep the option to add multiple deck in the future. As of now, we will be working 
 *  with just a single deck instead. 
 * 
 * 	https://www.w3schools.com/java/java_arraylist.asp contains more information about how to 
 *  use ArrayList. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck{
	private ArrayList<Card> shoe;


	public Deck() {
		shoe = new ArrayList<Card>(); //Only create the ArrayList that hold object Card if Deck() constructor is called.
	}


	public void shuffle() {
		Collections.shuffle(shoe); // Collections.shuffle() will only work with List. It works with ArrayList since ArrayList implements the List interface.
	}

	/** Since it does not matter which card we draw from the deck, we generate a random int respective to the size of the 
	 *  shoe and get the card object and remove it from the arraylist. */
	public Card drawCard() {
		Random rand = new Random();
		int index = rand.nextInt(shoe.size());
		Card card = shoe.get(index);
		shoe.remove(index);
		return card;
	}


	public void addCard(Card card) {
		shoe.add(card);
	}


	public String toString() {	
		String allCard = "";

		for(Card card : shoe) {
			allCard += (card + "\n");
		}

		return allCard;
	}


	/** To iterate over an enumeration, we use values() method which is implicitly declared by the compiler. 
	 *  So it is not listed on Enum doc. 
	 * 
	 * 	suit and value here are instances of Suit and Rank hence we can call the Card(constructor) that way.
	 *  Note that we are adding the card into the Arraylist shoe so we can just use the .add() function for
	 *  arrayList and not the addCard() function we have defined.*/
	public void prepareDeck() {
		for (Suit suit : Suit.values()) {	
			for (Rank value : Rank.values()) {
				shoe.add(new Card(suit, value));
			}
		}
	}


	public void clear() {
		shoe.clear();	// Empty the shoe for the game to reshuffle the deck.
	}
}