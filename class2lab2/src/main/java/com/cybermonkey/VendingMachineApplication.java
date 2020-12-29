package com.cybermonkey;

import java.util.Scanner;

import static com.cybermonkey.PriceCalculator.getChanges;
import static com.cybermonkey.PriceCalculator.getNumberOfProducts;

public class VendingMachineApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, Thank you for using our \"COKE\" vending machine");

        System.out.print("How much you will pay: ");
        double amount = scanner.nextDouble();

        System.out.println("\nYou can buy " + getNumberOfProducts(amount) + " Cokes");
        System.out.println("Your changes are " + getChanges(amount));
    }
}
