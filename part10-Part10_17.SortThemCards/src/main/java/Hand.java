/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.stream().forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public double totalValue() {
        double thisHand = 0;
        for (Card card : this.cards) {
            thisHand += card.getValue();
        }
        return thisHand;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand hand) {
        double thisHand = this.totalValue();
        double comparedHand = hand.totalValue();
        
        if (thisHand > comparedHand) {
            return 1;
        } else if (thisHand < comparedHand) {
            return -1;
        } else {
            return 0;
        }
    }

}
