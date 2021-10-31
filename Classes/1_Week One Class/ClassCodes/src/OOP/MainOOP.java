package OOP;

public class MainOOP {
    public static void main(String[] args) {
       /* OOP
         * Gerçek hayattaki nesneleri programa aktarmak için kullanabileceğimiz özellik
         * Örneğin matematikte bulunan daireyi koda aktarmak istersek;
         *  Dairenin onu niteleyen bir yarı çapı vardır
         *  Yarıçapa bağlı olarak bir çevresi vardır
         *  Alanı vardır
         *
         * Sınıflar birer taslak gibidir. Sınıftan üretilenler ise nesnelerdir.
         */


        Circle circle = new Circle(); //default constructor
        System.out.println(circle.findArea());
        Circle c1 = new Circle(5.0);
        System.out.println(c1.findArea());
        System.out.println("====================");

        /* OOP Konseptleri
         *
         * Abstraction (Soyutlama): Karmaşık işlemlerin işleyişini bilmeden çalışabilmesini sağlamaya yarıyor.
         * Örneğin Telefon içerisinde çalışma mekanizmasını bilmeden kullanabliriz
         *
         * Encapsulation (Kapsülleme): Sınıflarda tutulan verilerin dış müdahelelere karşı korunmasının sağlar
         *
         * Inheritence (Miras): Yeni sınıf yaratırken var olan sınıfın özelliklerini alabilmeyi sağlayan özellik.
         * Örneğin Köpek sınıfı yazarken Hayvanlar sınıfını miras alabiliriz oradaki özellikler köpekte de olacaktır.
         * 
         * Bir sınıf sadece bir sınıfı extend edebilir.
         *
         * Polymorphism (Çok biçimlilik): Programın içinde bir sınıfı nitelerken onu niteleyebilecek başka bir sınıf
         * ile gösterebilmektir.
         * Örneğin: Köpek aslında bir hayvandır Kedi de bir hayvandır. Hayvan diyerek hem köpeği hem de kediyi
         * niteleyebilirim
         */

        /* Abstraction Dice */
        
        Dice dice = new Dice();
        // roll() metotunun nasıl çalıştığını bilmiyoruz "Abstraction örneği"
        dice.roll();

        
        // Encapsulation
        
        // public int faceValue; olduğu için buradan faceValue'yü değiştirebilirim.
        // dice.faceValue = 7;
        // Private int faceValue; olduğu zaman ulaşılmaz ve hata verir.
        System.out.println(dice.getFaceValue());
        System.out.println("==================");
        
        
        // zar değerine 5 veriyoruz
        dice.setFaceValue(5);
        System.out.println(dice.getFaceValue());
        
        
        // zar değerine 6 dan büyük bir değer veriyoruz
        // dice.setFaceValue(9); // bu satır hata verir.
        //System.out.println(dice.getFaceValue()); // bu satırı alamayız.

        System.out.println(dice.getFirstName());
        System.out.println("===============");


        /* Inheritence
        
         * Silindir tabanları eşit iki daireden meydana gelen bir geometrik şekildir o zaman daire den yazdığımız
         * özellikleri miras alabilir
         */
        // Birim Silindir, yüksekliği 1 , yarıçap circle sınıfından geliyor.    
        Cyclinder cyclinder = new Cyclinder(1);
        System.out.println(cyclinder.findVolume());
        System.out.println("==============");
        // Silindirin yarıçapını ve yüksekliğini de biz belirtiyoruz.
        Cyclinder cyclinder2 = new Cyclinder(5, 5);
        System.out.println(cyclinder2.findVolume());

    }
}
