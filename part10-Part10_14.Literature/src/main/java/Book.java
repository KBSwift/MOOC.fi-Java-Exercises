/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class Book {
    
    private String name;
    private int ageRecommended;
    
    public Book(String name, int ageRecommended) {
        this.name = name;
        this.ageRecommended = ageRecommended;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAgeRecommended() {
        return ageRecommended;
    }
    
    @Override
    public String toString() {
        return name + " (recommended for " + ageRecommended + " year-olds or older)";
    }
    
}
