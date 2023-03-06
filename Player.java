public class Player extends Person{
    private Hand hand;
    
   	public Player() {
    	super();
    	this.setName("Player");
    }

    public void showHand() {
        System.out.println("-----Player's Hand-----");
        System.out.println(this.getHand());
        System.out.println("-----------------------");
    }

}
