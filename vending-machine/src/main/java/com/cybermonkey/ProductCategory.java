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

    private static final Map<Product, Integer> PRODUCT_QUANTITY_MAP = Map.of(
            COKE, 10,
            RED_BULL, 10,
            WATER, 10
    );

    public static Product getProductById(int id) {
        return PRODUCT_MAP.get(id);
    }

    public static double getProductPrice(int id) {
        return PRODUCT_MAP.get(id).getPrice();
    }

    public static int getProductByQuantity(int id) {
        return PRODUCT_QUANTITY_MAP.get(PRODUCT_MAP.get(id));
    }

    public static void buyProduct(int id) {
        final var product = PRODUCT_MAP.get(id);
        final var quantity = PRODUCT_QUANTITY_MAP.get(product);
        PRODUCT_QUANTITY_MAP.put(product, quantity - 1);
    }
}
