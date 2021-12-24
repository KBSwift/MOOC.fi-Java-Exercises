
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int userNumber = Integer.valueOf(scanner.nextLine());
        int product = 1;
        
        for (int i = 1; i <= userNumber; i++) {
            product *= i;
        }
        
        System.out.println("Factorial: " + product);
    }
}
