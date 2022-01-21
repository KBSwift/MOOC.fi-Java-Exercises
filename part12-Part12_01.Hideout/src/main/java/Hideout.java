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
public class Hideout<T> {
    
    private T hiddenObject;
    
    public Hideout(T object) {
        this.hiddenObject = object;
    }
    
    public Hideout() {
        hiddenObject = null;
    }
    
    public void putIntoHideout(T toHide) {
        hiddenObject = toHide;
    }
    
    public T takeFromHideout() {
        T object = hiddenObject;
        hiddenObject = null;
        return object;
    }
    
    public boolean isInHideout() {
        return hiddenObject != null;
    }
    
}
