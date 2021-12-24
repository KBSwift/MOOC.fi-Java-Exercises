
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (Empty will stop)");
            String identifier = userInput.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (Empty will stop)");
            String name = userInput.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Item itemGiven = new Item(identifier, name);
            if (!(items.contains(itemGiven))) {
                items.add(itemGiven);
            }
        }
        
        for (Item item : items) {
            System.out.println(item);
        }
        
    }
}
