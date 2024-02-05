package com.github.class13.lastdigitsofn2;

import java.util.ArrayList;
import java.util.List;

public class GreenNumbers {

    public static List<Long> get(int n) {
        List<Long> greenNumbers = new ArrayList<>();
        greenNumbers.add(1L);
        for (long i = 2, k = 2; k <= n; i++) {
            if (isGreenNum(String.valueOf(i), String.valueOf(i * i))) {
                greenNumbers.add(i);
                k++;
            }
        }

        return greenNumbers;
    }

    private static boolean isGreenNum(String n, String n2) {
        return n2.endsWith(n);
    }

    public static void main(String[] args) {
        List<Long> greenNumbers = get(13);
        greenNumbers.forEach(System.out::println);
    }
}
