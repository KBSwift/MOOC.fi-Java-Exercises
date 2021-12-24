
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        while (true) {
            String person = scanner.nextLine();
            if (person.equals("")){
                break;
            }
            
            String[] parts = person.split(",");
            if (Integer.valueOf(parts[1]) > oldest) {
                oldest = Integer.valueOf(parts[1]);
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
