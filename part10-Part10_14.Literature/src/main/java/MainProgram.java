
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String name = userInput.nextLine();
            if (name.equals("")) {
                break;
            }
            
            System.out.println("Input the age recommendation: ");
            int ageRecommended = Integer.valueOf(userInput.nextLine());
            System.out.println();
            
            books.add(new Book(name, ageRecommended));
        }
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommended)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        System.out.println();
        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books:");
        
        books.stream()
                .forEach(System.out::println);
    }

}
