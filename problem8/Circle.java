package problem8;

public class Circle{
    double radius;
    
    Circle(){
        
    }

    Circle(double radius){
        this.radius = radius;
    }

    double area(double radius){
        double area;
        area = Math.PI * radius * radius;
        return area;
    }
    
}