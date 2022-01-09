

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        
        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(new Item("sneakers", 1));
        suitcase.addItem(new Item("pants", 1));
        suitcase.addItem(new Item("bowling ball", 10));
        suitcase.addItem(new Item("PS5", 5));
        
        System.out.println(suitcase.totalWeight());
        suitcase.printItems();
        
    }

}
