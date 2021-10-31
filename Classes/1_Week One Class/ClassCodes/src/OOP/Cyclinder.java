package OOP;


// Circle Sınıfından "Extends" keyword ile miras alınır
public class Cyclinder extends Circle {
    // extends keyword sadece bir sınıf ile çalışır.
    private double height;

    public Cyclinder(double height){
        // super() =>  Ana sınıfın niteliklerini alır. 
        // Aşağıdaki örnekte defaul circle() Constructor çağırır.
        super();
        this.height = height;
    }


    public Cyclinder(double radius, double height){
        // Circledan gelen yarıçap ve Silindirden gelen yükseklik
        super(radius);
        this.height = height;
    }

    // Circle sınıfındaki metotlar burayada geldi ancak burada yazılan metotlar circleda yok.
    // findVolume() metotu Cyclinder içerisinde var ancak Circle içerisinde yoktur.
    public double findVolume(){
        return findArea() * height;
    }
}
