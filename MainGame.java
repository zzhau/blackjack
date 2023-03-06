/** This is going to be the driver class of the program which will create an instance 
 * of the Game class */

public class MainGame{

	public static void main(String[] args){
		System.out.println("Welcome to my Blackjack game");
		Game start = new Game();
		System.out.println(start.getDealer().getHand());
		System.out.println(start.getDealer().getHand().totalValue());
		System.out.println(start.getPlayer().getHand());
		System.out.println(start.getPlayer().getHand().totalValue());
		System.out.println(start.getDeck().getSize());
	}
}