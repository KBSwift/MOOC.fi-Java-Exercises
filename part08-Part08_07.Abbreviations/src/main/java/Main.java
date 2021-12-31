
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here!
        Scanner userInput = new Scanner(System.in);
        Abbreviations abbreviations = new Abbreviations();

        while (true) {
            System.out.println("\"Add\", \"Find\", or \"Stop\"?");
            String command = userInput.nextLine();

            if (command.equalsIgnoreCase("stop")) {
                break;
            }

            if (command.equalsIgnoreCase("add")) {
                System.out.println("Add abbreviation:");
                String abbreviation = userInput.nextLine();
                System.out.println("Add explanation");
                String explanation = userInput.nextLine();
                abbreviations.addAbbreviation(abbreviation, explanation);
            }

            if (command.equalsIgnoreCase("find")) {
                System.out.println("Type abbreviation to find:");
                String abbreviation = userInput.nextLine();
                System.out.println(abbreviations.findExplanationFor(abbreviation));
            }

        }
    }
}
