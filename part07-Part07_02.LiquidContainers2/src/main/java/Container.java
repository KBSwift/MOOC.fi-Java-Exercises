/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class Container {
    
    private int upperLimit;
    private int currentAmount;
    
    public Container() {
        this.upperLimit = 100;
        this.currentAmount = 0;
    }
    
    public int contains() {
        return currentAmount;
    }
    
    public void add(int amount) {
        if (amount + currentAmount > upperLimit) {
            currentAmount = upperLimit;
            return;
        }
        
        if (amount > 0) {
            currentAmount += amount;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        
        if (currentAmount - amount < 0) {
            currentAmount = 0;
        } else {
            currentAmount -= amount;
        }
    }
    
    @Override
    public String toString() {
        return currentAmount + "/" + upperLimit;
    }
    
}
