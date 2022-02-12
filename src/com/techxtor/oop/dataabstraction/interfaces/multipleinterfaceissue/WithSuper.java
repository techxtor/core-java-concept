package com.techxtor.oop.dataabstraction.interfaces.multipleinterfaceissue;

interface Alpha {
    void abc();

    //    show method in 1st parent
    default void show() {
        System.out.println("in Alpha show");
    }
}

interface Beta {
    //    show method in 2nd parent
    default void show() {
        System.out.println("in Beta show");
    }
}

class ImplClass implements Alpha, Beta {
    public void abc() {

    }

    @Override
    public void show() {
//        Alpha.super.show();
        Beta.super.show();
    }
}

public class WithSuper {
    public static void main(String[] args) {
        Alpha a = new ImplClass();
        a.show();
    }
}
