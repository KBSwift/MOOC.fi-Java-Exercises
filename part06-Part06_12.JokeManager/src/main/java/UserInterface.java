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
    
    private JokeManager jokes;
    private Scanner userInput;
    
    public UserInterface(JokeManager jokes, Scanner userInput) {
        this.jokes = jokes;
        this.userInput = userInput;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - Add a joke \n2 - Draw a joke \n3 - List jokes \nX - stop");
            String command = userInput.nextLine();
            if (command.equalsIgnoreCase("x")) {
                break;
            }
            
            command(command);
        }
    }
    
    public void command(String command) {
        if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            jokes.addJoke(userInput.nextLine());
        }
        
        if (command.equals("2")) {
            System.out.println(jokes.drawJoke());
        }
        
        if (command.equals("3")) {
            jokes.printJokes();
        }
    }
    
}
