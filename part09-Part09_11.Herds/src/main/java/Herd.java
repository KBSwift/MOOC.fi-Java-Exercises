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
import java.util.List;

public class Herd implements Movable {
    
    private List<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable organisms : herd) {
            organisms.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String print = "";
        for (Movable organisms : herd) {
            print += organisms.toString() + "\n";
        }
        return print;
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
}
