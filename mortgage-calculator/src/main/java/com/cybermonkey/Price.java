package com.cybermonkey;

public enum Price {
    OVER_EIGHT_HUNDRED(Integer.MAX_VALUE),
    EIGHT_HUNDRED(800),
    SIX_HUNDRED(600),
    THRITY_THREE_HUNDRED(330),
    LESS_THAN_THRITY_THREE_HUNDRED(-1);

    private int price;

    Price(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
