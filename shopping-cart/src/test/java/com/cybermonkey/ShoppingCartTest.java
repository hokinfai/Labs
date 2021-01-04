package com.cybermonkey;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingCartTest {

    private ShoppingCart cart;

    private final Product APPLE = new Product(01, "Apple", 12.0);
    private final Product BANANA = new Product(02, "Banana", 14.0);

    @Before
    public void setup() {
        cart = new ShoppingCart();
    }

    @Test
    public void returnQuatityOneWhenAddingAProductIntoEmptyShoppingCart() {
        cart.addItem(APPLE);

        assertThat(cart.getCart().get(APPLE), is(1));
    }

    @Test
    public void returnQuatityTwoWhenAddingAProductIntoShoppingCartWithTheSameProduct() {
        cart.addItem(APPLE);
        cart.addItem(APPLE);

        assertThat(cart.getCart().get(APPLE), is(2));
    }

    @Test
    public void returnQuatityOneWhenAddingTwoProductsIntoEmptyShoppingCart() {
        cart.addItem(BANANA);
        cart.addItem(APPLE);

        assertThat(cart.getCart().get(APPLE), is(1));
        assertThat(cart.getCart().get(BANANA), is(1));
    }

    @Test
    public void returnQuatityOneWhenHavingTwoSameProductsFromShoppingCart() {
        cart.addItem(APPLE);
        cart.addItem(APPLE);

        cart.removeItem(APPLE);

        assertThat(cart.getCart().get(APPLE), is(1));
    }

    @Test
    public void removeProductFromShoppingCartIfOnlyOneProductInside() {
        cart.addItem(APPLE);

        cart.removeItem(APPLE);

        assertThat(cart.getCart().get(APPLE), CoreMatchers.is(nullValue()));
    }

    @Test
    public void removeOnlyOneProductFromShoppingCartIfOnlyTwoProductInside() {
        cart.addItem(APPLE);
        cart.addItem(BANANA);

        cart.removeItem(APPLE);

        assertThat(cart.getCart().get(APPLE), is(nullValue()));
        assertThat(cart.getCart().get(BANANA), is(1));
    }

    @Test
    public void calculateTheTotalPriceForOnlyOneProductWithOnlyOneQuatity() {
        cart.addItem(APPLE);
        cart.addItem(BANANA);

        cart.totalPrice();

        assertThat(cart.totalPrice(), is(26.0));
    }

    @Test
    public void calculateTheTotalPriceForOnlyOneProductWithOnlyTwoQuatity() {
        cart.addItem(APPLE);
        cart.addItem(APPLE);
        cart.addItem(BANANA);
        cart.addItem(BANANA);

        cart.totalPrice();

        assertThat(cart.totalPrice(), is(52.0));
    }

}
