package com.techxtor.oop.keywords.finalkeyword;

class A {
    public void show() {
        System.out.println("in show");
    }
}

class B extends A {

}

final class C {
    public void display() {
        System.out.println("in display");
    }
}

// cannot inherit from final class
/*class D extends C {

}*/

public class FinalClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // calls show of A
    }
}

// final class can not be extended/inherited
