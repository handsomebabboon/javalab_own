package problem8;

public class Sector extends Circle {
    double angle;

    Sector(double radius,double angle){
        super(radius);
        this.angle = angle;
        
    }
    double area(){
        double area = angle*radius*radius*0.5;
        return area;
    }
}
