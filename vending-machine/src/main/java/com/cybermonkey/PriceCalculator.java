package com.cybermonkey;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.cybermonkey.ProductCategory.getProductPrice;

public class PriceCalculator {

    public static int getNumberOfProducts(int productId, double amount) {
        return getProductPrice(productId) <= amount ? 1 : 0;
    }

    public static double getChanges(int productId, double amount) {
        double changes = amount - (getProductPrice(productId) * getNumberOfProducts(productId, amount));
        return new BigDecimal(changes).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }
}
