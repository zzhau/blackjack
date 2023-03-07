/** Game object will create instances of other classes that we need to run the game
 *  such as the game deck, player and dealer. Whenever we create an instance of Game,
 *  it means we started a new game hence it will create all the objects needed for a
 *  game such as the playing deck, dealer and player as well as shuffle the deck. In
 *  the end it will call startRound() which will give both the player and the dealer 
 *  two card to start the game.
 * 
 *  Scenarios we have to consider are:
 *  
 *  First scenario:
 *  -Dealer have a possibility to get blackjack from two cards so we need to give the user 
 *  a insurance option. (Not yet implemented)
 * 
 *  Second scenario:
 *  -Player get blackjack which make them automatically win.
 * 
 *  Third scenario:
 *  -Player bust and the dealer automatically win
 * 
 *  Fourth scenario:
 *  -Dealer win with higher value
 * 
 *  Fifth scenario:
 *  -Dealer bust and player win
 * */

public class Game{

    private Deck deck;
    private Dealer dealer; 
    private Player player;
    private boolean bust = false;


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
        
        dealer.clear();
        player.clear(); // Making sure the dealer and player hands are empty at the start of every round

        System.out.println("<<<<<<<<<<New Game>>>>>>>>>>");

        dealer.hit(deck);
        dealer.hit(deck);
        
        player.hit(deck);
        player.hit(deck);

        dealer.dealerFirstHand();
        player.showHand();

        // Check if player have blackjack and if yes check whether dealer has blackjack
        // so that they will tie if they both have blackjack.
        if (player.hasBlackjack()) {
            if (dealer.hasBlackjack()) {
                System.out.println("<<<<<<<<<<Both dealer and player have blackjack - PUSH>>>>>>>>>>>");
                dealer.showHand();
                player.showHand();
                startRound();
            }
            else {
                System.out.println("<<<<<<<<<<You win with a blackjack!>>>>>>>>>>");
                dealer.showHand();
                player.showHand();
                startRound();
            }
        }

        //Ask the player if they want to hit or stand when they havent bust 
        player.decision(deck);


        // We check if the player hand busted before allowing the dealer to draw cards.
        if (player.getHand().totalValue() > 21) {
            System.out.println("<<<<<<<<<<You busted!>>>>>>>>>>");
            dealer.showHand();
            player.showHand();
            startRound();
        }

        dealer.decision(deck);

        // Check if the dealer busted
        if (dealer.getHand().totalValue() > 21) {
            System.out.println("<<<<<<<<<<Dealer busted!>>>>>>>>>>");
            dealer.showHand();
            player.showHand();
            startRound();
        }

        /** We know that the player wont have a blackjack anymore at this point so only 
        *   the dealer can have blackjack. We also check for the case where the dealer did 
        *   not get a blackjack and that the dealer totalValue is greater than the player totalValue
        *   resulting in the player losing */
        if ((dealer.hasBlackjack()) || (dealer.getHand().totalValue() > player.getHand().totalValue())) {
            System.out.println("<<<<<<<<<<You lose!>>>>>>>>>>");
            dealer.showHand();
            player.showHand();
            startRound();
        }
        else if ((dealer.getHand().totalValue() < player.getHand().totalValue()) || dealer.getHand().totalValue() > 21) {
            System.out.println("<<<<<<<<<<You win!>>>>>>>>>>");
            dealer.showHand();
            player.showHand();
            startRound();
        }
        else if (dealer.getHand().totalValue() == player.getHand().totalValue()) {
            System.out.println("<<<<<<<<<<Both dealer and player have the same value - TIE>>>>>>>>>>>");
            dealer.showHand();
            player.showHand();
            startRound();
        }

        startRound();
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
