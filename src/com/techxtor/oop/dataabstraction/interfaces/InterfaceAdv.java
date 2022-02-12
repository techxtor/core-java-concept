package com.techxtor.oop.dataabstraction.interfaces;

interface Abc {
    void show();
}

class Implementor implements Abc {
    @Override
    public void show() {
        System.out.println("Something");
    }
}

public class InterfaceAdv {
    public static void main(String[] args) {
        Abc obj = new Implementor();
    }
}
