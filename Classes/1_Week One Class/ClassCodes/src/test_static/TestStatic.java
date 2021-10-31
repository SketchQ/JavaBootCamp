package test_static;

public class TestStatic {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.getCount1());
        System.out.println(Circle.getCount());
        System.out.println("==============");
        Circle c2 = new Circle(1);
        System.out.println(c2.getCount1());
        System.out.println( "Circle 1 Count \t:" + circle.getCount1());
        System.out.println(Circle.getCount());
        System.out.println("===============");

        // Mathmetical operations ve static
        // metot static olduğu için nesne oluşturmaya gerek yok.
        //Aşağıdaki metot doğru değil!.
        MathmeticalOperations m1 =  new MathmeticalOperations();
        System.out.println(m1.addition(5, 2));
        
        // daha Doğrusu
        System.out.println(MathmeticalOperations.addition(5, 2));

        circle.setRadius(2);
        System.out.println(c2.getRadius());
    }
}
