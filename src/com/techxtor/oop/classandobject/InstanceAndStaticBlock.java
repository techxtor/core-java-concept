package com.techxtor.oop.classandobject;

class ClassA {
    static
    {
        System.out.println("in static block");
    }

    {
        System.out.println("in instance block");
    }
}

public class InstanceAndStaticBlock {
    public static void main(String[] args) throws Exception {

        // runs static block code then instance block
        // static block runs on class creation
        // instance runs on object creation
        ClassA obj = new ClassA();

    }
}