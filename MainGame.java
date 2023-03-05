/** This is going to be the driver class of the program which will create an instance 
 * of the Game class */

public class MainGame{

	public static void main(String[] args){
		System.out.println("Welcome to my Blackjack game");

		Deck shoe = new Deck();
		shoe.prepareDeck();
		shoe.shuffle();
		// Card a = shoe.drawCard();
		System.out.println(shoe.size());
		// System.out.println(a);
	}
}