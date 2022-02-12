package com.techxtor.oop.inheritance;

class Calculators {                                  // super
    public int add(int i, int j) {
        return i + j;
    }
}

class CalculatorsAdv extends Calculators {           // sub
    /*    public int add (int i, int j){
            return i+j;
        }*/
    public int sub(int i, int j) {
        return i - j;
    }
}

// this will have all properties of CalculatorsAdv and Calculators
class CalculatorsNextGen extends CalculatorsAdv {
    public int mul(int i, int j) {
        return i * j;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        CalculatorsAdv obj = new CalculatorsAdv();
        System.out.println(obj.add(5, 6));
        System.out.println(obj.sub(4, 1));

        CalculatorsNextGen obj1 = new CalculatorsNextGen();
        System.out.println(obj1.add(5, 6));
        System.out.println(obj1.sub(4, 1));
        System.out.println(obj1.mul(4, 8));
    }
}
