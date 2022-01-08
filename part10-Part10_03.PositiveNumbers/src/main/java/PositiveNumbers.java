
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        ArrayList<Integer> numberList = new ArrayList<>();
        
        System.out.println("Type numbers, \"end\" to quit");
        while (true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }
            numberList.add(Integer.valueOf(number));
        }
        
        System.out.println(positive(numberList));
        
        

    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
