public class Dealer extends Person{

    public Dealer() {
    	super();
    	this.setName("Dealer");
    }


    public void dealerFirstHand() {
        System.out.println("-----Dealer's Hand-----");
        System.out.println("[" + this.getHand().getCard(0) + "]" + " [Hidden]");
        System.out.println("-----------------------");
    }


    public void showHand() {
        System.out.println("-----Dealer's Hand-----");
        System.out.println(this.getHand());
        System.out.println("-----------------------");
    }

    /** Check whether the dealer first card is Ace so that the dealer
    *   does not automatically lose to the player when the user get a 
    *   blackjack. This is only used for the insurance option which 
    *   is not yet implemented*/
    public boolean firstAce() {
        return ((this.getHand().getCard(0).getValue()) == 11);
    }
}
