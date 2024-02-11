package com.github.class13.arraysquareup;

import java.util.Arrays;

public class SquareUp {

    public static int[] squareUp(int n) {
        if (n == 1) {
            return new int[]{1};
        }
        int[] array = new int[n * n];
        int zc = 1, dc = 0, zBlockSize = n - 1, dBlockSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (dc != 0) {
                array[i] = dc;
                dc--;
                if (dc == 0 && zBlockSize == 0) {
                    dBlockSize = n;
                    dc = dBlockSize;
                }
                continue;
            }
            if (zc == zBlockSize) {
                zBlockSize--;
                dBlockSize++;
                dc = dBlockSize;
                zc = 1;
            } else {
                zc++;
            }
        }
        return array;
    }

    public static void main(String... args) {
        System.out.println(Arrays.toString(squareUp(1)));
    }
}
