package com.cybermonkey;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceCalculator {

    public static int getNumberOfProducts(int productId, double amount) {
        double productPrice = DrinkCategory.getProductPrice(productId);

        return Double.valueOf(amount / productPrice).intValue();
    }

    public static double getChanges(int productId, double amount) {
        double productPrice = DrinkCategory.getProductPrice(productId);
        double changes = amount % productPrice;
        return new BigDecimal(changes).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }
}
