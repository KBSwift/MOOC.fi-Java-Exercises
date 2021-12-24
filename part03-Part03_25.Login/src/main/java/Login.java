
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password");
        String password = scanner.nextLine();
        
        if ("alex".equals(user) && "sunshine".equals(password) || 
                "emma".equals(user) && "haskell".equals(password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
