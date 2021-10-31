package Interface;

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
