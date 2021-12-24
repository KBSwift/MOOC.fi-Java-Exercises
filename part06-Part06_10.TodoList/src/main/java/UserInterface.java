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
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner userInput) {
        this.list = list;
        this.userInput = userInput;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = userInput.nextLine();
            if (command.equalsIgnoreCase("stop")) {
                break;
            }
            
            command(command);
        }
        
    }
    
    public void command(String command) {
        if (command.equalsIgnoreCase("add")) {
            System.out.print("To add: ");
            String newTask = userInput.nextLine();
            list.add(newTask);
        }
        
        if (command.equalsIgnoreCase("list")) {
            list.print();
        }
        
        if (command.equalsIgnoreCase("remove")) {
            System.out.print("Which one is removed? ");
            int removeTask = Integer.valueOf(userInput.nextLine());
            
            list.remove(removeTask);
        }
    }
    
}
