/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cybermonkey;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    Map<Product, Integer> cart = new HashMap<>();

    public void addItem(Product product) {
        cart.put(product, 1);
    }

    public void removeItem(Product product) {
        cart.put(product, 1);
    }

    public double checkout() {
        return 0.0;
    }

    public String showCart() {
        return null;
    }
}