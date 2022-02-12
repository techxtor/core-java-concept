package com.techxtor.oop.dataabstraction.interfaces;

// multiple inheritance can be achieved
// given a choice, go for Interface

interface WriterIC {
    void write(); //public abstract by default
    // abstract method do not specify a body
}

class PenIC implements WriterIC {
    public void write() {
        System.out.println("I am a Pen");
    }
}

class PencilIC implements WriterIC {
    public void write() {
        System.out.println("I am a Pencil");
    }
}

class KitIC {
    public void doSomething(WriterIC p) {
        p.write();
    }
}

public class Interface {
    public static void main(String[] args) {

        KitIC kw = new KitIC();

        WriterIC pcwr = new PencilIC();
        kw.doSomething(pcwr);

        WriterIC pnwr = new PenIC();
        kw.doSomething(pnwr);

    }
}
