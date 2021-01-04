package com.cybermonkey;

import java.util.List;

public class ListEvenOddNumberCalculator {

    public static void main(String args[]) {
        System.out.println(calculate(List.of(1, 2, 3, 4, 5, 5, 6)));
    }

    public static Integer calculate(List<Integer> input) {
        Integer total = 0;
        for (Integer i : input) {
            if (i % 2 == 0) {
                total += i * 2;
            } else {
                total += i * 3;
            }
//            total += (i % 2 == 0) ? i * 2 : i * 3;
        }
        return total;
    }
}
