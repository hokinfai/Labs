/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cybermonkey;

public class AppleSalaryCalculator {

    public static void main(String[] args) {
        int dailyRate = 400;
        int workingDaysPerMonth = 25;
        int monthlySalary = dailyRate * workingDaysPerMonth;

        String message = "Apple's Salary is $";

        System.out.println(message + monthlySalary);
    }
}