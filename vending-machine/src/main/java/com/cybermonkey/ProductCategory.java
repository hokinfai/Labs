package com.cybermonkey;

import java.util.Map;

public class ProductCategory {

    private static final Product COKE = new Product("coke", 5.19);
    private static final Product RED_BULL = new Product("red bull", 10.12);
    private static final Product WATER = new Product("water", 3.5);

    private static final Map<Integer, Product> PRODUCT_MAP = Map.of(
            1, COKE,
            2, RED_BULL,
            3, WATER
    );

    public static Product getProductById(int id) {
        return PRODUCT_MAP.get(id);
    }

    public static double getProductPrice(int id) {
        return PRODUCT_MAP.get(id).getPrice();
    }

}
