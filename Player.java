import java.util.Scanner;

public class Player extends Person{

    Scanner input = new Scanner(System.in);

   	public Player() {
    	super();
    	this.setName("Player");
    }

    public void showHand() {
        System.out.println("-----Player's Hand-----");
        System.out.println(this.getHand());
        System.out.println("-----------------------");
    }


    public void decision(Deck deck) {
        
        boolean validInput = false;
        int decision = 0;

        while (!validInput) {
            try {
                System.out.println("1)Hit or 2)Stand");
                decision = input.nextInt();
                validInput = true;
            }
            catch (Exception e){
                System.out.println("Invalid input. Please enter either 1 or 2.");
                input.next();
            }
        System.out.println("You selected: " + decision);
        }
    }

}
