
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scanner.nextLine());
        
        double tax = 0;
        if (gift > 1000000) {
            tax = 142100 + (gift - 1000000) * .17;
        } else if (gift > 200000) {
            tax = 22100 + (gift - 200000) * .15;
        } else if (gift > 55000) {
            tax = 4700 + (gift - 55000) * .12;
        } else if (gift > 25000) {
            tax = 1700 + (gift - 25000) * .10;
        } else if (gift > 5000) {
            tax = 100 + (gift - 5000) * .08;
        } else {
            System.out.println("No tax!");
            return;
        }
        
        System.out.println("Tax: " + tax);
    }
}
