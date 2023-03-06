/** Game object will create instances of other classes that we need to run the game
 * such as the game deck, player and dealer. */

public class Game{

    private Deck deck;
    private Dealer dealer; 
    private Player player;

    public Game(){
        deck = new Deck();
        dealer = new Dealer();
        player = new Player();

        deck.prepareDeck();
        deck.shuffle();
        startRound();
    }

    public void startRound() {
        dealer.hit(deck);
        dealer.hit(deck);
        System.out.println(dealer.getHand());
        System.out.println(dealer.getHand().totalValue());
    }
}
