package com.techxtor.oop.classandobject.anonymousclass;

class A {
    public void show() {
        System.out.println("in A show");
    }
}

public class WithAnonymousClass {
    public static void main(String[] args) {
/*
        A obj = new A() {
            public void show() {
                System.out.println("in the anonymous class");
            }
        };
*/
        A obj = new A() {
            public void show() {
                System.out.println("in the anonymous class");
            }
        };
        obj.show();
    }
}
