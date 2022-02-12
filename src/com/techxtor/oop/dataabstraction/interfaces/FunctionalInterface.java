package com.techxtor.oop.dataabstraction.interfaces;

@java.lang.FunctionalInterface
interface AlphaFI {
    void show();
//    void eat();  // error as only one method is allowed and annotation gives CTE
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // implements show() method
        AlphaFI obj = () -> System.out.println("I am the best"); // lambda expression
        obj.show();
    }
}

/*
Types of Interface
1. Normal - which has more than one method
2. SAM - single abstract method - which has only one abstract method - Functional Interface -Lambda Expression
3. Marker interface - does not have any method

*/

/*
Conceptually, a functional interface has exactly one abstract method.
Since default methods have an implementation, they are not abstract*/
