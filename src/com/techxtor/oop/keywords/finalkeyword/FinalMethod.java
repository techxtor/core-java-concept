package com.techxtor.oop.keywords.finalkeyword;

class AFM {
    final public void show() {
        System.out.println("in AM show");
    }
}

class BFM extends AFM {
    //cannot override final method
/*    public void show(){
        System.out.println("in BM show");
    }*/
}

public class FinalMethod {
    public static void main(String[] args) {

    }
}

// final method can not be overridden
