package com.techxtor.oop.dataabstraction.interfaces;

interface Alpha {
    void abc();

    // after v8, we can have method definition as well
    // need to add default keyword
    default void show() {
        System.out.println("in show");
    }
}

class AlphaImpl implements Alpha {

    @Override
    public void abc() {
        System.out.println("in abc");
    }

    public void show() {
        System.out.println("Overriding show of interface");
    }
}

public class DefaultMethodInInterface {
    public static void main(String[] args) {
        Alpha a = new AlphaImpl();
        a.abc();
        a.show();
    }
}
