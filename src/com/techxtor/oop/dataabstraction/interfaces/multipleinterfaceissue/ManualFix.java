package com.techxtor.oop.dataabstraction.interfaces.multipleinterfaceissue;

interface A {
    void abc();

    //    show method in 1st parent
    default void show() {
        System.out.println("in A show");
    }
}

interface B {
    //    show method in 2nd parent
    default void show() {
        System.out.println("in B show");
    }
}

class Impl implements A, B {
    public void abc() {

    }

    // if this is not present -> obj.show() doesnot know if it should call from A/B
    @Override
    public void show() {
        System.out.println(" in impl show");
    }
}

public class ManualFix {
    public static void main(String[] args) {
        A obj = new Impl();
        obj.show(); // calls show of Impl
    }
}
