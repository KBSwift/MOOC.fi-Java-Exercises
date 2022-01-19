/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Kavin
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors = new ArrayList<>();
    private List<Integer> read = new ArrayList<>();

    @Override
    public boolean isOn() {
        boolean allOn = false;
        for (Sensor sensor : sensors) {
            allOn = sensor.isOn();
        }
        return allOn;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() throws IllegalStateException{
        if (sensors.isEmpty()) {
            throw new IllegalStateException("There were no sensors to read from!");
        }
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        int average = sum / sensors.size();
        read.add(average);
        return average;
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return read;
    }

}
