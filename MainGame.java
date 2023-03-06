/** This is going to be the driver class of the program which will create an instance 
 * of the Game class */

public class MainGame{

	public static void main(String[] args){
		System.out.println("Welcome to my Blackjack game");

		Deck shoe = new Deck();
		shoe.prepareDeck();
		shoe.shuffle();
		Hand hand = new Hand();
		hand.drawCard(shoe);
		hand.drawCard(shoe);
		// System.out.println(shoe);
		// System.out.println(hand);
		// System.out.println(hand.totalValue());

		Dealer myDealer = new Dealer();
		Dealer nes = myDealer;
		nes.setName("Hi");
		System.out.println("The dealer's name is: " + myDealer.getName());
	}
}