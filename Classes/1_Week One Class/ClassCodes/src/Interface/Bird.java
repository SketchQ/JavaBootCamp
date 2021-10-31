package Interface;

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
