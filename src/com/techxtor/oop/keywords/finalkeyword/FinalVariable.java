package com.techxtor.oop.keywords.finalkeyword;

// final -> constant
// becomes constant after it's initialized
class Alpha {
    int i = 5;
    final double PI = 3.14;
    final String DAY;

    public Alpha() {
        i = 10;
        DAY = "Monday";
    }
}

public class FinalVariable {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        System.out.println(a.i);
    }
}

//final variable can not be reassigned
