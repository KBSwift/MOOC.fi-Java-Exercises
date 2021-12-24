
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sumOfPositive = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input > 0){
                sumOfPositive += input;
                counter++;
            } else if (input == 0) {
                break;
            }
        }
        
        if (counter > 0) {
            System.out.println(1.0 * sumOfPositive / counter);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
