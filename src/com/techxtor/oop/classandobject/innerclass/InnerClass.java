package com.techxtor.oop.classandobject.innerclass;

class Outer {
    int a;

    public void show() {
        System.out.println("in outer class show function");
    }

    // inner class
    class Inner {                           // Outer$Inner.class
//        Also, because an inner class is associated with an instance, it cannot define any static members itself
//        static int a;
        public void display() {
            System.out.println("in inner class display function");
        }
    }

    // inner class [static]
    static class StaticInner {                           // Outer$StaticInner.class
        static int a; //here static member as well as non static is OK
        public void view() {
            System.out.println("in static inner class view function");
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.show();

        // <outer_class>.<inner_class> in = out.new <inner_class>();
        Outer.Inner in = out.new Inner();
        in.display();

        // <outer_class>.<inner_class> in = new <outer_class>.<inner_class>();
        Outer.StaticInner static_in = new Outer.StaticInner();
        static_in.view();
        Outer.StaticInner.a =10;
    }
}
