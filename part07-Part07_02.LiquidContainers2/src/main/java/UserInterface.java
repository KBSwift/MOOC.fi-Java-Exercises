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

    private Scanner userInput;
    private Container firstContainer;
    private Container secondContainer;

    public UserInterface(Scanner userInput, Container firstContainer, Container secondContainer) {
        this.userInput = userInput;
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            String command = userInput.nextLine();
            if (command.equalsIgnoreCase("quit")) {
                break;
            }

            command(command);
        }
    }

    public void command(String input) {
        String[] parts = input.split(" ");
        String command = parts[0];
        int amount = Integer.valueOf(parts[1]);

        if (command.equalsIgnoreCase("add")) {
            firstContainer.add(amount);
        }

        if (command.equalsIgnoreCase("remove")) {
            secondContainer.remove(amount);
        }

        if (command.equalsIgnoreCase("move")) {
            if (secondContainer.contains() == 100) {
                return;
            }
            
            if (firstContainer.contains() < amount) {
                secondContainer.add(firstContainer.contains());
                firstContainer.remove(amount);
                return;
            }
            
            if (firstContainer.contains() >= amount && secondContainer.contains() + amount <= 100) {
                firstContainer.remove(amount);
                secondContainer.add(amount);
                return;
            }

            if (firstContainer.contains() >= amount && secondContainer.contains() + amount > 100) {
                firstContainer.remove(100 - secondContainer.contains());
                secondContainer.add(amount);
            }
        }
    }

}
