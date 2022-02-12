package com.techxtor.exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionWithTryCatch {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");

        int n = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
            System.out.println(n);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            br.close(); // this also throws error hence added Exception in method signature
        }
    }
}
