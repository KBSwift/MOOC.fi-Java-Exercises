
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equalsIgnoreCase("add")) {
                firstContainer.add(value);
            }

            if (command.equalsIgnoreCase("move")) {
                if (firstContainer.contains() < value) {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(value);
                } else {
                    secondContainer.add(value);
                    firstContainer.remove(value);
                }
            }

            if (command.equalsIgnoreCase("remove")) {
                secondContainer.remove(value);
            }

        }
    }

}
