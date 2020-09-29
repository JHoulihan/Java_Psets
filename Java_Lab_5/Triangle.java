/*
* Take 3 doubles from the user. First, determine if these doubles 
* form a triangle, if so determine what type of triangle they form
*/

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first decimal number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second decimal number: ");
        double b = sc.nextDouble();
        System.out.println("Enter the third decimal number: ");
        double c = sc.nextDouble();

        sc.close();

        if(a+b>c && b+c>a && c+a>b){
            if(a!=b && b!=c && c!=a){
                System.out.println("The numbers entered form a scalene triangle.");
            } else if(a==b && b==c){
                System.out.println("The numbers entered form an equilateral triangle.");
            } else if(a==b || c==b || c==a){
                System.out.println("The numbers entered form an isosceles triangle.");
            } else{
                System.out.println("The numbers entered do not form a triangle.");
            }
        }
    }
}
