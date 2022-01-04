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

public class MisplacingBox extends Box {
    
    ArrayList<Item> narniaBox;
    
    public MisplacingBox() {
        this.narniaBox = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        narniaBox.add(item);
    }
    
    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
