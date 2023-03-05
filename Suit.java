/** Contain the Suit of the cards that will form the deck.
 * We use enum when we want to represent a group of constants
 * https://www.w3schools.com/java/java_enums.asp contains more 
 * information regarding various way to use and interact with an 
 * enum class. 
 * 
 * Another useful website to look at about various operation on 
 * enum is tinyurl.com/mbw8j8pk*/

enum Suit {
	SPADES("Spades"),
	HEARTS("Hearts"),
	CLUBS("Clubs"),
	DIAMONDS("Diamonds");

    private String suitName;

    Suit(String suit) {
        this.suitName = suit;
    }

    public String getSuit() {
        return suitName;
    }
}