package com.cybermonkey;

import java.util.Scanner;

import static com.cybermonkey.PriceCalculator.getChanges;
import static com.cybermonkey.PriceCalculator.getNumberOfProducts;

public class VendingMachineApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select your drink: 1. Coke, 2. Sport Drink");

        System.out.print("Drink ID: ");
        int id = scanner.nextInt();

        System.out.print("How much you will pay: ");
        double amount = scanner.nextDouble();

        int numberOfProducts = getNumberOfProducts(id, amount);
        double changes = getChanges(id, amount);

        System.out.println("\nYou can buy " + numberOfProducts + " " + DrinkCategory.getDrinkCategory(id));
        System.out.println("Your changes are " + changes);

    }
}
