package com.bridgelabz.method;

public class GFG {
    public static void main (String[] args) {

        // Creating an instance of the class
        Test obj = new Test();

        // Calling the m1() method by the object created in above step.
        int i = obj.m1();
        System.out.println("Control returned after method m1 :" + i);

        // Call m2() method
        // obj.m2();
        int no_of_objects = Test.get();

        System.out.print("No of instances created till now : ");
        System.out.println(no_of_objects);
    }
}
