package OOP;

import java.util.Random;

public class Dice {
    private int faceValue;


    public int roll() {
        Random random = new Random();
        // nextInt(6) => 0 ile 5 arasında değer verir o yüzden +1 ekliyoruz.
        this.faceValue = random.nextInt(6) + 1; 
        return this.faceValue;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public void setFaceValue(int faceValue){
        if(faceValue >= 1 && faceValue <= 6){
            this.faceValue = faceValue;
        }else{
            throw new IllegalArgumentException();
        }
    }
  
}
