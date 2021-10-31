package Interface;

public class TestInterface {
    public static void main(String[] args) {
        // interface üğzerinde tutarsak sadece interface metotlarını kullanabiliriz.
        canFly flyingBirds = new Parrot("Cici Kuş", 10);
        flyingBirds.fly();
        // Parrot olarak tutarsak her niteliğe ve metota ulaşabiliriz.
        Parrot p1 = new Parrot("name", 7);
        p1.fly();
        System.out.println("===================");

        Bird b1 = new Penguin("Penguin", 10);
        Bird b2 = new Parrot("Parrot", 7);
        Bird b3 = new Parrot("Mahmut", 15);

        print(b1);
        print(b2);
        print(b3);
    }

    private static void print(Bird bird){
        System.out.println("========================");
        System.out.println( "Adı \t: " + bird.getName());
        System.out.println("Yaşı \t: " + bird.getAge());
        if(bird instanceof canFly){
            canFly flyBird = (canFly) bird;
            flyBird.fly();
        }
    }
}
