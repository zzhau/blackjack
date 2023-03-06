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

    /** It will repeatedly ask the user for a valid input and only break out of the
     *  while loop once it receive a valid input. Afterward it will call itself recursively
     *  until the user bust or the user decided to stand.*/
    public void decision(Deck deck) {
        
        boolean validInput = false;
        int decision = 0;

        while (!validInput) {
            try {
                System.out.println("1)Hit or 2)Stand");
                decision = input.nextInt();
                if ((decision == 1) || (decision == 2)){
                    validInput = true;
                }
            }
            catch (Exception e){
                System.out.println("Invalid input. Please enter either 1 or 2.");
                input.next();
            }
        }

        if (decision == 1) {
            this.getHand().drawCard(deck);
            if (this.getHand().totalValue() > 21) {
                return;
            }
            this.showHand();

            decision(deck);

        }
        else if (decision == 2) {
            return;
        }
    }

}
