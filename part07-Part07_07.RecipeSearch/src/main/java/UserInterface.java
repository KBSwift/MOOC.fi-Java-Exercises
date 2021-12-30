/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner userInput;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner userInput, ArrayList<Recipe> recipes) {
        this.userInput = userInput;
        this.recipes = recipes;
    }

    public void start() {
        System.out.println();
        System.out.println("Commands:");
        System.out.println("List - lists the recipes");
        System.out.println("Find name - searches recipes by name");
        System.out.println("Find cooking time - searches recipes by cooking time");
        System.out.println("Find ingredient - searches recipes by ingredient");
        System.out.println("Stop - stops the program");

        while (true) {
            System.out.println();
            System.out.print("Enter command: ");
            String command = userInput.nextLine();
            command = command.toLowerCase();
            if (command.equals("stop")) {
                break;
            }
            
            commands(command);
        }
    }

    public void commands(String command) {
        if (command.equals("list")) {
            System.out.println();
            System.out.println("Recipes:");
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
            return;
        }
        
        if (command.contains("find")) {
            String[] parts = command.split(" ");
            if (parts.length < 2 || parts[1].equals("")) {
                System.out.println();
                System.out.println("You must enter an acceptable keyword(s) following \"find\" in order to search. (eg. find pasta, find cooking time)");
                return;
            }
            if (parts[1].contains("cook") && parts.length < 3) {
                System.out.println();
                System.out.println("Did you mean to type \"Find cooking time\"?");
                return; 
            } else if (parts[1].contains("cooking") && parts[2].contains("time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(userInput.nextLine());
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getCookTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
                return;
            } else if (parts[1].contains("cooking") && !(parts[2].contains("time"))) {
                System.out.println();
                System.out.println("Did you mean to type \"Find cooking time\"?");
                return;
            }
            
            if (parts[1].equals("ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = userInput.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.containsIngredient(ingredient)) {
                        System.out.println(recipe);
                    }
                }
                return;
            }
            
            System.out.println();
            System.out.println("Recipes:");
            for (Recipe recipe : recipes) {
                String lowerCaseName = recipe.getName().toLowerCase();
                if (lowerCaseName.contains(parts[1])) {
                    System.out.println(recipe);
                }
            }
            return;
        }
        
        System.out.println("Command was not recognized. Please try again!");
    }

}
