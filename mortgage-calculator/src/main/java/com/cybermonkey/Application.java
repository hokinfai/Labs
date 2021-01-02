package com.cybermonkey;

import com.cybermonkey.calculator.MortgageLoanCalculator;

import java.util.Scanner;

import static java.lang.String.format;

public class Application {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        final var age = scanner.nextInt();

        System.out.println("How much (in ten thousand) is the apartment you are going to buy?");
        final var price = scanner.nextInt();

        System.out.println("Are you local citizen (true/false)?");
        final var isCitizen = scanner.nextBoolean();

        System.out.println("Are you a first time buyer (true/false)?");
        final var isFirstBuyer = scanner.nextBoolean();

        final var loanPercentage = MortgageLoanCalculator.calculateLoanPercentage(age, isCitizen, price, isFirstBuyer) * 100.0;
        System.out.println(format("You are eligible for a mortgage loan up to %.2f%% percent.", loanPercentage));

    }
}
