
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();

        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "blah blah blah"));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "blah blah blah"));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "  I");
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            String title = sanitizeString(book.getName());
            text = sanitizeString(text);
            if (title.contains(text)) {
                System.out.println(book);
            }
        }
    }

    public static String sanitizeString(String text) {
        return text.toLowerCase().trim();
    }

}
