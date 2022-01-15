

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        
        return suit + " " + cardValue;
    }
    
    @Override
    public int compareTo(Card card) {
        if (this.value == card.value) {
            if (this.suit.ordinal() < card.suit.ordinal()) {
                return -1;
            } else if (this.suit.ordinal() > card.suit.ordinal()) {
                return 1;
            } else {
                return 0;
            }
        }
        return this.value - card.value;
    }

    public int getValue() {
        return value;
    }
    
    public double totalValue() {
        return value + (suit.ordinal() / 10.0);
    }

    public Suit getSuit() {
        return suit;
    }

}
