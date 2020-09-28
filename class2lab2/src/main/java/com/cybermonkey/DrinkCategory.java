package com.cybermonkey;

import java.util.stream.Stream;

public enum DrinkCategory {
    COKE(1, 5.19),
    SPORT_DRINK(2, 8.50);

    private int id;
    private double price;

    DrinkCategory(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public static DrinkCategory getDrinkCategory(int id) {
        return Stream.of(values())
                     .filter(enumValue -> enumValue.id == id)
                     .findFirst()
                     .orElse(COKE);
    }

    public static double getProductPrice(int id) {
        return getDrinkCategory(id).price;
    }

}
