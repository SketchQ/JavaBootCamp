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
        // Elimizde geometricObject olduğu için Cyclinder sınıfdaki findVolume() metotunu göremeyiz.
        // findVolume() metotuna erişmek için; (Casing yapılır)
        double cyclinderVolume = ((Cyclinder)geo3).findVolume();
        System.out.println(cyclinderVolume);
        System.out.println("===================");
        // 2 adet geometricObject kullanarak metotu çalıştırdık
        
        System.out.println(equalArea(geo, geo2));
        
        // 1 adet circle 1 adet geometricObject kullanarak da çalıştırabiliriz.
        // Circle inherits geometricObject

        Circle circle = new Circle(5, "white", false);
        System.out.println(equalArea(geo, circle));
        System.out.println("=====================");
        // Circle
        print(geo);
        // Cyclinder
        print(geo3);


    }
    // Alan karşılaştırma metotu
    private static boolean equalArea(GeometricObject geo1, GeometricObject geo2){
        return geo1.findArea() == geo2.findArea();
    }

    private static void print(GeometricObject geo){
        System.out.println();
        System.out.println(geo.toString());
        System.out.println("The Area is " + geo.findArea());
        System.out.println("The perimeter is " + geo.findPerimeter());
        // instanceof keywordu ile eğer girilen sınıf silindir ise hacminide gösterebiliriz.
        if(geo instanceof Cyclinder){
            System.out.println("The Volume is " + ((Cyclinder)geo).findVolume());
        }
    }
}
