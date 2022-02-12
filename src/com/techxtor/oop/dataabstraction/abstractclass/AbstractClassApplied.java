package com.techxtor.oop.dataabstraction.abstractclass;

class Printer {
    // method 1
/*    public void show(Integer i) {
        System.out.println(i);
    }*/

    //method 2
/*    public void show(Double i) {
        System.out.println(i);
    }*/

    //instead of method 1 and 2 - we can create below method

    // Number is an abstract class and Integer, Double, etc. extends it..

/*    so we can create reference of Number (Number i)
    that will have object of Integer, Double, etc. based on what is passed by caller*/
    public void show(Number i) {
        System.out.println(i);
    }
}


public class AbstractClassApplied {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.show(5); // obj of integer
        obj.show(50.4); // obj of double
        obj.show(50.3f); // obj of float
    }
}
