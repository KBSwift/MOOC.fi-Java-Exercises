/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class Multiplier {
    
    private int multiplicand;
    
    public Multiplier(int multiplicand) {
        this.multiplicand = multiplicand;
    }
    
    public int multiply(int multiplicand) {
        return this.multiplicand *= multiplicand;
    }
}
