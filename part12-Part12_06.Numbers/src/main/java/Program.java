
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        int numbers = Integer.valueOf(scanner.nextLine());
        
        Random generator = new Random();
        for (int i = 0; i < numbers; i++) {
            System.out.println(generator.nextInt(11));
        }
    }

}
