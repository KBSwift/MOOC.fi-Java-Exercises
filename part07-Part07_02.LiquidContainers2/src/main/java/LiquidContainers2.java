
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        
        UserInterface ui = new UserInterface(scanner, firstContainer, secondContainer);
        ui.start();

//        while (true) {
//            System.out.print("> ");
//
//            String input = scan.nextLine();
//            if (input.equals("quit")) {
//                break;
//            }
//            
//            firstContainer.add(Integer.valueOf(input));
//            System.out.println(firstContainer);
//        }
    }

}
