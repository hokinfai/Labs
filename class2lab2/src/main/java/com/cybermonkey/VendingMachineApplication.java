package com.cybermonkey;

import java.util.Scanner;

public class VendingMachineApplication {

    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select your drink: 1. Coke, 2. Sport Drink");

        System.out.print("Drink ID: ");
        int id = scanner.nextInt();

        System.out.print("How much you will pay: ");
        double amount = scanner.nextDouble();

        int numberOfProducts = calculator.getNumberOfProducts(id, amount);
        double changes = calculator.getChanges(id, amount);

        System.out.println("\nYou can buy " + numberOfProducts + " " + DrinkCategory.getDrinkCategory(id));
        System.out.println("Your changes are " + changes);

    }
}
