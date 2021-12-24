
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int endNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from?");
        int startNumber = Integer.valueOf(scanner.nextLine());
        
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(i);
        }
    }
}