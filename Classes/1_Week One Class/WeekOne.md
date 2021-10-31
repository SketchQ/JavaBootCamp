# İlk Hafta

## Java'da Hello World yazılımı

```java
public class Main{
    public static void main(Strings[] args){
        System.out.println("Hello World!");
    }
}
```

## **Variable, DataTypes, Operators and Shortcut Operators**

```java
public class MainDataTypes {

    public static void main(String[] args) {
        /* Variable (Değişken) programda veri tutmamızı sağlayan birimdir. Memoryde bir alanda data tutmamızı sağlar.
         *
         * data = 5
         *
         * Sol taraf değişken adı, = atama operatörü ve 5 atanan veri
         *
         * Kuralları:
         * Harf,_ ve ya $ ile başlamalıdır.
         * Sayı ile başlayamaz!
         */
        int data = 5;
        int $data = 5;
        int _data = 5;
        int data1 = 5;


        byte b = 1; //-2^7 ile (2^7)-1 8 bit
        short s = 1; //-2^15 ile (2^15)-1 16 bit
        int i = 1; //-2^31 ile (2^31)-1 32 bit
        long l = 1; //-2^63 ile (2^63)-1 64 bit

        float f = 1.1f; //32 bit
        double d = 1.1; //64 bit

        boolean bool = true; //false
        char character = 'a';

        /* Değişken tanımlandıktan sonra herhangi bir zamanda değiştirilebilir
         * Eğer değişmemesini istiyorsak final ile sabit değişken tanımlamalıyız.
         */
        int x;
        x = 5;
        x = 7;

        // final keyword variable'in degitirelemez olmasini belirtir.

        final int y = 1;
        y=5; //hatalı olucak final keyworddan oturu

        /* Matematiksel Operatorler:
         * + Toplama
         * - Çıkarma
         * / Bölme
         * * Çarpma
         * % Mod
         */

        double fah, cel;
        fah = 300;
        cel = 5 / 9.0 * (fah - 32); // 9.0 kullanmamizin sebebi bolumde double sonuc alabilmek icin
        System.out.println(fah + " fahreheit is " + cel + " celsius");

        double tam = 5 / 2.0;

        System.out.println(tam);

        /* Shortcut Assignment Operators
         * +=
         * -=
         * *=
         * /=
         * %=
         * ++i
         * i++
         * --i
         * i--
         */

        int count = 0;
        count += 8;
        // once variable kullanip sonra artirilir yada vice versa
        System.out.println(++count); // bu 9 dur
        System.out.println(count++); // bu 8 dir

    }
}


```

### **Scanner sınıfı** ve input alma

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);

input.nextInt();
input.nextLine();
//etc...
```

## Karar mekanizmaları **(if,else,switch)** ve Logical Operators (and or not exclusive to)

```java
import java.util.Scanner;

public class MainIf {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Please fahrenheit: ");
        double f = in.nextDouble();

        double cel;
        cel = 5 / 9.0 * (f - 32);
        System.out.println(f + " fahreheit is " + cel + " celsius");
        System.out.println(f);

        /* Boolean Operators
         * <    less than
         * <=   less than or equal
         * >    greater than
         * >=   greater than or equal
         * ==   equal to
         * !=   not equal to
         */

        boolean bool = f < 300;
        System.out.println(bool);

        /* Karar Mekanizmaları
         * if
         * switch
         */

        
        if (bool) {
            System.out.println("300 den küçük");
        } else {
            System.out.println("300 e eşit ve ya büyük");
        }
        

        // Multiple if 

        if (f == 300) {
            System.out.println("300 e eşit");
        } else if (f > 300) {
            System.out.println("300 den büyük");
        } else {
            System.out.println("300 den küçük");
        }

        /* Logical Operations
         * !    not
         * &&   and
         * ||   or
         * ^    exclusive or
         */

        if (f >= 300 && f < 500) {
            System.out.println("300 ile 500 arasinda");
        } else if (f == 500 || f == 600) {
            System.out.println("500 yada 600");
        }
        // Kod buradan devam edecektir. Else kosulu yok
        System.out.println("Koşullar bitti");

        // Switch case

        Scanner in = new Scanner(System.in);
        System.out.println("Please age: ");
        int age = in.nextInt();

        // Switch case kullanirken break komutunu kullanmayi unutma!!

        switch (age) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            {
                System.out.println("Yaş 10 - 15");
                break;
            }
            case 15: {
                System.out.println("Yaş 15");
                break;
            }
            default: {
                System.out.println("Default");
            }

        }

        Scanner in = new Scanner(System.in);
        System.out.println("Please age: ");
        int x = in.nextInt();
        int y, z;
        char c;

        if (x >= 0) {
            y = 1;
        } else {
            y = -1;
        }

        System.out.println(y);

        // ? Statement can be used instead of if...
        // Same example as above

        z = (x >= 0) ? 1 : -1; //variable = (statement) ? true:false
        c = (x >= 0) ? 'b' : 'd'; //variable = (statement) ? true:false

        System.out.println("Z:" + z);
        System.out.println("C:" + c);
    }
}
/* Örnek yapalım
* Kullanıcıdan 2 sayı alalım çarpımları
* 10 - 100 arasıdaysa 5 puan
* 100 den büyükse 10
* bunların dışında 0 puan
*/
import java.util.Scanner;

public class WeekOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Lütfen ilk sayıyı Giriniz: ");
        x = input.nextInt();
        System.out.print("Lütfen ikinci Sayıyı Giriniz: ");
        y = input.nextInt();
        input.close();
        int z = (x * y);

        if (z >= 10 && z <= 100) {
            System.out.println("Result: " + z + " Puan: " + 5);
        } else if (z > 100) {
            System.out.println("Result: " + z + " Puan: " + 10);
        } else {
            System.out.println("Result: " + z + " Puan: " + 0);
        }
    }
}
```

## Loop ve Döngüler

```java
import java.util.Scanner;

public class MainLoop {
    public static void main(String[] args) {
        /* Döngüler (Loops)
         * while loop
         * do-while loop
         * for loop
         */

       int count = 0;

       while(count < 100){
           System.out.println("Count is : " + count++); // 100 dahile kadar sayar.
           System.out.println("Count is : " + count++); // 99 dahile kadar sayar.
       }
        while (count < 10) {
            System.out.println("Count: " + count);
           count+=2;
      }

        System.out.println("-----");
        
        // do - while dongusu

        count = 0;
        do {
            System.out.println("Count: " + count);
            count+=2;
        } while (count < 10);

        System.out.println("-----");

        // for dongusu

        for (int i = 0; i < 10; i+=2) {
            System.out.println("Count: " + i);
        }

        /* Örnek yapalım
         * Kullanıcıdan 2 sayı alalım çarpımları
         * 10 - 100 arasıdaysa 5 puan
         * 100 den büyükse 10
         * bunların dışında 0 puan
         * Kullanıcı -1 girerse bitirelim
         */

        Scanner in = new Scanner(System.in);

        int num1 = 0, num2 = 0, point = 0;
        while (num1 != -1 || num2 != -1) {
            System.out.println("Please Number 1: ");
            num1 = in.nextInt();
            System.out.println("Please Number 2: ");
            num2 = in.nextInt();

            int result = num1 * num2;

            if (result >= 10 && result <= 100) {
                point += 5;
                System.out.println("Result: " + result + " Puan:" + 5 + " Total Puan: " + point);
            } else if (result > 100) {
                point += 10;
                System.out.println("Result: " + result + " Puan:" + 10 + " Total Puan: " + point);
            } else {
                System.out.println("Result: " + result + " Puan:" + 0 + " Total Puan: " + point);
            }
        }

    }
}

```

## Strings

```java
import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        /* String */
        char c = 'a';
        String m;
        m = "Hello world";
        System.out.println(m);

        String n, p;
        int x = 10;
        n = "Hello" + " " + "World";
        p = n + x;

        System.out.println(n);
        System.out.println(p);

        Scanner in = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        String input = in.nextLine();


        System.out.println("Input: " + input);
        int num = Integer.parseInt(input);
        System.out.println(num);

        /* Örnek: Ekrana aşağıdaki şekli yazdıralım
         * + + +
         * + + +
         * + + +
         */

        int i, j;
        i = 1;
        while (i <= 3) {
            j = 1;
            while (j <= 3) {
                System.out.print("+ ");
                j++;
            }
            System.out.println();
            i++;
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

        String s1, s2, s3, s4;
        s1 = "Ali";
        s2 = new String("Welcome");
        s1 = new String("Veli");
        s3 = "Veli";
        s4 = "veli";


        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));

        s4 = s2 + s1;
        System.out.println(s4);

        s4 = s2.concat(s1);
        System.out.println(s4);

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }


        int num1=5;
        int num2=2;
        MainMethod.multiply(num1,num2);
        MainMethod mainMethod = new MainMethod();
        mainMethod.multiply2(num1,num2);
    }
}

```

## Arrays

```java
import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {


        int[] numbers = new int[3]; // [0][1][2]
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        double[] doubles = {1.0, 2.5};
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i] + " ");
        }

        System.out.println();
        for (double d : doubles) {
            System.out.print(d + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(doubles));

        for (double d :
                doubles) {
            System.out.println(d);
        }

        /*
         [1][2]  indices    0 1 2
                          0 [1][2][3]
         [3][4]           1 [4][5][6]
                          0x1 [0,0]
                          0x2 [0,1]
                          0x3 [0,2]
                          0x4 [1,0]
                          0x5 [1,1]
                          0x6 [1,2]
         */

        int[][] matrice = new int[2][3];
        matrice[0][0] = 1;
        matrice[0][1] = 2;
        matrice[0][2] = 3;
        matrice[1][0] = 4;
        matrice[1][1] = 5;
        matrice[1][2] = 6;

        matrice = new int[3][3];

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

    }
}
```

## Dates, Local Dates, ZonedDateTime

```java
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class MainDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);


        /* Java 8 */
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate specialDate = LocalDate.of(2021, 12, 30);
        System.out.println(specialDate);
        LocalDate plusDays = specialDate.plusDays(2);
        System.out.println(plusDays);

        /* LocalTime */
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime specialTime = LocalTime.of(22, 30);
        System.out.println(specialTime);

        System.out.println(localTime.isAfter(specialTime));
        LocalTime plusTime = specialTime.plus(1, ChronoUnit.HOURS);
        System.out.println(plusTime);
        System.out.println(specialTime);

        /* LocalDateTime */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime specialDateTime = LocalDateTime.of(specialDate, specialTime);
        System.out.println(specialDateTime);

        /* ZonedDateTime */
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZoneId zoneId = ZoneId.of("Europe/Istanbul");
        ZonedDateTime dateTime = ZonedDateTime.of(2021, 9, 21, 12, 30, 20, 11, zoneId);
        ZonedDateTime specialZonedDateTime = ZonedDateTime.of(specialDateTime, zoneId);
        System.out.println(specialZonedDateTime);



        /* Period */
        long between = ChronoUnit.DAYS.between(localDateTime, specialDateTime);
        System.out.println(between);

        LocalDate initial = LocalDate.now();
        System.out.println(initial);
        System.out.println(initial.plus(Period.ofDays(5)));
    }
}
```

## Methods

```java
package com.kodluyoruz;

public class MainMethod {
    public static void main(String[] args) {
        /* Method (function)
         * Method is a collection of statements that are grouped together to perform operation
         *
         * System.out.println(...)
         * Integer.parseInt(...)
         *
         * syntax:
         * modifier returnValueType methodName(listOfParameters)
         */
        int num1 = 5;
        int num2 = 2;

        multiply(num1, num2);


        int num3 = 3;
        int num4 = 6;

        multiply(num3, num4);

        /*
         * Methodlar bir değer geri dönebilirler. ReturnValueType döndüğü verinin tipini niteler.
         * Eğer method bir veri dönmeyecekse ReturnValueType void olmalıdır.
         * Method ismi ve parametreleri methodun imzasını oluşturur (Method Signature)
         * Method dönmek istediği veriyi return ifadesi ile dönebilir.
         * return ifadesinin altında yazılan kodlar çalışmaz method orada sonlanır
         * Her parametre kendi data tipini belirtmelidir
         */

        double dNum1 = 5.0;
        double dNum2 = 2.0;
        double resultDivision = division(dNum1, dNum2);
        System.out.println(resultDivision);

        /* Method Overloading
         * Aynı ismi taşıyan ama farklı parametre alan methodlara denir
         * Java compiler method imzasına göre hangisini kullanacağına karar verir.
         */

        multiply(dNum1,dNum2);

    }

    public static void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }
    public static void multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println(result);
    }

    public static double division(double d1, double d2) {
        return d1 / d2;
    }

    public void multiply2(int num1,int num2){
        int result = num1 * num2;
        System.out.println(result);
    }


}

```

## Object Orianted programming (OOP)

```java
public class WeekOne {
    public static void main(String[] args) {
        Circle circle = new Circle(radius = 1); // default constructor

        System.out.println(circle.findArea());

    }
}
```

* Sınıfın Tanımı(Circle)

```java
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
```

* Abstraction

```java
public class Dice{
    int faceValue;

    public introll(){
        Random random = new Random();
        faceValue = random.nextInt(bound:6) + 1; // 0 - 5 arasında çalışır +1 ile 1 - 6 arasına ulaşabiliyoruz.
        return faceValue
    }
}

// Using Dice

Dice dice = new Dice();
System.out.println(dice.roll());
```

* Encapsulation

```java
public class Dice{
    private int faceValue;

    public introll(){
        Random random = new Random();
        faceValue = random.nextInt(bound:6) + 1; // 0 - 5 arasında çalışır +1 ile 1 - 6 arasına ulaşabiliyoruz.
        return faceValue
    }
    public int getFaceValue(){
        return faceValue;
    }

    public void setFaceValue(int faceValue){
        if(faceValue >= 0 && faceValue <= 6){
            this.faceValue = faceValue;
            return;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
```

```java
Dice dice = new Dice();
dice.roll();

dice.faceValue = 6;
System.out.println(getFaceValue);
```

* Inheritance

Silindir Sınıfı

```java
public class Cyclinder extends Circle {
    private double height;

    public Cyclinder(double height){
        super();
        this.height = height;
    }

    public Cyclinder(double radius , double height){
        super(radius);
        this.height = height;
    }

    public double findVolume(){
        return findArea() * height;
    }
}
```

```java
// Inheritance Cyclinder 
Cyclinder cyclinder = new Cylinder(1);
System.out.println(cyclinder.findVolume());
```

* Polymorphism

Soyut kavram olduğunu belirtmek için "abstract" keyword kullanılır.
"Abstract" sınıflardan obje çağırılamaz. Constructor kullanılsa bile.
Bu sınıf diğer sınıflara inherit etmesi için oluşturuluyor.

Abstract Sınıf örneği (GeometricObject)

```java
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
    
}
```

Yukardaki sınıf kağıt üzerinde doğru olsa bile bu sınıfı kullanarak nesne oluşturamayız.

```java
public class TestPolymorphism {
    public static void main(String[] args) {
        // Bu Kısım Hata Verir.
        GeometricObject geo = new GeometricObject() {
             
        };
            
        
    }
}
```

Bunun yerine yeni bir Circle sınıfı oluşturalım. Bu yeni sınıf abstract sınıfının color ve filled niteliklerini alsın

```java

public class Circle extends GeometricObject {
    // Nitelikler
    double radius;
    
    // Circle Constructor
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }
}
```

Yeni bir GeometricObject nesnesi oluşturmak için ise Circle sınıfını kullanmamız gerekir.

```java
public class TestPolymorphism {
    public static void main(String[] args) {
        // Circle sınıfı GeometricObject abstract sınıfından color ve filled nitelikleri aldı.
        // Kendisi de radius niteliğini ekledi.
        // GeometricObject sınıfında bulunan get... metotu kullanıldı ve ekrana circle'ın rengi yazıldı.
       GeometricObject geo = new Circle(5, "Red", true);
        System.out.println(geo.getColor());
    }
}

```

Rectange adında bir sınıf oluşturalım ve bu sınıftan GeometricObject sınıfına ait bir nesne oluşturalım.

```java
public class Rectangle extends GeometricObject {
    
    // Nitelikler
    private double width;
    private double height;


    // Constructor
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    // Getters and Setters

    public double getWidht(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

}
```

```java
public class TestPolymorphism {
    public static void main(String[] args) {
        // Rectangle
        GeometricObject geo2 = new Rectangle("White", false, 30, 10);
        System.out.println(geo2.getColor());
    }
}
```

* Abstract Metotlar

Abstract sınıfının içerisine abstract metot yazabiliriz.
Bu metotları o abstract sınıfını kullanan sınıflara ait nesneler kullanabilir.

```java
    // Abstract Metotlar
    // Abstract Metotlar zorunlu olarak override edilmesi gerekir.
    // bu metotu kullanabilmek için yazılan bu metotun bu abstract sınıfını inherit eden
    // diğer sınıflarda olmaası gerekmektedir.

    // Çevre
    public abstract double findArea();

    // Alan
    public abstract double findPerimeter();
    
```

Bu metotların Override metotları bahsi geçen sınıflarda olmak zorunda!

```java
public class Circle extends GeometricObject {
    // Nitelikler
    double radius;
    
    // Circle Constructor
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    // getter and Setter
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    // Override satırı okunabilinirliği artırır.    
    @Override
    public double findArea() {
    return this.radius * this.radius * Math.PI;
    }

    @Override
    public double findPerimeter() {
        return 2 * this.radius * Math.PI;
    }
}
```

Eğer bir sınıf inherit olarak başka bir sınıfı alıyorsa, o sınıfı inherit aldığı sınıf ile aynı metotta kullanabiliriz.
(Metot signature de belirtilmesi gerekir!!)

```java
    // 2 adet geometricObject kullanarak metotu çalıştırdık
        
        System.out.println(equalArea(geo, geo2));
        
        // 1 adet circle 1 adet geometricObject kullanarak da çalıştırabiliriz.
        // Circle inherits geometricObject

        Circle circle = new Circle(5, "white", false);
        System.out.println(equalArea(geo, circle));

    }
    // Alan karşılaştırma metotu
    private static boolean equalArea(GeometricObject geo1, GeometricObject geo2){
        return geo1.findArea() == geo2.findArea();
    }
```

Instanceof Keyword

```java
  private static void print(GeometricObject geo){
        System.out.println();
        System.out.println(geo.toString());
        System.out.println("The Area is " + geo.findArea());
        System.out.println("The perimeter is " + geo.findPerimeter());
        // instanceof keywordu ile eğer girilen sınıf silindir ise hacminide gösterebiliriz.
        if(geo instanceof Cyclinder){
            System.out.println("The Volume is " + ((Cyclinder)geo).findVolume());
        }
```

Yukarıdaki metotu çağıralım.

```java
 // Circle
        print(geo);
        // Cyclinder
        print(geo3);
```

Çıktısı :

```txt
poly.Circle@2a139a55
The Area is 78.53981633974483
The perimeter is 31.41592653589793

poly.Cyclinder@15db9742
The Area is 78.53981633974483
The perimeter is 31.41592653589793
The Volume is 157.07963267948966
```

## Interface

Abstract class ile tam classın arasını doldurur.
Mesela kuş sınıfı oluşturalım.

```java
public abstract class Bird {
    private String name;
    private int age;

    //Constructor
    public Bird(String name,int age){
        this.name = name;
        this.age = age;
    }

    // getter and setters

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
```

Her kuş uçamaz ancak subclasslara bu özelliği eklememiz gerekebilir.
Burada bir önceki konuda gördüğümüz gibi abstract metot yazarsak her subclassa bu metotu eklememiz gerekir.
Bunun yerine CanFly adında bir interface oluşturup, uçabilen subclasslara bu özelliğie(metotu) ekleyebiliriz.

CanFly interface'i

```java
// abstract metotlar yazmamızı sağlar, Interfacedeki her metot abstracttır.
public interface canFly {
    void fly();
}

```

Oluşturduğumuz Parrot classına yukardaki interface'i ekleyelim.
"implements" keywordune dikkat

```java
public class Parrot extends Bird implements canFly{
    // nitelik
    

    // constructor
    public Parrot(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "\t:" + "Uçabiliyorum.");
        
    }

}

```

Uçamayan bir subclass oluşturalım

```java
public class Penguin extends Bird{
    // nitelik

    // Constructor
    public Penguin(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }
    
}
```

Görüldüğü gibi interface eklemedik ve abstract metot herhangi bir hata vermedi.

## Static keyword

Static keywordu ile bir sınıftaki metotlar bütün nesnelere uygulanır.
Circle Sınıfı oluşturalım

```java
public class Circle {
    // Nitelikler
    private double radius;
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
```

İçerisindeki getCount() static metodunu çalıştırmak için direk sınıf ismini kullanmamız gerekir.

```java
        Circle circle = new Circle(1);
        System.out.println(circle.getCount1());
        // Aşağıdaki Sınıf, nesne değil
        System.out.println(Circle.getCount());
        System.out.println("==============");
        Circle c2 = new Circle(1);
        System.out.println(c2.getCount1());
        System.out.println( "Circle 1 Count \t:" + circle.getCount1());
        // Aynı şekilde bu bir sınıf
        System.out.println(Circle.getCount());
        System.out.println("===============");
```

Matematiksel işlemler için static kelimesi

```java
public class MathmeticalOperations {
    
    
    // static keyword nesne oluşturmaya gerek kalmadan bu metotu kullanmamızı sağlar.
    public static int addition(int n1,int n2){
      return n1 + n2;  
    }

}
```

Yukarıdaki metotu çağırmak için illa nesne oluşturmamıza gerek yok.(çünkü static)

```java
    // Mathmetical operations ve static
        // metot static olduğu için nesne oluşturmaya gerek yok.
        //Aşağıdaki metot doğru değil!.
        MathmeticalOperations m1 =  new MathmeticalOperations();
        System.out.println(m1.addition(5, 2));
        
        // daha Doğrusu
        System.out.println(MathmeticalOperations.addition(5, 2));
```

## Reference
