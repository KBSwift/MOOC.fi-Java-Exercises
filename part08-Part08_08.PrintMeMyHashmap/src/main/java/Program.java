import java.util.HashMap;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        Scanner userInput = new Scanner(System.in);
        HashMap<String, String> hashmap = new HashMap<>();
        
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "more precisely");
        hashmap.put("i.e", "more precisely");
        
        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, "  .e ");
    }
    
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String abbreviation : hashmap.keySet()) {
            System.out.println(abbreviation);
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            key = sanitizeString(key);
            text = sanitizeString(text);
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            String sanitizedKey = sanitizeString(key);
            text = sanitizeString(text);
            if (sanitizedKey.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
    
    public static String sanitizeString(String string) {
        string = string.trim();
        return string.toLowerCase();
    }
}
