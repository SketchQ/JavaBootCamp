package poly;


// Soyut kavram olduğunu belirtmek için "abstract" keyword kullanılır.
// "Abstract" sınıflardan obje çağırılamaz. Constructor kullanılsa bile.
// Bu sınıf diğer sınıflara inherit etmesi için oluşturuluyor.  
public abstract class GeometricObject { 
    private String color;
    private boolean filled;


    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public GeometricObject(){

    }
    // Getter ve Setter metotlar basit bir sınıf oluşturmamızı sağlar.
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    // Abstract Metotlar
    // Abstract Metotlar zorunlu olarak override edilmesi gerekir.
    // bu metotu kullanabilmek için yazılan bu metotun bu abstract sınıfını inherit eden
    // diğer sınıflarda olmaası gerekmektedir.

    // Çevre
    public abstract double findArea();

    // Alan
    public abstract double findPerimeter();
    
}
