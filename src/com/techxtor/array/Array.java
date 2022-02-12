package com.techxtor.array;

class Student {
    int rollno;
    String name;
}

public class Array {

    public static void main(String[] args) {
        int[] nums = new int[4];
        int[] nums1 = {1, 2, 3, 4};

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 2 * i;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        // array of type Student - vales: student object
        // array of type int - values: int
        Student[] s = {s1, s2, s3, s4};
    }
}
