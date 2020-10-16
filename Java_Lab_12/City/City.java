package City;

public class City {
    //attributes
    String name;
    double area;
    int pop;

    //default constructor
    public City(){
        name= "";
        area = 0;
        pop = 0;
    }

    //general constructor
    public City(String name, double area, int pop){
        this.name = name;
        this.area = area;
        this.pop = pop;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getArea(){
        return this.area;
    }

    public void setArea(double area){
        this.area = area;
    }

    public int getPop(){
        return this.pop;
    }

    public void setPop(int pop){
        this.pop = pop;
    }

    public String toString(){
        String details = "City Name: "+getName();
        details += "\nCity area: "+getArea();
        details += "\nCity pop: "+getPop();
        details += "\n************************";

        return details;
    }
}
