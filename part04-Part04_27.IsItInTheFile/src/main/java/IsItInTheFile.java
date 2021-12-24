
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = userInput.nextLine();
        System.out.println("Search for:");
        String searched = userInput.nextLine();
        
        boolean found = false; 
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                if (fileScanner.nextLine().equalsIgnoreCase(searched)) {
//                    System.out.println("Found!");
                    found = true;
                    break;
                }
            }
            
            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
        
    }
}
