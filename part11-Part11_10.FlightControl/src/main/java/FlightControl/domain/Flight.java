/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author Kavin
 */
public class Flight {
    
    private Airplane airplane;
    private Places places;
    
    public Flight(Airplane airplane, Places places) {
        this.airplane = airplane;
        this.places = places;
    }
    
    public Airplane getAirplane() {
        return airplane;
    }
    
    public Places places() {
        return places;
    }
    
    @Override
    public String toString() {
        return airplane + " " + places;
    }
    
}
