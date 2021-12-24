/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        return identifier.equals(comparedItem.identifier);
    }
    
    @Override
    public String toString() {
        return identifier + ": " + name;
    }
}
