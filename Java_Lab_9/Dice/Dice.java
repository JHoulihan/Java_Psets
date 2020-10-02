

import java.util.Random;

public class Dice{
    //attriubutes
    int numOfSides;
    int faceValue;
    Random rn = new Random();
    //default construct
    public Dice(){
        numOfSides = 6;
        faceValue = rn.nextInt(numOfSides) + 1;
    }
       
    //general construct
    public Dice(int n_s, int f_v){
        numOfSides = n_s;
        faceValue = f_v;
    }


    public int getNumOfSides(){
        return numOfSides;
    }

    public int getFaceValue(){
        return faceValue;
    }

    public void setNumOfSides(int numOfSides){
        this.numOfSides = numOfSides;
    }

    public int rollDice(){
        faceValue = rn.nextInt(1) + numOfSides;
        return faceValue;
    }

}