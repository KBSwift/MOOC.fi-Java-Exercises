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

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight += i.getWeight();
        }

        return totalWeight;
    }

    public void addItem(Item item) {
    if (!(this.totalWeight() + item.getWeight() > maximumWeight)) {
            items.add(item);
        }

    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (items.size() == 1) {
            return items.size() + " item (" + this.totalWeight() + " kg)";
        }

        return items.size() + " items (" + this.totalWeight() + " kg)";
    }

}
