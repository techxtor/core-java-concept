package com.techxtor.oop.classandobject.anonymousclass;

class Alpha {
    public void show() {
        System.out.println("in A show");
    }
}

// only purpose is to override Abc.show()
class Beta extends Alpha {
    public void show() {
        System.out.println("im the best");
    }
}

public class WithoutAnonymousClass {
    public static void main(String[] args) {
        Alpha obj = new Beta();
        obj.show();
    }
}
