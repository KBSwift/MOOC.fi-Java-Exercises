
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner input = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI textUI = new TextUI(input, dictionary);
        textUI.start();
    }
}
