
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your app here
//        Warehouse warehouse = new Warehouse();
//        warehouse.addProduct("milk", 3, 10);
//        warehouse.addProduct("coffee", 5, 6);
//        warehouse.addProduct("buttermilk", 2, 20);
//        warehouse.addProduct("yogurt", 2, 20);
//        
//        System.out.println("products:");
//        for (String product : warehouse.products()) {
//            System.out.println(product);
//        }
//        ShoppingCart cart = new ShoppingCart();
//        cart.add("milk", 3);
//        cart.print();
//        System.out.println("cart price: " + cart.price() + "\n");
//
//        cart.add("buttermilk", 2);
//        cart.print();
//        System.out.println("cart price: " + cart.price() + "\n");
//
//        cart.add("milk", 3);
//        cart.print();
//        System.out.println("cart price: " + cart.price() + "\n");
//
//        cart.add("milk", 3);
//        cart.print();
//        System.out.println("cart price: " + cart.price() + "\n");

        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }
}
