package com.techxtor.oop.dataabstraction.interfaces;

abstract class Writer {
    public abstract void write();
}

class PenWriter extends Writer {
    public void write() {
        System.out.println("I am a Pen");
    }
}

class PencilWriter extends Writer {
    public void write() {
        System.out.println("I am a Pencil");
    }
}

class KitWriter {

    // accepts Writer reference as param
    public void doSomething(Writer p) {
        p.write();
    }
}

public class WithAbstractClass {
    public static void main(String[] args) {
        KitWriter kw = new KitWriter();

        // create Writer_ref -> pencil_obj to pass as param
        Writer pcwr = new PencilWriter();
        kw.doSomething(pcwr);

        // create Writer_ref -> pen_obj to pass as param
        Writer pnwr = new PenWriter();
        kw.doSomething(pnwr);

    }
}

// Benefit ??
// -> no need to create multiple method in KitWriter
