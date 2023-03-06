/** This is going to be the driver class of the program which will create an instance 
 *  of the Game class 
 *  */

public class MainGame{
	private boolean gameEnd = false; 

	public static void main(String[] args){
		System.out.println("Welcome to my Blackjack game");
		Game game = new Game();
	}
}