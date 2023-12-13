package com.bridgelabz;
//2. Java Program to Count Number of Objects Created for Class
//   Explanation:Whenever an object is made of a class, its constructor is invoked.
//   Whenever the constructor runs we increment the counter value.
//   Hence the number of objects created of a class equals the counter value.
public class Count_Number_of_Objects {
    static int count = 0;
    Count_Number_of_Objects(){
        count++;
    }

    public static void main(String[] args) {
        Count_Number_of_Objects o1 = new Count_Number_of_Objects();
        Count_Number_of_Objects o2 = new Count_Number_of_Objects();
        Count_Number_of_Objects o3 = new Count_Number_of_Objects();
        System.out.println("Total Objects Created : "+count);
    }
}
