package com.bridgelabz;
//6. Java Program to Find Arithmetic Sum by Passing Argument Using Method Overloading
//   Explanation:
//This is a Java Program to Find Arithmetic Sum of 2 or 3 or 4 Variables by Passing Arguments using Method Overloading.
// Two or more methods within the same class that share the same name but with different parameter declarations are
// called overloaded methods, and the process is referred to as method overloading.
//Here we define a class with three different methods with the same name but different number of parameters.
// Now these methods can be called depending upon the number of arguments passed. Hence we get three different values
// as output.
class Method_Overloading{
    void add(int a,int b){                              // two parameters
        System.out.println("Addition is : "+(a+b));
    }
    void add(int a,int b, int c){                       //three parameters
        System.out.println("Addition is : "+(a+b+c));
    }
    void add(int a,int b, int c, int d){                //four parameters
        System.out.println("Addition is : "+(a+b+c+d));
    }
}
public class Arithmetic_sum_by_overloading {
    public static void main(String[] args) {
        Method_Overloading m = new Method_Overloading();
        m.add(2,3);
    }
}
