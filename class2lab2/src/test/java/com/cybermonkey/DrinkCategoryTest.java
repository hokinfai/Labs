package com.cybermonkey;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DrinkCategoryTest {
    @Test
    public void getCokePriceFromId() {
        double productPrice = DrinkCategory.getProductPrice(1);
        assertThat(productPrice, is(5.19));
    }

    @Test
    public void getSportDrinkPriceFromId() {
        double productPrice = DrinkCategory.getProductPrice(2);
        assertThat(productPrice, is(8.50));
    }

}
