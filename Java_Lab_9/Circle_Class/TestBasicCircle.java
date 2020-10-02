import java.util.Scanner;

public class TestBasicCircle{

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    BasicCircle circOne = new BasicCircle();
    BasicCircle circTwo = new BasicCircle();
    BasicCircle circThree = new BasicCircle();

    System.out.println("Enter a number for the radius of your first circle: ");
    int r1 = sc.nextInt();
    circOne.setRadius(r1);
    System.out.println("Enter a number for the radius of your second circle: ");
    int r2 = sc.nextInt();
    circTwo.setRadius(r2);
    System.out.println("Enter a number for the radius of your third circle: ");
    int r3 = sc.nextInt();
    circThree.setRadius(r3);

    sc.close();

    System.out.println("Circle 1 has a radius of " +circOne.getRadius());
    System.out.println("Circle 2 has a radius of " +circTwo.getRadius());
    System.out.println("Circle 3 has a radius of " +circThree.getRadius());

    System.out.println();
     
    System.out.println("Circle 1 has a circumference of "+circOne.getCircumference());
    System.out.println("Circle 2 has a circumference of " +circTwo.getCircumference());
    System.out.println("Circle 3 has a circumference of "+circThree.getCircumference()); 

    System.out.println();

    System.out.println("Circle 1 has an area of " +circOne.getArea());
    System.out.println("Circle 2 has an area of " +circTwo.getArea());
    System.out.println("Circle 3 has an area of " +circThree.getArea());
   

}

}