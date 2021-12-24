
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> list = new ArrayList<>();
        list.add("Henry");
        list.add("Jupiter");
        list.add("Victoria");
        
        for (String name : list) {
            System.out.println(name);
        }
        
        removeLast(list);
        System.out.println("");
        for (String name : list) {
            System.out.println(name);
        }
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() > 0) {
            strings.remove(strings.size() - 1);
        }
    }
}
