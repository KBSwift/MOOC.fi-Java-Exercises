
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // test your code here

        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sortBySuit();

        hand.print();

//        ArrayList<Card> cards = new ArrayList<>();
//
//        cards.add(new Card(3, Suit.SPADE));
//        cards.add(new Card(2, Suit.DIAMOND));
//        cards.add(new Card(14, Suit.SPADE));
//        cards.add(new Card(12, Suit.HEART));
//        cards.add(new Card(2, Suit.SPADE));
//
//        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
//        Collections.sort(cards, sortBySuitSorter);
//
//        cards.stream().forEach(c -> System.out.println(c));
//        Hand hand1 = new Hand();
//
//        hand1.add(new Card(11, Suit.SPADE));
//        hand1.add(new Card(10, Suit.SPADE));
//        hand1.add(new Card(11, Suit.SPADE));
//        hand1.add(new Card(2, Suit.SPADE));
//
//        Hand hand2 = new Hand();
//
//        hand2.add(new Card(11, Suit.DIAMOND));
//        hand2.add(new Card(11, Suit.SPADE));
//        hand2.add(new Card(11, Suit.HEART));
//
//        int comparison = hand1.compareTo(hand2);
//
//        if (comparison < 0) {
//            System.out.println("better hand is");
//            hand2.print();
//        } else if (comparison > 0) {
//            System.out.println("better hand is");
//            hand1.print();
//        } else {
//            System.out.println("hands are equal");
//        }
//        List<Card> cards = new ArrayList<>();
//
//        Card first = new Card(2, Suit.SPADE);
//        Card second = new Card(2, Suit.DIAMOND);
//        Card third = new Card(12, Suit.HEART);
//        Card fourth = new Card(2, Suit.CLUB);
//
//        cards.add(first);
//        cards.add(second);
//        cards.add(third);
//        cards.add(fourth);
//
//        cards.stream().sorted().forEach(System.out::println);
//        Hand hand = new Hand();
//
//        hand.add(new Card(2, Suit.DIAMOND));
//        hand.add(new Card(14, Suit.SPADE));
//        hand.add(new Card(12, Suit.HEART));
//        hand.add(new Card(2, Suit.SPADE));
//
//        hand.sort();
//        
//        hand.print();
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
    }
}
