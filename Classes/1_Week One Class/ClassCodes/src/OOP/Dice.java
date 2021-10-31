package OOP;

import java.util.Random;

public class Dice {
    private int faceValue;
    private String name = "Test";
    private String surname = "Test";


    public int roll() {
        Random random = new Random();
        // nextInt(6) => 0 ile 5 arasında değer verir o yüzden +1 ekliyoruz.
        this.faceValue = random.nextInt(6) + 1; 
        return this.faceValue;
    }

    // Encapsulation => faceValue değeri okunur ancak değiştirelemez. (get) keyword
    public int getFaceValue() {
        return this.faceValue;
    }
    // Encapsulation => (set) keyword. Aşağıdaki metot ile facevalue'ye değer verilebilir
    // ancak kuralları biz belirleriz. Yani faceValue = 7 olamaz
    public void setFaceValue(int faceValue){
        if(faceValue >= 1 && faceValue <= 6){
            this.faceValue = faceValue;
        }else{
            throw new IllegalArgumentException();
        }
    }
  
    public String getFirstName(){
        return this.name + " " + this.surname;
    }
}
