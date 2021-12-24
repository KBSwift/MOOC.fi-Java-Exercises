/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class Counter {

    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return value;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    public void increase() {
        this.increase(1);
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }

    public void decrease() {
        this.decrease(1);
    }

}
