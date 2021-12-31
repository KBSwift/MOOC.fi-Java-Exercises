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

public class Abbreviations {
    
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizedString(abbreviation);
        explanation = sanitizedString(explanation);
        if (hasAbbreviation(abbreviation)) {
            System.out.println("Sorry, that's a duplicate entry!");
            return;
        }
        
        abbreviations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviations.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        return abbreviations.get(abbreviation);
    }
    
    public static String sanitizedString(String name) {
        if (name == null) {
            return "";
        }
        name = name.toLowerCase();
        return name.trim();
    }
    
}
