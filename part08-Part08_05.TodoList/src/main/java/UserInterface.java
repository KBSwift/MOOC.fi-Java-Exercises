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
    private TodoList tasks;

    public UserInterface(TodoList tasks, Scanner userInput) {
        this.tasks = tasks;
        this.userInput = userInput;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = userInput.nextLine();
            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            if (command.equalsIgnoreCase("add")) {
                add();
            }
            if (command.equalsIgnoreCase("list")) {
                tasks.print();
            }
            if (command.equalsIgnoreCase("remove")) {
                remove();
            }
        }
    }

    public void add() {
        System.out.print("To add: ");
        String task = userInput.nextLine();
        tasks.add(task);
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int toBeRemoved = Integer.valueOf(userInput.nextLine());
        tasks.remove(toBeRemoved);
    }
}
