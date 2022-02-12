package com.techxtor.oop.encapsulation;

class Students {
    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        Students s = new Students();
        s.setName("Manish");
        s.setRollno(101);
        System.out.println(s.getName());
        System.out.println(s.getRollno());
    }
}

// Encapsulation -> Binding data with methods
// Encapsulation is data hiding(information hiding)
