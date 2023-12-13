package com.bridgelabz;
//5. Java Program to Calculate Sum of Two Byte Values using Type Casting
//   Explanation: This is a Java Program to Calculate Sum of Two Byte Values Using Type Casting.
//   Type casting in Java is to cast one type, a class or interface, into another type i.e. another class or interface.
// Enter any two byte values as input. After that we first convert these two bytes into integers using type casting and
// then we add those values and get the desired output.
class Type_Casting{
    Byte value_1,value_2;
    int int_value_1,int_value_2;
    void input(Byte value_1,Byte value_2){
        this.value_1=value_1;
        this.value_2=value_2;
        Type_Caste();
    }
    void Type_Caste(){
        int_value_1 = value_1.intValue();
        int_value_2 = value_2.intValue();
        add();
    }
    void add(){
        System.out.println("Addition is : "+(int_value_1 + int_value_2));
    }
}
public class Calculate_Sum_of_Two_Bytes {
    public static void main(String[] args) {
        Type_Casting t = new Type_Casting();
        Byte a = 10;
        Byte b = 20;
        t.input(a,b);
    }
}
