package com.cybermonkey;

public class Student {
    public Integer idNumber;
    public String name;
    public String degree;
    public int year;

    public Student(Integer idNumber, String name, String degree){
        this.idNumber = idNumber;
        this.name = name;
        this.degree = degree;
        this.year = 1;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void advanceYear() {
        this.year = year++;
    }

    public String getName() {
        return name;
    }

    public String display() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", degree='" + degree + '\'' +
                ", year=" + year +
                '}';
    }
}
