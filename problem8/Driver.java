package problem8;

import java.util.Scanner;
public class Driver {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius");
        double rad = sc.nextDouble();

        Circle c = new Circle(rad);

        System.out.println("The area of circle is: "+c.area(rad));

        System.out.println("Enter the lenght of the chord to find area of corresponding segment");
        double chord = sc.nextDouble();
        Segment seg = new Segment(rad,chord);
        System.out.println("The area of the segment is: "+seg.area(chord));

        
        System.out.println("Enter the angle of sector whose area is to be found");
        double ang = sc.nextDouble();
        Sector sect = new Sector(rad,ang);

        System.out.println("The area of the sector is: "+sect.area());

        sc.close();


    }
}
