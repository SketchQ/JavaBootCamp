package test_static;

public class Circle {
    // Nitelikler
    private static double radius;
    private static int count;

    // Constructor
    // count her nesne üretiminde artar. Bütün subclasslar içinde artar.
    public Circle(double radius){
        this.radius = radius;
        count++;
    }

    // Getters
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    // Static demek bütün nesnelerimizde çalışıyor demek
    // With static
    public static int getCount(){
        return count;
    }
    // without static
    public int getCount1(){
        return count;
    }
}
