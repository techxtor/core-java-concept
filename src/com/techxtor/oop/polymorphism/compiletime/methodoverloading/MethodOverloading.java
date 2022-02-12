package com.techxtor.oop.polymorphism.compiletime.methodoverloading;

class Casio {
    public void Add(int j, int k) {
        System.out.println(j + k);
    }
    //method overloading can be performed by changing method signature.

    //method overloading - no of parameter changed
    public void Add(int i, int j, int k) {
        System.out.println(i + j + k);
    }

    // method overloading - type of parameter changed
    public void Add(double i, int j, int k) {
        System.out.println(i + j + k);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        int a;
//        System.out.println(a); //variable a might not have been initialized
        Casio obj = new Casio();
        obj.Add(4, 2);

        obj.Add(2, 3, 4);

        obj.Add(2.5, 3, 4);

    }
}


