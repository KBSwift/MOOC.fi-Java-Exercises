
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal!");
        } else if (firstNumber > secondNumber) {
            System.out.println("Greater number is: " + firstNumber);
        } else {
            System.out.println("Greater number is: " + secondNumber);
        }
    }
}
