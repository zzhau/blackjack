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

        deck.shuffle();
    }

    public void startRound() {
        ;
    }
}
