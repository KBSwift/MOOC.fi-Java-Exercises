
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] split = input.split(" ");

            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i]);
            }
        }
    }
}
