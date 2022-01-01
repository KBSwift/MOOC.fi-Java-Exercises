/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
import java.util.HashMap;

public class IOU {
    
    private HashMap<String, Double> debts;
    
    public IOU() {
        this.debts = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return debts.getOrDefault(toWhom, 0.0);
    }
    
}
