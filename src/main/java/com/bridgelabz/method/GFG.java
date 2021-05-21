package com.bridgelabz.method;

public class GFG {
    public static void main (String[] args) {

        // creating an instance of Addition class
        Addition add = new Addition();

        // calling addTwoInt() method to add two integer using instance created
        // in above step.
        int s = add.addTwoInt(1,2);
        System.out.println("Sum of two integer values :"+ s);

    }
}
