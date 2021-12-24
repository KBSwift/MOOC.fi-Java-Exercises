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

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    
    public Hold(int maximumWeight) {
        suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (!(suitcase.totalWeight() + this.totalWeight() > maximumWeight)) {
            suitcases.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
}
