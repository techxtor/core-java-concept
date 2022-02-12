package com.techxtor.array;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        // enhanced loop
        for (int k : a) {
            System.out.println(k);
        }

        int[][] e = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 8, 9, 6}
        };

        //enhanced for loop
        for (int[] k : e) {
            for (int l : k) {
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }
}
