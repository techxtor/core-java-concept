package com.techxtor.oop.polymorphism.runtime.methodoverriding;

class A {
    int i;

    // is overridden in B
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    int i;

    // overrides method in A
    // @Override -> gives compile time error :)
    //           -> specifies that this method needs to override parent's method

    @Override
    public void show() {
        // assigns value to i of B
//        i =8;

        // assigns value of i of A
//        super.i = 8;

        // this will call show method of parent !
//        super.show();

        System.out.println("in B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // calls show of B
    }
}

// Method overriding:
// -> occurs when a derived class has a definition for one of the member functions of the base class
// -> That base function is said to be overridden
