package com.techxtor.exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DefaultCheckedException {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // this gives checked exception error -> hence 'throws Exception'

        System.out.println(n);
    }
}
