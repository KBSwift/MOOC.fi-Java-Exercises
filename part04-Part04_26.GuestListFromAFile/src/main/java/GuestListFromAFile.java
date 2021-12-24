
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> guestNames = new ArrayList<>();
        
        try (Scanner nameScanner = new Scanner(Paths.get(file))) {
            while (nameScanner.hasNextLine()) {
                guestNames.add(nameScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("File not found!" + "\n" + e.getMessage());
        }
        // implement reading the file here.
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (guestNames.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}
