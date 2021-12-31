/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
import java.util.Scanner;

public class UserInterface {

    private BirdDatabase database;
    private Scanner userInput;

    public UserInterface(BirdDatabase database, Scanner userInput) {
        this.database = database;
        this.userInput = userInput;
    }

    public void start() {
        System.out.println("Commands:");
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - ends the program");
        System.out.println("Quit - ends the program");
        System.out.println();
        
        takeUserCommands();
    }

    public void takeUserCommands() {
        while (true) {
            System.out.print("Enter command: ");
            String command = userInput.nextLine();
            command = command.toLowerCase();
            if (command.equals("quit")) {
                break;
            }

            if (command.equals("add")) {
                System.out.print("Name: ");
                String name = userInput.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = userInput.nextLine();
                database.addBird(new Bird(name, latinName));
            }
            
            if (command.equals("observation")) {
                System.out.print("Bird? ");
                String bird = userInput.nextLine();
                if (database.isBirdFound(bird)) {
                    database.addObservation(bird);
                } else {
                    System.out.println("Not a bird!");
                }
            }
            
            if (command.equals("all")) {
                database.printAllBirds();
            }
            
            if (command.equals("one")) {
                System.out.print("Bird? ");
                String bird = userInput.nextLine();
                if (database.isBirdFound(bird)) {
                    database.printOneBird(bird);
                } else {
                    System.out.println("Sorry, that bird is not in the database!");
                }
            }
            
        }
    }

}
