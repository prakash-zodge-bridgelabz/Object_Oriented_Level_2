package com.bridgelabz;

import java.util.Scanner;

// 1. Java Program to create a calculator and Return a Value from a Method.
// Explanation:
// We make a method named input which is used to get input from the user.
// We also make a method named add which is used to perform addition and
// return the result back to input method where we finally print the result.

public class Calculator {
    double a,b;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter value of a : ");      a = sc.nextDouble();
        System.out.println("Enter value of b : ");      b = sc.nextDouble();
        System.out.println("Addition is : "+res());
    }
    double res(){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.input();

    }
}
