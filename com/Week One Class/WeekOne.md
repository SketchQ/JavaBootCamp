# İlk Hafta

* Java'da Hello World yazılımı

```java
public class Main{
    public static void main(Strings[] args){
        System.outprintln("Hello World!");
    }
}
```

* **Variable, DataTypes, Operators and Shortcut Operators**

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

        final int y = 1;
        //        y=5; //hatalı

        /* Matematiksel Operatorler:
         * + Toplama
         * - Çıkarma
         * / Bölme
         * * Çarpma
         * % Mod
         */

        double fah, cel;
        fah = 300;
        cel = 5 / 9.0 * (fah - 32);
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

        System.out.println(++count);
        System.out.println(count++);

    }
}


```

* **Scanner sınıfı** ve input alma

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);

input.nextInt();
input.nextLine();
//etc...
```

* Karar mekanizmaları **(if,else,switch)** ve Logical Operators (and or not exclusive to)

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
            System.out.println("300<=f<500");
        } else if (f == 500 || f == 600) {
            System.out.println("500 yada 600");
        }
        System.out.println("Koşullar bitti");


        Scanner in = new Scanner(System.in);
        System.out.println("Please age: ");
        int age = in.nextInt();

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

        z = (x >= 0) ? 1 : -1; //variable = (statement) ? true:false
        c = (x >= 0) ? 'b' : 'd'; //variable = (statement) ? true:false

        System.out.println("Z:" + z);
        System.out.println("C:" + c);

        Scanner in = new Scanner(System.in);
        System.out.println("Please age: ");
        int x = in.nextInt();

        /* Örnek yapalım
         * Kullanıcıdan 2 sayı alalım çarpımları
         * 10 - 100 arasıdaysa 5 puan
         * 100 den büyükse 10
         * bunların dışında 0 puan
         */
    }
}
```

## Örnek

```java
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

Loop ve Döngüler

```java
import java.util.Scanner;

public class WeekOne {
    public static void main(String[] args) {
        int x = 0, y = 0, point = 0;
        Scanner input = new Scanner(System.in);
        while (x != -1 || y != -1) {

            System.out.print("Lütfen ilk sayıyı Giriniz: ");
            x = input.nextInt();
            System.out.print("Lütfen ikinci Sayıyı Giriniz: ");
            y = input.nextInt();
            input.close();

            int z = (x * y);

            if (z >= 10 && z <= 100) {
                point += 5;
                System.out.println("Result: " + z + " Puan: " + point);
            } else if (z > 100) {
                point += 10;
                System.out.println("Result: " + z + " Puan: " + point);
            } else {
                System.out.println("Result: " + z + " Puan: " + point);
            }
        }
    }
}
```

Strings

Arrays

```java
int[] numbers = new int[3]; // [0][1][2]
numbers[0] = 1;
numbers[1] = 2;
numbers[3] = 3;

for(int i = 0; i < numbers.lenght; i++){
    System.out.println(numbers[i] + " " );
}

double[] doubles= {1.0,2.5};

for(double d : doubles){ // For Each loop
    System.out.print(d + " " );
}
// Aşağıdaki gibi arrays itemlar yazılabilir.
System.out.println(Arrays.toString(doubles));

```

Matriks (2 boyutlu listeler)

```java
int[][] matrice = new int[2][3];
matrice[0][0] = 1;
matrice[0][1] = 2;
matrice[0][2] = 3;
matrice[1][0] = 4;
matrice[1][1] = 5;
matrice[1][2] = 6;

for(int i = 0; i < matrice.lenght ; i++){
    for(int j = 0; j < matrice.length ; j++){
        System.out.print(matrice[i][j] + " " );
    }
    System.out.println();
}
```

Dates

* Local Date-Time-Datetime

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class WeekOne {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        // Java 8
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate specialDate = LocalDate.of(2021, 12,12);
        System.out.println(specialDate);
        LocalDate plusDays = specialDate.plusDays(-2);
        System.out.println(plusDays);
        System.out.println(specialDate); 

        // Local Time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime specialTime = LocalTime.of(22, 30);
        System.out.println(specialTime);

        System.out.println(localTime.isAfter(specialTime));
        LocalTime plusTime =  specialTime.plus(1, ChronoUnit.HOURS);
        System.out.println(plusTime);
        System.out.println(specialTime);

        //Local DateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
```

* ZonedDateTime

```java
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class WeekOne {
    public static void main(String[] args) {
        //Zone Date Time
        ZonedDateTime zoneDateTime = ZonedDateTime.now();
        System.out.println(zoneDateTime);

        ZoneId zoneID = ZoneId.of("Europe / Istanbul");
        ZonedDateTime specialZonedDateTime = ZonedDateTime.of(specialDateTime, ZoneId);
        System.out.println(specialZonedDateTime);

    }
}
```

Methods

Object Orianted programming (OOP)

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
