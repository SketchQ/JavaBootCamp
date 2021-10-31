package OOP;

public class Circle {
    // public private protected
    public double   radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){
        this.radius = 1;
    }
    public double findArea(){
        return radius * radius * Math.PI;
    }
}
