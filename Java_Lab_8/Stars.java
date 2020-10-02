//A method that takes a user integer and prints a pyramid of stars.
//integer reperesents the nubmer of rows

import java.util.Scanner;

public class Stars{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        printStarTriangle(number);

        sc.close();
    }

    public static void printStarTriangle(int x){



        int row = 0;
        int col = 0;

        while(row<x){
            col = 0;
            while(col<row){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
            }
            return;
    
        }


}