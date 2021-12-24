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

public class TextUI {
    private Scanner input;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner input, SimpleDictionary dictionary) {
        this.input = input;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = input.nextLine();
            if (command.equalsIgnoreCase("End")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equalsIgnoreCase("Add")) {
                System.out.print("Word: ");
                String word = input.nextLine();
                System.out.print("Translation: ");
                String translation = input.nextLine();
                
                dictionary.add(word, translation);
                continue;
            }
            
            if (command.equalsIgnoreCase("Search")) {
                System.out.print("To be translated: ");
                String word = input.nextLine();
                System.out.println(search(word));
//                System.out.println(dictionary.translate(word));
                continue;
            }
            
            System.out.println("Unknown command");
        }
    }
    
    public String search(String word) {
        if (dictionary.translate(word) == null) {
            return "Word " + word + " was not found";
        }
        
        return dictionary.translate(word);
    }
    
}
