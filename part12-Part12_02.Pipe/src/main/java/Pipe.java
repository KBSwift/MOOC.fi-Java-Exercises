
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 * @param <T>
 */
public class Pipe<T> {
    
    private ArrayList<T> pipe = new ArrayList<>();
    
    public void putIntoPipe(T value) {
        pipe.add(value);
    }
    
    public T takeFromPipe() {
        if (pipe.isEmpty()) {
            return null;
        }
        T object = pipe.get(0);
        pipe.remove(0);
        return object;
    }
    
    public boolean isInPipe() {
        return !(pipe.isEmpty());
    }
    
}
