
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            sum += number;
            counter++;
        }
        
        if (counter != 0) {
            System.out.println("Average of the numbers: " + (1.0 * sum / counter));
        } else {
            System.out.println("No numbers given!");
        }
       
    }
}
