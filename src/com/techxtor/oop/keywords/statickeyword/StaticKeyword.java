package com.techxtor.oop.keywords.statickeyword;

class Emp {

    int eid;
    int salary;

    // if something is not object specific can be made static
    // loads with class
    // dont need object to access
    static String ceo;

    // when class is loaded [class is created once]
    static {
        ceo = "StaticBlockCEO";
        System.out.println("in static block");
    }

    // when object is created
    public Emp() {
        eid = 100;
        salary = 10000;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class StaticKeyword {

    int alpha = 0;

    public static void main(String[] args) {
        Emp manish = new Emp();
        // non static field cannot be referenced from static content
//         alpha =1;
        manish.eid = 101;
        manish.salary = 50000;
//        manish.ceo = "Mahesh";

        Emp rahul = new Emp();
        rahul.eid = 102;
        rahul.salary = 40000;
//        rahul.ceo = "Mahesh";

        // change is applicable for both manish as well as rahul and all..
//        manish.ceo="NewCEO";

        // accessed with class name directly
//        Emp.ceo="SuperNewCEO";

        manish.show();
        rahul.show();
    }
}
