package com.techxtor.array;

class Calc {
    public int add(int... n) {
        int sum = 0;
        for (int i : n) {
            sum = sum + i;
        }
        return sum;
    }
}

public class Varargs {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int resultOf3 = obj.add(4, 5, 6);
        int resultOf5 = obj.add(4, 5, 6, 1, 3);

        System.out.println(resultOf3);
        System.out.println(resultOf5);
    }
}
