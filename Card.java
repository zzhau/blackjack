/** A card needs to have a Rank and a Suit hence that will be its constructor.
 *  The toString() method is automatically called everytime we call this object 
 *  in a println().
 */

public class Card {
	private Suit suit; 
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String toString() {
		return (rank + " of " + suit);
	}

	public int getValue() {
		return rank.getValue();
	}

	public String getSuit() {
		return suit.getSuit();
	}
}
