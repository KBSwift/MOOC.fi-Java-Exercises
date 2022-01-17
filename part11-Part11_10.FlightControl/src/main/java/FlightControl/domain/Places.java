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
public class Places {
    
    private String departureID;
    private String destinationID;
    
    public Places(String departureID, String destinationID) {
        this.departureID = departureID;
        this.destinationID = destinationID;
    }
    
    @Override
    public String toString() {
        return "(" + departureID + "-" + destinationID + ")";
    }
    
}
