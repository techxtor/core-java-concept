package com.techxtor.exceptionhandling.checkedexception;

public class UserDefinedException {
    public static void main(String[] args) {
        int i, j;
        i = 8;
        j = 9;
        try {
            int k = i / j;
            if (k == 0) {
//                throw new Exception();
                throw new TechxtorException("this is not acceptable");
            }
            System.out.println(k);
        } catch (TechxtorException e) {
//            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}
