package com.techxtor.oop.dataabstraction.interfaces;

interface ASMI {
    int i = 10; // final by default

    void abc();

    default void show() {
        System.out.println("in AMI show");
    }

    // static method can not be default here
    static void display() {
        System.out.println("hi");
    }
}

class ASMIImpl implements ASMI {
    @Override
    public void abc() {
//        i=12;
        // cannot assign value to final variable
    }
}

public class StaticMethodInInterface {
    public static void main(String[] args) {
        ASMI.display();
        // non static field cannot be referenced from static content
//        ASMI.show();
    }
}
