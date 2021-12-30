
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Recipe> recipes = new ArrayList<>();
        UserInterface ui = new UserInterface(userInput, recipes);

        while (true) {
            System.out.print("File to read: ");
            String fileName = userInput.nextLine();
            if (fileName.equalsIgnoreCase("quit")) {
                break;
            }
            try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine();
                    if (line.isEmpty()) {
                        addToRecipes(recipes, list);
                    } else {
                        list.add(line);
                    }
                }
                addToRecipes(recipes, list);
                break;

            } catch (Exception e) {
                System.out.println("Reading the file \"" + fileName + "\" failed. Detailed error below:\n" + e + "\n");
                System.out.println("Please try again, or type \"Quit\" to exit program.");
            }
        }
        
        ui.start();
        
    }

    public static void addToRecipes(ArrayList<Recipe> recipes, ArrayList<String> list) {
        String name = list.get(0);
        int cookTime = Integer.valueOf(list.get(1));
        list.remove(0);
        list.remove(0);
//        ArrayList<String> ingredients = new ArrayList(list); -- Same as what is being done below with instantiating
        recipes.add(new Recipe(name, cookTime, new ArrayList<>(list)));
        list.clear();
    }
    
    /* Contemplated implementing additional class below to separate the responsibility of searching through file.
       Decided against it as the function was very small in implementation*/
//    public static void readFileRecipes(String fileName) {
//        ArrayList<String> list = new ArrayList<>();
//        ArrayList<Recipe> recipes = new ArrayList<>();
//        try ( Scanner fileReader = new Scanner(Paths.get(fileName))) {
//            while (fileReader.hasNextLine()) {
//                String line = fileReader.nextLine();
//                if (line.isEmpty()) {
//                    addToRecipes(recipes, list);
//                } else {
//                    list.add(line);
//                }
//            }
//            addToRecipes(recipes, list);
//
//        } catch (Exception e) {
//            System.out.println("Reading the file " + fileName + " failed. Detailed reason below:\n" + e + "\n");
//            System.out.println("Please try again, or type \"Quit\" to exit program.");
//        }
//    }

}
