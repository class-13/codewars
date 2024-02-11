package com.github.class13.arraysquareup;

import java.util.Arrays;

public class SquareUp {

    public static int[] squareUp(int n) {
        return new int[n * n];
    }

    public static void main(String... args) {
        System.out.println(Arrays.toString(squareUp(4)));
    }
}
