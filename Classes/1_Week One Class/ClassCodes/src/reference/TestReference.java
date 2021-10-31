package reference;

public class TestReference {
    public static void main(String[] args) {
       int n1 = 5;
       int n2 = 3;


       // Değerler değişmedi
       swap(n1, n2);
       System.out.println(n1);
       System.out.println(n2); 
       
       System.out.println("================");

       // Matematical nesne oluşturma
       // Bu şekilde swap metotu çalıştı
       // Call by Referance
       Matematical m1 = new Matematical( 5, 3);
       swap(m1);
       System.out.println(m1.n1);
       System.out.println(m1.n2);
    }

    // call by value yapıldığı için metot içerisindeki sayılar(parametreler) değişmeyecektir.
    public static void swap(int n1,int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swap(Matematical m1){
        int temp = m1.n1;
        m1.n1 = m1.n2;
        m1.n2 = temp;
    }
}
