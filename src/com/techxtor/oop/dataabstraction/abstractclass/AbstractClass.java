package com.techxtor.oop.dataabstraction.abstractclass;

abstract class Human {
    // abstract class can have abstract as well as non-abstract methods

    // non-abstract method
    public void eat() {

    }

    // non-abstract method
    public void sleep() {

    }

    // abstract method
    // note: class should be abstract for method to be abstract
    public abstract void walk();
}

// class that extends abstract class must implement it's abstract method
class Men extends Human {

    @Override
    public void walk() {

    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // abstract class cannot be instantiated
//        Human h = new Human();

        // reference of Abstract class -> obj of its extended method
        Human obj = new Men();
    }
}