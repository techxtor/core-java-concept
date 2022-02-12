package com.techxtor.oop.keywords.superkeyword;

class A {
    public A() {
        System.out.println("in A");
    }

    public A(int i) {
        System.out.println("in A parameterized");
    }
}

class B extends A {
    public B() {
//        super(); //exists by default and calls parent constructor
        System.out.println("in B");
    }

    public B(int i) {
//        super(); //exists by default and calls parent constructor

        // calls parameterized constructor of A
        super(i);
        System.out.println("in B parameterized");
    }
}

public class Super {
    public static void main(String[] args) {

        // calls constructor of A
//        A obj1 = new A();

        // calls constructor of A
        // and constructor of B
//        B obj2 = new B();

        // calls constructor of A
        // and constructor of B
        B obj3 = new B(5);
    }
}

// super is used to denote parent and can access constructor, members ..
// also see 'MethodOverriding.java' for member variable and member function