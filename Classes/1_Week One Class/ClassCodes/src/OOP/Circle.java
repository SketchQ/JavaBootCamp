package OOP;

public class Circle {
    // public private protected
    public double   radius;
    public int radious;

    // int parametre alan constructor
    public Circle(int radious){
        this.radious = radious;
    }
    // double parametre alan constructor
    public Circle(double radius){
        this.radius = radius;
    }
    // Default constructor birim daire oluşturur.
    public Circle(){
        this.radius = 1;
    }
    public double findArea(){
        // Herhangi bir parametre almıyor çünkü sınıf içerisinde radious variable'ı bulunmakta.
        return this.radius * this.radius * Math.PI;
    }
}
