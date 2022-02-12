package com.techxtor.exceptionhandling;

//default run -> ArrayIndexOutOfBoundsException error

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] a = new int[6];
//            a[6]=8; // comment this for divide by zero exception

            int i = 9;
            int j = 0;
//            int k = i / j; //comment line:8 and this to get null pointer exception

            int[] arr = null;
            arr[3] = 5;

//            System.out.println("Output is " + k);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
//            System.err.println("Error: "); //prints in red
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bye");
        }

    }

}

