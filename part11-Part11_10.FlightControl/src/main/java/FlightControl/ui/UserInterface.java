/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Places;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

/**
 *
 * @author Kavin
 */
public class UserInterface {

    private Scanner userInput;
    private FlightControl flightControl;

    public UserInterface(Scanner userInput) {
        this.userInput = userInput;
        this.flightControl = new FlightControl();
    }

    public void start() {
        System.out.println();
        assetControl();
        System.out.println();
        flightControl();
    }

    public void assetControl() {
        System.out.println("---------------------");
        System.out.println("Airport Asset Control");
        System.out.println("---------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print(">");
            String choice = userInput.nextLine();
            if (choice.equalsIgnoreCase("x")) {
                break;
            }
            
            if (choice.equals("")) {
                continue;
            }

            if (Integer.valueOf(choice) == 1) {
                System.out.print("Give the airplane id: ");
                String airplaneID = userInput.nextLine();
                System.out.print("Give the airplane capacity: ");
                int airplaneCapacity = Integer.valueOf(userInput.nextLine());

                flightControl.addAirplane(new Airplane(airplaneID, airplaneCapacity));
            }

            if (Integer.valueOf(choice) == 2) {
                System.out.print("Give the airplane id: ");
                String airplaneID = userInput.nextLine();
                System.out.print("Give the departure airport id: ");
                String departure = userInput.nextLine();
                System.out.print("Give the target airport id: ");
                String destination = userInput.nextLine();

                Places places = new Places(departure, destination);
                Airplane airplane = flightControl.getAirplaneDetails(airplaneID);

                flightControl.addFlight(new Flight(airplane, places));
            }
        }
    }

    public void flightControl() {
        System.out.println("--------------");
        System.out.println("Flight Control");
        System.out.println("--------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print(">");
            String choice = userInput.nextLine();
            if (choice.equalsIgnoreCase("x")) {
                break;
            }
            
            if (choice.equals("")) {
                continue;
            }

            if (Integer.valueOf(choice) == 1) {
                flightControl.getAirplanes().stream().forEach(System.out::println);
            }

            if (Integer.valueOf(choice) == 2) {
                flightControl.getFlights().stream().forEach(System.out::println);
                System.out.println();
            }

            if (Integer.valueOf(choice) == 3) {
                System.out.print("Give the airplane id: ");
                String airplaneID = userInput.nextLine();

                System.out.println(flightControl.getAirplaneDetails(airplaneID));
                System.out.println();
            }
        }
    }

}
