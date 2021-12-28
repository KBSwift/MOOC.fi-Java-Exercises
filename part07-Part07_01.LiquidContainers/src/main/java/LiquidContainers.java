
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount < 0) {
                continue;
            }

            if (command.equalsIgnoreCase("add")) {
                if (amount + first > 100) {
                    first = 100;
                    continue;
                }

                first += amount;
            }

            if (command.equalsIgnoreCase("move")) {
                if (amount >= first) {
                    second += first;
                    first = 0;
                }

                if (second > 100) {
                    second = 100;
                }
                
                if (amount + second < 100 && first >= amount) {
                    second += amount;
                    first -= amount;
                }
                
                if (amount + second > 100 && first >= amount) {
                    second = 100;
                    first -= amount;
                }

            }

            if (command.equalsIgnoreCase("remove")) {
                if (second - amount < 0) {
                    second = 0;
                    continue;
                }

                second -= amount;
            }
        }
    }

}
