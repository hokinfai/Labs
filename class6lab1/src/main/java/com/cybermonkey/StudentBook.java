/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cybermonkey;

import java.util.HashMap;
import java.util.Map;

public class StudentBook {
    public static void main(String args[]) {

        Student studentJudy = new Student(00001, "Judy", "Communication");

        Student studentTom = new Student(3452, "Tom", "Computer Science");

        Student studentMary = new Student(3453, "Mary", "Computer Science");

        Map<Integer, Student> studentBook = new HashMap<>();
        studentBook.put(00001, studentJudy);
        studentBook.put(3452, studentTom);
        studentBook.put(3452, studentMary);

        System.out.println(studentBook);
        System.out.println(studentBook.get(00001).display());
    }
}
