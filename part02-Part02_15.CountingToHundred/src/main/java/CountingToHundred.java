
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingNumber = Integer.valueOf(scanner.nextLine());
        for (int i = startingNumber; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
