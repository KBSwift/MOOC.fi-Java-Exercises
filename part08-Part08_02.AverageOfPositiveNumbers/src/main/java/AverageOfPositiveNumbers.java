
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfPositive = 0;
        int positiveNumbers = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sumOfPositive += number;
                positiveNumbers++;
            }
        }
        
        if (positiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sumOfPositive / (double) positiveNumbers);
        }
    }
}
