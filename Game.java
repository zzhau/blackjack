/** Game object will create instances of other classes that we need to run the game
 *  such as the game deck, player and dealer. Whenever we create an instance of Game,
 *  it means we started a new game hence it will create all the objects needed for a
 *  game such as the playing deck, dealer and player as well as shuffle the deck. In
 *  the end it will call startRound() which will give both the player and the dealer 
 *  two card to start the game.*/

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

    /** At the start of the game, give both the dealer and player two card each.
     *  Afterward, it will print out the current state of the game with the Dealer
     *  2nd card being hidden.*/
    public void startRound() {
        
        dealer.hit(deck);
        dealer.hit(deck);
        
        player.hit(deck);
        player.hit(deck);

        dealer.dealerFirstHand();
        player.showHand();
    }


    public Dealer getDealer() {
        return dealer;
    }


    public Player getPlayer() {
        return player;
    }


    public Deck getDeck() {
        return deck;
    }
}
