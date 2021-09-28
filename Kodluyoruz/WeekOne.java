package Kodluyoruz;

public class WeekOne {
    public static void main(String[] args) {
        Circle circle = new Circle(1); // default constructor
        System.out.println(circle.findArea());

        Cyclinder cyclinder = new Cyclinder(1);
        System.out.println(cyclinder.findVolume());

    }
}