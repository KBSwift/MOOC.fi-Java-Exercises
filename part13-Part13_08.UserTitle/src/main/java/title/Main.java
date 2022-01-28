package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please write a title below:");

        String title = userInput.nextLine();

        Application.launch(UserTitle.class, "--overrideMe=" + title);

    }

}
