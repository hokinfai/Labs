package com.cybermonkey;

public class Salary {
    private static final int MONTHS_IN_YEAR = 12;
    private double monthlyAmount;
    private String currency;

    public Salary(double monthlyAmount, String currency) {
        this.monthlyAmount = monthlyAmount;
        this.currency = currency;
    }

    public double getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(double monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getYearlyAmount() {
        return monthlyAmount * MONTHS_IN_YEAR;
    }
}
