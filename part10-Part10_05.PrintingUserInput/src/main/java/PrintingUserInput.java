
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        
        System.out.println("Enter words, press enter to stop");
        while (true) {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("")) {
                break;
            }
            
            list.add(word);
        }
        
        list.stream().forEach(word -> System.out.println(word));
    }
}
