package com.techxtor.oop.dataabstraction.interfaces;


class Pen {
    public void write() {
        System.out.println("I am a Pen");
    }
}

class Pencil {
    public void write() {
        System.out.println("I am a Pencil");
    }
}

class Kit {

    // accepts pen reference as param
    public void doSomething(Pen p) {
        p.write();
    }

    //accepts pencil reference as param
    public void doSomething(Pencil p) {
        p.write();
    }
}

public class WithoutAbstractClass {
    public static void main(String[] args) {
        Kit k = new Kit();

        // create pen_ref -> pen_obj to pass as param
        Pen p = new Pen();
        k.doSomething(p);

        // create pencil_ref -> pencil_obj to pass as param
        Pencil pc = new Pencil();
        k.doSomething(pc);
    }
}
