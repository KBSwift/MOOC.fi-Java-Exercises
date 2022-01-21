
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        
        int[] numbers = {8, -2, 3, 1, 1, 1, 2, 3};
        
        System.out.println(sum(numbers, 5, numbers.length, 0, 999));

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        if (toWhere > array.length - 1) {
            toWhere = array.length - 1;
        }
        int sum = 0;
        for (int i = fromWhere; i <= toWhere; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                sum += array[i];
            }
        }
        return sum;
    }

}
