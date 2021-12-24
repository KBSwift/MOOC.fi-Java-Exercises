/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class PaymentCard {
    
    private double balance;
    
    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably() {
        if (balance > 2.59) {
            balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        if (balance > 4.59) {
            balance -= 4.60;
        }
    }
    
    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        
        if (amount + balance > 150) {
            balance = 150;
        } else {
            balance += amount;
        }
    }
    
    
    
}
