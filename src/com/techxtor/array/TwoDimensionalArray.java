package com.techxtor.array;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[] c = {5, 8, 2, 3};

        // jagged array
        int[][] d = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 8, 9, 6, 5}
        };

        // 2D array
        int[][] e = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 8, 9, 6}
        };

        System.out.println(d[0][0]); // 1
        System.out.println(Arrays.toString(d[0])); // [1, 2, 3, 4]

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(" " + d[i][j]);
            }
            System.out.println();
        }
    }
}
