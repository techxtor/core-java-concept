package com.techxtor.oop.constructor;

class Calculator {
    int num1;
    int num2;
    int result;

    public void perform() {
        result = num1 + num2;
    }

    // member method
    // same name as classname
    // never return anything
    // used to allocate memory
    // initialize value
    // every time object is created, constructor is called
    // can have multiple constructor - if none specified java will have its own by default

    public Calculator() {
        num1 = 5;
        num2 = 10;
        System.out.println(" in default constructor");
    }

    public Calculator(int n) {
        num1 = n;
        num2 = n;
        System.out.println("in parameterized constructor");
    }
}

public class Constructor {
    public static void main(String[] args) {

        // calls default constructor
        Calculator obj = new Calculator();
        obj.perform();

        // calls parameterized constructor
        Calculator obj1 = new Calculator(7);
        obj1.perform();

        System.out.println(obj.result);
        System.out.println(obj1.result);

    }
}
