package com.cybermonkey;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PriceCalculatorTest {
    private PriceCalculator calculator = new PriceCalculator();

    @Test
    public void getNumberOfProducts() {
        int numberOfProduct = calculator.getNumberOfProducts(1, 100.00);

        assertThat(numberOfProduct, is(19));
    }

    @Test
    public void getTheAmountOfChanges() {
        double changes = calculator.getChanges(1, 100.00);

        assertThat(changes, is(1.39));
    }
}
