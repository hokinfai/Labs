/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cybermonkey;

public class ReverseTrianglePattern {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
