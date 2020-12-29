/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cybermonkey;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    Map<Product, Integer> cart = new HashMap<>();

    public void addItem(Product product) {
        if (cart.containsKey(product)) {
            cart.put(product, cart.get(product) + 1);
        } else {
            cart.put(product, 1);
        }
    }

    public void removeItem(Product product) {
        if (cart.get(product).equals(1)) {
            cart.remove(product);
        } else {
            cart.put(product, cart.get(product) - 1);
        }
    }

    public double totalPrice() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            total += (entry.getKey().getPrice() * entry.getValue());
        }
        return total;
    }

    public Map<Product, Integer> getCart() {
        return cart;
    }
}