
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(9);
        numberList.add(7);
        numberList.add(22);
        numberList.add(2);
        numberList.add(9);
        
        System.out.println("The number in the range [3, 10]");
        printNumbersInRange(numberList, 3, 10);
    }
    
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}
