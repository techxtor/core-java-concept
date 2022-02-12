package com.techxtor.exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(n);
        }
    }
}
