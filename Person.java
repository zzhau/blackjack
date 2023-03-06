/** Since dealer and player are a kind of person, we will create a parent class for 
 *  them */

public class Person {
	private Hand hand;

	public Person(Hand hand) {
		this.hand = hand;
	}

	public void hit(Deck deck) {
		hand.drawCard(deck); 
	}

	public boolean hasBlackjack() {
		return (hand.totalValue() == 21);
	}
}