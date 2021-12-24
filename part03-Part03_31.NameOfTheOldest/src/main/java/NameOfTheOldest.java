
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldestAge = 0;
        String oldestName = "Zeus";
        while (true) {
            String person = scanner.nextLine();
            if (person.equals("")) {
                break;
            }
            
            String[] parts = person.split(",");
            //int oldestAge = 0;
            //String oldestName = "Zues";
            if (Integer.valueOf(parts[1]) > oldestAge) {
                oldestAge = Integer.valueOf(parts[1]);
                oldestName = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
