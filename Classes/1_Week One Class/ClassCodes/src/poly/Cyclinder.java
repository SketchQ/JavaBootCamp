package poly;

// Multi - Inheritance
public class Cyclinder extends Circle  {
    // Nitelik
    private double height;

    // Constructor
    public Cyclinder(double radius, String color, boolean filled,double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double findVolume(){
        return findArea() * this.height;
    }
    
}
