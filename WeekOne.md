# İlk Hafta

Java'da Hello World yazılımı

Variable tanımı

Datatypes (Primative)  

Operators

Shortcut Assignment Operators

Scanner sınıfı ve input alma

Boolean data türleri

Karar mekanizmaları (if,else,switch)

Logical Operators (and or not exclusive to)

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
