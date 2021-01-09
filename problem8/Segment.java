package problem8;

public class Segment extends Circle {
    double length;



    Segment(double radius,double length){
        super(radius);
        this.length = length;
    }

    double area(){
        double area= ((radius*radius)*((radius-length)/length)-(radius-length)*Math.pow((2*radius*length-(length*length)),0.5));
		return area;
    }
}
