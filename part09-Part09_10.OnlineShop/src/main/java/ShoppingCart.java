/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    private List<Item> products;
    
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }
    
    public void add(String product, int price) {
        boolean wasFound = false;
        for (Item item : products) {
            if (item.equals(new Item(product, 1, price))) {
                item.increaseQuantity();
                wasFound = true;
            }
        }
        if (!wasFound) {
            products.add(new Item(product, 1, price));
        }
    }
    
    public int price() {
        int totalPrice = 0;
        for (Item item : products) {
            totalPrice += item.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (Item item : products) {
            System.out.println(item);
        }
    }
    
}
