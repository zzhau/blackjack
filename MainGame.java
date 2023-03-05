/** This is going to be the driver class of the program which will create an instance 
 * of the Game class */

public class MainGame{

	public static void main(String[] args){
		System.out.println("Welcome to my Blackjack game");
		Suit a = Suit.CLUBS;
		Rank b = Rank.ACE;
		Card c = new Card(a, b);
		System.out.println(c.getSuit());
	}
}