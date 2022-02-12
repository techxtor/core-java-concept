package com.techxtor.basics;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // breaks the loop
            }
            System.out.println("value is " + i);
        }
    }
}

// continue skips the current iteration and continue
// break will break the loop
