package com.bridgelabz;
//3. Java Program to create an Area of triangle and rectangle and Passing and Returning Objects in Java
//   Explanation:
//Enter length and breadth of the rectangle as input. After that we create an object of that class and
// pass the reference variable to two different methods. Now we calculate the area for two different objects and
// return them to the main method. Hence we get two different areas as output.
class Calculate_area_of_triangle_and_rectangle{
    double length,breadth;
    void input(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double Calculate_area_of_triangle(){
        return 1/2 *(breadth * length);
    }
    double Calculate_area_of_rectangle(){
        return length * breadth;
    }
}
public class Calculate_Area {
    public static void main(String[] args) {
        Calculate_area_of_triangle_and_rectangle c = new Calculate_area_of_triangle_and_rectangle();
        c.input(3,6);
        System.out.println("Area of triangle is : "+c.Calculate_area_of_triangle());
        System.out.println("Area of rectangle is : "+c.Calculate_area_of_rectangle());
    }
}
