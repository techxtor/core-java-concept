package com.techxtor.oop.polymorphism.runtime.dynamicmethoddispatch;

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }

    public void config() {
        System.out.println("in B config");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

/*         we can create object of child and have reference of parent
         reference does not matter, implementation does*/

        A obj = new B(); //runtime polymorphism
        obj.show(); // calls show of B [show() also needs to be in A]

/*         if reference is of parent and object is of child -> only those that are in parent can be accessed
         below gives compile time error as config is not known to parent*/
//        obj.config();

        obj = new C();
        // dynamic method dispatch
        obj.show(); // calls show of C
    }
}
// Dynamic Method Dispatch:
// It is a process in which a function call to the overridden method is resolved at Runtime
 // makes use of Method Overriding concept