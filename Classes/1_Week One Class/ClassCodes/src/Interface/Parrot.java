package Interface;

public class Parrot extends Bird implements canFly{
    // nitelik
    

    // constructor
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "\t:" + "Uçabiliyorum.");
        
    }

}
