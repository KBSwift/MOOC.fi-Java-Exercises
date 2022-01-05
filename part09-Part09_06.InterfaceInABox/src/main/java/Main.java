
public class Main {

    public static void main(String[] args) {
        // test your classes here
        
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", .7);
        
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
        
        Box box1 = new Box(10);
        Box box2 = new Box(5);
        Box box3 = new Box(12);
        box1.add(book1);
        box1.add(book2);
        box1.add(book3);
        box2.add(cd1);
        box2.add(cd2);
        box2.add(book3);
        box3.add(box2);
        box3.add(box1);
        
        System.out.println(box3);
        
//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//        
//        System.out.println(cd1);
//        System.out.println(cd2);
//        System.out.println(cd3);
    }

}
