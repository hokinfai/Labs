package com.cybermonkey;

public class MortgageDetail {
    private int minAge;
    private int maxAge;
    private Price minPrice;
    private Price maxPrice;
    private boolean isCitizen;
    private double percentage;
    private final boolean isFirstBuyer;

    public MortgageDetail(int minAge,
                          int maxAge,
                          Price minPrice,
                          Price maxPrive,
                          boolean isCitizen,
                          boolean isFirstBuyer, double percentage) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.minPrice = minPrice;
        this.maxPrice = maxPrive;
        this.isCitizen = isCitizen;
        this.percentage = percentage;
        this.isFirstBuyer = isFirstBuyer;
    }

    public double getPercentage() {
        return percentage;
    }

    public boolean isAgeMatch(int age) {
        return maxAge >= age && minAge <= age;
    }

    public boolean isPriceMatch(int price) {
        return maxPrice.getPrice() >= price && minPrice.getPrice() < price;
    }

    public boolean isCitizenMatch(boolean isCitizen) {
        return this.isCitizen == isCitizen;
    }

    public boolean isFirstBuyer(boolean isFirstBuyer) {
        return this.isFirstBuyer == isFirstBuyer;
    }

}
