package Kodluyoruz;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public double findArea(){
        return radius * radius * Math.PI;
    }
}
