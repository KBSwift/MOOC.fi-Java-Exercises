/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class CD implements Packable {
    
    private String name;
    private String artist;
    private int year;
    
    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
    
    @Override
    public double weight() {
        return 0.1;
    }
    
    @Override
    public String toString() {
        return artist + ": " + name + " (" + year + ")";
    }
    
}
