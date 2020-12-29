package com.cybermonkey;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceCalculator {

    private static final double COKE_RPICE = 5.19;

    public static int getNumberOfProducts(double amount) {
        return Double.valueOf(amount / COKE_RPICE).intValue();
    }

    public static double getChanges(double amount) {
        double changes = amount % COKE_RPICE;
        return new BigDecimal(changes).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }
}
