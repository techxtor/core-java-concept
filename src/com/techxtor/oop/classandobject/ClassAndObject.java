package com.techxtor.oop.classandobject;

class Calculator {

    //member variables
    int num1;
    int num2;
    int result;

    // member functions
    public void perform() {
        result = num1 + num2;
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        // create object of class 'Calc' -> Obj is the reference
        Calculator obj = new Calculator();

        // assign values to member variable
        obj.num1 = 5;
        obj.num2 = 10;

        // call member function
        obj.perform();

        // call member variable and print it
        System.out.println(obj.result);
    }
}
