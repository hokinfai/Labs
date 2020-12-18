package com.cybermonkey;

import com.cybermonkey.calculator.MortgageLoanCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MortgageLoanCalculatorTest {

    private MortgageLoanCalculator loanCalculator;

    @Before
    public void setup() {
        loanCalculator = new MortgageLoanCalculator();
    }

    @Test
    public void return50PercentForYounthAndPriceGreaterThan800() {
        assertThat(loanCalculator.calculateLoanPercentage(44, true, 801, true), is(0.5));
    }

    @Test
    public void return80PercentForYounthAndPriceBetween600To800() {
        assertThat(loanCalculator.calculateLoanPercentage(44, true, 800, true), is(0.8));
        assertThat(loanCalculator.calculateLoanPercentage(44, true, 601, true), is(0.8));
    }

    @Test
    public void return80PercentForYounthAndPriceBetween330To600() {
        assertThat(loanCalculator.calculateLoanPercentage(44, true, 600, true), is(0.8));
        assertThat(loanCalculator.calculateLoanPercentage(44, true, 331, true), is(0.8));
    }

    @Test
    public void return90PercentForYounthAndPriceLessThan330() {
        assertThat(loanCalculator.calculateLoanPercentage(44, true, 300, true), is(0.9));
        assertThat(loanCalculator.calculateLoanPercentage(44, true, 0, true), is(0.9));
    }

    @Test
    public void return50PercentForNonYounthAndPriceGreaterThan800() {
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 801, true), is(0.5));
    }

    @Test
    public void return60PercentForNonYounthAndPriceBetween600To800() {
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 800, true), is(0.6));
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 601, true), is(0.6));
    }

    @Test
    public void return70PercentForNonYounthAndPriceBetween330To600() {
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 600, true), is(0.7));
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 331, true), is(0.7));
    }

    @Test
    public void return90PercentForNonYounthAndPriceLessThan330() {
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 300, true), is(0.9));
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 0, true), is(0.9));
    }

    @Test
    public void return40PercentForNonYounthAndPriceLessThan330() {
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 300, true), is(0.9));
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 0, true), is(0.9));
    }

    @Test
    public void return40PercentForNonFirstBuyerAndPriceGreaterThan800() {
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 801, false), is(0.4));
    }

    @Test
    public void return50PercentForNonFirstBuyerAndPriceBetween600To800() {
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 800, false), is(0.5));
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 601, false), is(0.5));
    }

    @Test
    public void return60PercentForNonFirstBuyerAndPriceBetween330To600() {
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 600, false), is(0.6));
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 331, false), is(0.6));
    }

    @Test
    public void return70PercentForNonFirstBuyerAndPriceLessThan330() {
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 300, false), is(0.7));
        assertThat(loanCalculator.calculateLoanPercentage(45, true, 0, false), is(0.7));
    }

    @Test
    public void return30PercentForNonLocalAndPriceGreaterThan800() {
        assertThat(loanCalculator.calculateLoanPercentage(45, false, 801, false), is(0.3));
        assertThat(loanCalculator.calculateLoanPercentage(44, false, 801, false), is(0.3));
        assertThat(loanCalculator.calculateLoanPercentage(45, false, 801, true), is(0.3));
    }

    @Test
    public void return40PercentForNonLocalAndPriceBetween600To800() {
        assertThat(loanCalculator.calculateLoanPercentage(45, false, 800, false), is(0.4));
        assertThat(loanCalculator.calculateLoanPercentage(45, false, 601, true), is(0.4));
    }

    @Test
    public void return50PercentForNonLocalAndPriceBetween330To600() {
        assertThat(loanCalculator.calculateLoanPercentage(45, false, 600, false), is(0.5));
        assertThat(loanCalculator.calculateLoanPercentage(45, false, 331, true), is(0.5));
    }

    @Test
    public void return60PercentForNonLocalAndPriceLessThan330() {
        assertThat(loanCalculator.calculateLoanPercentage(45, false, 300, false), is(0.6));
        assertThat(loanCalculator.calculateLoanPercentage(45, false, 0, true), is(0.6));
    }
}
