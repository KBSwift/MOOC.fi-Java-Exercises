
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String first = scanner.nextLine();
        System.out.println("Ever the second string:");
        String second = scanner.nextLine();
        
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
