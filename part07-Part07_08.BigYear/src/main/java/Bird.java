/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLatinName() {
        return latinName;
    }
    
    public void setObservations() {
        observations++;
    }
    
    public int getObservations() {
        return observations;
    }
    
    @Override
    public String toString() {
        return name + " (" + latinName + "): " + observations + " observations";
    }
    
}
