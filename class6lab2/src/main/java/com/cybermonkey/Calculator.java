package com.cybermonkey;

import java.util.List;

public class Calculator {

    public Integer calculate(List<Integer> input) {
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
