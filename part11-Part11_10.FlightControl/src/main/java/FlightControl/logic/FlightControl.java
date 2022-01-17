/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kavin
 */
public class FlightControl {
    
    private List<Flight> flights;
    private Map<String, Airplane> airplaneDetails;
    
    public FlightControl() {
        this.flights = new ArrayList<>();
        this.airplaneDetails = new HashMap<>();
    }
    
    public void addAirplane(Airplane airplane) {
        airplaneDetails.putIfAbsent(airplane.getId(), airplane);
    }
    
    public void addFlight(Flight flight) {
        if (!(flights.contains(flight))) {
            flights.add(flight);
        }
    }
    
    public Collection<Airplane> getAirplanes() {
        return airplaneDetails.values();
    }
    
    public Airplane getAirplaneDetails(String id) {
        return airplaneDetails.getOrDefault(id, new Airplane("Airplane ID not in system", 0));
    }
    
    public Collection<Flight> getFlights() {
        return flights;
    }
    
}
