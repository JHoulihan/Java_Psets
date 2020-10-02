public class BasicCircle{

    //attribute
    int radius;

    //default constructor
    public BasicCircle(){
        radius = 1;
    }
    //general constructor  
    public BasicCircle(int r){
        radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getCircumference(){
        double circumference = 2*Math.PI*radius;
        circumference = Math.round(circumference*100.0) / 100.0;
        return circumference;
    }

    public double getArea(){

        double area = Math.PI*(radius*radius);
        area = Math.round(area * 100.0) / 100.0;
        return area;
    }
}