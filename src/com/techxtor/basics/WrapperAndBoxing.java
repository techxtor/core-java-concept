package com.techxtor.basics;

public class WrapperAndBoxing {
    public static void main(String[] args) {
        int i = 5; // primitive datatype

        Integer ii = new Integer(5); // Boxing/Wrapping
        int jj = ii.intValue(); // 5 Unboxing

        Integer kk = 10; // Auto-Boxing
        int ll = kk; // Auto-Unboxing

        String str = "123";
        int istr = Integer.parseInt(str);
        System.out.println(istr);
    }
}
