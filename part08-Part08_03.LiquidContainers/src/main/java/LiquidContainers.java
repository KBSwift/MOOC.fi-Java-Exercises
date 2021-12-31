
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;
        while (true) {
            
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equalsIgnoreCase("add")) {
                if (amount < 0) {
                    continue;
                }
                
                if (firstContainer + amount <= 100) {
                    firstContainer += amount;
                } else {
                    firstContainer = 100;
                }
            }
            
            if (command.equalsIgnoreCase("move")) {
                if (amount < 0) {
                    continue;
                }
                
                if (firstContainer - amount < 0) {
                    secondContainer -= firstContainer;
                } else if (secondContainer + amount <= 100) {
                    secondContainer += amount;
                } else {
                    secondContainer = 100;
                }
                
                if (firstContainer - amount < 0) {
                    firstContainer = 0;
                } else {
                    firstContainer -= amount;
                }
            }
            
            if (command.equalsIgnoreCase("remove")) {
                if (secondContainer - amount < 0) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            }

        }
    }

}
