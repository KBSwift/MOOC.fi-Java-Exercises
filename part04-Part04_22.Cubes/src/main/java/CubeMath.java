/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class CubeMath {
    
    private int number;
    
    public CubeMath(int number) {
        this.number = number;
    }
    
    public int cube() {
        return number * number * number;
    }
}
