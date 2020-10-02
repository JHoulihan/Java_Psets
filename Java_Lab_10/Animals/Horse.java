public class Horse extends Animal{

    private double speed;

    public Horse(){
        super();
        speed = 35;
    }

    public Horse(String one, String two, double speed){
        super(one, two);
        this.speed = speed;
    }

    public double getSpeed(){
        return this.speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }
}
