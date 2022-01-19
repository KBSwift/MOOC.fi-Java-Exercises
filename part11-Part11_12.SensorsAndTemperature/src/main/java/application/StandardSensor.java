/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Kavin
 */
public class StandardSensor implements Sensor {
    
    private int sensor = 0;
    
    public StandardSensor(int number) {
        this.sensor = number;
    }
    
    @Override
    public boolean isOn() {
        return (!(sensor == 0));
    }
    
    @Override
    public void setOn() {
        
    }
    
    @Override
    public void setOff() {
        
    }
    
    @Override
    public int read() {
        return sensor;
    }
    
}
