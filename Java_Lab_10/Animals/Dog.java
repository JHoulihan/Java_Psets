public class Dog extends Animal{
    
    private int numDogBiscuitsEaten;
    
    public Dog(){
        super();
        numDogBiscuitsEaten = 0;
    }

    public Dog(String one, String two, int num){
        super(one,two);
        this.numDogBiscuitsEaten = num;
    }

    public int getBiscuitsEaten(){
        return this.numDogBiscuitsEaten;
    }

    public void eatDogBiscuit(){
        this.numDogBiscuitsEaten += 1;
    }
        
}