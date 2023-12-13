package com.bridgelabz;
//4.  Java Program to Show the Nesting of Methods
//   Explanation: Enter length, breadth and height as input.
//   After that we first call the volume method. From the volume method we call the area method and
//   from the area method we call perimeter method. Hence we get the perimeter,
//   area and volume of the cuboid as output.
class Calculate_perimeter_area_and_volume_of_cuboid{
    double length,breadth,height,perimeter_of_cuboid,area_of_cuboid,volume_of_cuboid;
    void input(double length, double breadth, double height){
        this.length=length;
        this.breadth=breadth;
        this.height = height;
    }
    void volume(){
        volume_of_cuboid = length * breadth * height;
        area();
    }
    void area(){
        area_of_cuboid = 2 * ((length*breadth)+(breadth*height)+(height*length));
        perimeter();
    }
    void perimeter(){
        perimeter_of_cuboid = 4 * ( length + breadth + height);
        System.out.println("Volume of Cuboid is : "+volume_of_cuboid+
                "\nArea of Cuboid is : "+area_of_cuboid+
                "\nPerimeter of Cuboid is : "+perimeter_of_cuboid);
    }
}
public class Nesting_of_Methods {
    public static void main(String[] args) {
        Calculate_perimeter_area_and_volume_of_cuboid c = new Calculate_perimeter_area_and_volume_of_cuboid();
        c.input(2,3,4);
        c.volume();
    }
}
