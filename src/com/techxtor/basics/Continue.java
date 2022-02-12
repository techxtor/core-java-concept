package com.techxtor.basics;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue; // skips the remaining statement in block and jump to 8 [skips print of 7]
            }
            System.out.println("value is " + i);
        }
    }
}

// continue skips the current iteration and continue
// break will break the loop
