package com.bridgelabz;
//7. Java Program to Find Area of Square, Rectangle and Circle using Method Overloading
//Explanation
//This is a Java Program to Find Area of Square, Rectangle and Circle using Method Overloading.
//We declare three methods of the same name but with different numbers of arguments or with different data types.
// Now when we call these methods using objects, corresponding methods will be called as per the number of arguments
// or their data types.
class Calculate{
    double side,length,width,radius;
    void calculate(double side){
        System.out.println("Area of square : "+(side * side));
    }
    void calculate(double length,double width){
        System.out.println("Area of rectangle : "+(length * width));
    }
    void calculate(double pi,double radius,double radius2){
        System.out.println("Area of circle : "+(pi * (radius*radius2)));
    }
}
public class Area_of_square_rectangle_circle_by_overloading {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        c.calculate(2,4.5);
    }
}
