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

public class Recipe {
    
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCookTime() {
        return cookTime;
    }
    
    public boolean containsIngredient(String searchedIngredient) {
        for (String ingredient : ingredients) {
            if (ingredient.equalsIgnoreCase(searchedIngredient)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return getName() + ", cooking time: " + getCookTime();
    }
    
}
