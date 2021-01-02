package com.cybermonkey;

import java.util.Scanner;

import static com.cybermonkey.PriceCalculator.getChanges;
import static com.cybermonkey.PriceCalculator.getNumberOfProducts;

public class VendingMachineApplication {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello, Thank you for using our vending machine.");
            System.out.println("Please select \n1: coke, 2: red bull, 3: water?");
            int productId = scanner.nextInt();

            System.out.print("How much you will pay: ");
            double amount = scanner.nextDouble();

            System.out.println("\nBuying " + getNumberOfProducts(productId, amount) + " " + ProductCategory.getProductById(productId).getName());
            System.out.println("Your changes are " + getChanges(productId, amount)+ "\n");
            System.out.println("-------------------------");
        }
    }
}
