/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cybermonkey;

import java.util.Scanner;

public class MinValueFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many values are there: ");
        int n = scanner.nextInt();
        double minValue = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print(String.format("Please enter the %d number: ", i + 1));
            double userInput = scanner.nextDouble();
            minValue = Math.min(minValue, userInput);
        }
        System.out.println(minValue);
    }
}