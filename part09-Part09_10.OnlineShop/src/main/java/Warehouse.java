/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> items;
    private Map<String, Integer> stock;
    
    public Warehouse() {
        this.items = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.items.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        return items.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (stock.containsKey(product)) {
            int stockAmount = stock.get(product);
            if (stockAmount < 1) {
                stock.remove(product);
                items.remove(product);
                return false;
            }
            stockAmount -= 1;
            stock.replace(product, stockAmount);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return items.keySet();
    }
    
}
