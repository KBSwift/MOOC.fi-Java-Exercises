package FlightControl;

import FlightControl.ui.UserInterface;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        Scanner userInput = new Scanner(System.in);
        UserInterface ui = new UserInterface(userInput);
        
        ui.start();
        
    }
}
