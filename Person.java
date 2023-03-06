/** Since dealer and player are a kind of person, we will create a parent class for 
 *  them */

public class Person {
	private Hand hand;
	private String name;


	public Person() {
		this.hand = new Hand();
	}


	public void hit(Deck deck) {
		hand.drawCard(deck); 
	}


	public boolean hasBlackjack() {
		return (hand.totalValue() == 21);
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public Hand getHand() {
    	return hand;
    }

}