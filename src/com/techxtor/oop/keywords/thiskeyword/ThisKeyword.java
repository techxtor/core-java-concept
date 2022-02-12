package com.techxtor.oop.keywords.thiskeyword;

class Add {
    int num1;
    int num2;
    int result;

    // this makes sure we are referring to instance variable
    // this refers to current object
    public Add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // here instance variable and local variable have different names - hence everything is fine
    // however if local variable name is also same as instance variable name, it creates confusion on which is which on assign
/*        public Add(int number1, int number2) {
            num1 = number1;
            num2 = number2;
        }*/

    public void perform() {
        result = num1 + num2;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Add obj = new Add(5, 12);
        obj.perform();

        System.out.println(obj.result);
    }
}
