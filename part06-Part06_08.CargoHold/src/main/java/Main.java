
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("The Lord of the Rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        System.out.println("The book's name " + book.getName());
        System.out.println("The book's weight " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);

        Suitcase suitcase = new Suitcase(10);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);
        
        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        
        Suitcase suitcase2 = new Suitcase(10);
        suitcase2.addItem(brick);
        
        System.out.println();
//        Item heaviest = suitcase.heaviestItem();
//        System.out.println("Heaviest item: " + heaviest);
        Hold hold = new Hold(1000);
        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcase2);
        System.out.println(hold);
        
        System.out.println();
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
        
    }

}
