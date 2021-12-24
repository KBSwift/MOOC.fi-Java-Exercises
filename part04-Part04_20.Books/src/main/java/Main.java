import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.print("What information is to be printed? ");
        String infoRequested = scanner.nextLine();
        
        for (Book book : books) {
            if (infoRequested.equalsIgnoreCase("Name")) {
                System.out.println(book.getTitle());
            }
            if (infoRequested.equalsIgnoreCase("Everything")) {
                System.out.println(new BookFormatter(book).allDetails());
            }
        }
        
        
    }
}
