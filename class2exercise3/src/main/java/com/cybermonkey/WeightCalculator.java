package com.cybermonkey;

import java.util.Scanner;

public class WeightCalculator {
    /* Read the user’s weight in stones and pounds,
	      and output their weight in kilos. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tell me your weight.");

        System.out.print("How many stones: ");
        int stones = scanner.nextInt();

        System.out.print("How many pounds: ");
        int pounds = scanner.nextInt();

        double kilos = (14 * stones + pounds) * 0.4536;

        System.out.print("You weigh ");
        System.out.print(kilos);
        System.out.println(" kilos.");
    }
}
