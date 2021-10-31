package poly;

public class TestPolymorphism {
    public static void main(String[] args) {
        // Circle sınıfı GeometricObject abstract sınıfından color ve filled nitelikleri aldı.
        // Kendisi de radius niteliğini ekledi.
        // GeometricObject sınıfında bulunan get... metotu kullanıldı ve ekrana circle'ın rengi yazıldı.
       GeometricObject geo = new Circle(5, "Red", true);
        System.out.println(geo.getColor());
        System.out.println("==================");
        // Rectangle
        GeometricObject geo2 = new Rectangle("White", false, 30, 10);
        System.out.println(geo2.getColor());
        System.out.println("===================");
        // Cyclinder
        GeometricObject geo3 = new Cyclinder(5, "pink", true, 2);
        System.out.println(geo3.isFilled());

    }
}
