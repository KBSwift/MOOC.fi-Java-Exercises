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

public class Box implements Packable {
    
    private ArrayList<Packable> box;
    private double capacity;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (item.weight() + weight() <= capacity) {
            box.add(item);
        }
    }
    
    @Override
    public double weight() {
        if (box.isEmpty()) {
            return 0;
        }
        double totalWeight = 0;
        for (Packable item : box) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }
    
    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }
    
}
