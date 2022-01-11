/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class Dog extends Animal implements NoiseCapable {
    
    public Dog(String name) {
        super(name);
    }
    
    public Dog() {
        this("Dog");
    }
    
    @Override
    public void makeNoise() {
        this.bark();
    }
    
    public void bark() {
        System.out.println(this.getName() + " barks");
    }
    
}