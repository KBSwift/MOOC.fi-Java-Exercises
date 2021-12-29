
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Scanner scanner = new Scanner(System.in);
        GradeList grades = new GradeList();
        UserInterface ui = new UserInterface(grades, scanner);
        
        ui.start();

    }
}
