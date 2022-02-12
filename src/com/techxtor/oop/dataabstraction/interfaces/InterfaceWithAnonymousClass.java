package com.techxtor.oop.dataabstraction.interfaces;

interface AbcInterface {
    void show();
}

/*
class AbcImpl implements AbcInterface{

    @Override
    public void show() {
        System.out.println("something");
    }
}*/

public class InterfaceWithAnonymousClass {
    public static void main(String[] args) {

        // conventional way
/*        AbcInterface obj = new AbcImpl();
        obj.show();*/

        AbcInterface obj = new AbcInterface() {
            // implement abstract method here
            @Override
            public void show() {
                System.out.println("something in anonymous");
            }
        };
        obj.show();
    }
}

// we can create object of interface using anonymous class
