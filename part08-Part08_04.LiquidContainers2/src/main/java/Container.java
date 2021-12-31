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
    
    private int currentAmount;
    
    public Container() {
        this.currentAmount = 0;
    }
    
    public int contains() {
        return currentAmount;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        if (currentAmount + amount > 100) {
            currentAmount = 100;
        } else {
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
        return currentAmount + "/100";
    }
    
}
