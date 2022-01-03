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

public class ChangeHistory {
    
    private ArrayList<Double> balanceHistory;
    
    public ChangeHistory() {
        this.balanceHistory = new ArrayList<>();
    }
    
    public void add(double status) {
        balanceHistory.add(status);
    }
    
    public void clear() {
        balanceHistory.clear();
    }
    
    public double maxValue() {
        if (balanceHistory.isEmpty()) {
            return 0;
        }
        double greatest = balanceHistory.get(0);
        for (double value : balanceHistory) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
    
    public double minValue() {
        if (balanceHistory.isEmpty()) {
            return 0;
        }
        double smallest = balanceHistory.get(0);
        for (double value : balanceHistory) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }
    
    public double average() {
        if (balanceHistory.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double value : balanceHistory) {
            sum += value;
        }
        return sum / balanceHistory.size();
    }
    
    @Override
    public String toString() {
        return balanceHistory.toString();
    }
    
}
