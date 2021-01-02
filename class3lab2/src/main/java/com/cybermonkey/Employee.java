package com.cybermonkey;

public class Employee {
    private String name;
    private double numberOfHoursPerDay;
    private double salary;

    public Employee(String name, double numberOfHoursPerDay, double salary) {
        this.name = name;
        this.numberOfHoursPerDay = numberOfHoursPerDay;
        this.salary = salary;
    }

    private void addSal() {
        if (salary < 500.00) {
            salary += 10.0;
        }
    }

    private void addWork() {
        if (numberOfHoursPerDay > 6.0) {
            salary += 5.0;
        }
    }

    public double getSalary() {
        addWork();
        addSal();
        return salary;
    }

    public String getInfo() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", numberOfHoursPerDay=" + numberOfHoursPerDay +
                ", salary=" + salary +
                '}';
    }
}
