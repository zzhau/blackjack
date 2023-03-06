public class Dealer extends Person{
    private Hand hand;


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
}
