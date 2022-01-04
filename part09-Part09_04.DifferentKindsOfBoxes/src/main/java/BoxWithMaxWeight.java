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

public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public int totalWeight() {
        int totalSum = 0;
        for (Item item : items) {
            totalSum += item.getWeight();
        }
        return totalSum;
    }
    
    @Override
    public void add(Item item) {
        if (totalWeight() + item.getWeight() <= capacity) {
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}
