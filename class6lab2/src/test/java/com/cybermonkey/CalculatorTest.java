package com.cybermonkey;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void calculateEvenValue() {
        assertThat(calculator.calculate(List.of(2, 4, 6, 8, 10)), is(60));
    }

    @Test
    public void calculateOddValue() {
        assertThat(calculator.calculate(List.of(1, 3, 5)), is(27));
    }

    @Test
    public void calculateBothOddEvenValue() {
        assertThat(calculator.calculate(List.of(1, 2, 3, 4, 5, 6)), is(51));
    }

}
