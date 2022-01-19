/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Kavin
 */
public class TemperatureSensor implements Sensor {

    private boolean sensor = false;

    @Override
    public boolean isOn() {
        return sensor;
    }

    @Override
    public void setOn() {
        sensor = true;
    }

    @Override
    public void setOff() {
        sensor = false;
    }

    @Override
    public int read() throws IllegalStateException {
        if (sensor) {
            Random random = new Random();
            int number = random.nextInt(61) - 30;
            return number;
        } else {
            throw new IllegalStateException("The sensor is not turned on.");
        }
    }

}
