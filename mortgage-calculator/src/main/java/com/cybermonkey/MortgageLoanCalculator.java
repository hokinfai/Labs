/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cybermonkey;

import static com.cybermonkey.MortgageLoanMapper.calculateMortgageLoanPercentage;

public class MortgageLoanCalculator {

    public double calculateLoanPercentage(int age, boolean isCitizen, int price, boolean isFirstBuyer) {
        return calculateMortgageLoanPercentage(age, isCitizen, price, isFirstBuyer)
                .get()
                .getPercentage();
    }
}
