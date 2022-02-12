package com.techxtor.oop.constructor;

class CasioCalculator {
    int num1;
    int num2;
    String operation;

    //default constructor
    public CasioCalculator() {
        num1 = 0;
        num2 = 0;
        operation = "nothing";
        System.out.println("in constructor1");
    }

    // same as method overloading
    //constructor overloading - parameter changed
    public CasioCalculator(int i) {
        num1 = i;
        num2 = 0;
        operation = "nothing";
        System.out.println("in constructor2");
    }

    // constructor overloading - parameter changed
    public CasioCalculator(int i, int j) {
        num1 = i;
        num2 = j;
        operation = "nothing";
        System.out.println("in constructor3");
    }

    // constructor overloading - parameter and type changed
    public CasioCalculator(int i, int j, String op) {
        num1 = i;
        num2 = j;
        operation = op;
        System.out.println("in constructor4");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        CasioCalculator obj = new CasioCalculator(4, 5, "Add");
    }
}
