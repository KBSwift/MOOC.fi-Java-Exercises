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

public class Stack {
    private ArrayList<String> items = new ArrayList<>();
    
    public Stack() {
        items = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    public void add(String value) {
        ArrayList<String> newItems = new ArrayList<>();
        newItems.add(value);
        for (String item : items) {
            newItems.add(item);
        }
        
        items = newItems;
    }
    
    public ArrayList<String> values() {
        return items;
    }
    
    public String take() {
        String taken = items.get(0);
        items.remove(0);
        return taken;
    }
    
}
