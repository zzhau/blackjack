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


    public void decision(Deck deck) {

        // Dealer must always stand on value greater than 17
        if (this.getHand().totalValue() >= 17) {
            return;
        }

        // Dealer must hit when their value is less than 16
        do {
            this.hit(deck);
        }
        while(this.getHand().totalValue() <= 16);
    }
}
