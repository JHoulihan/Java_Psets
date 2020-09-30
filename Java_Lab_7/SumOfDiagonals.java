/*
* A program that calculates the sum of diagonals of a square 2D array which 
* holds user inputted values.
*   
*   1 0 1
*   0 1 0       // the 1's here give a visual representation of the diagonal values of a square 2D array
*   1 0 1 
*
*/

import java.util.Scanner;

public class SumOfDiagonals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][]matrix;


        System.out.println("Enter size of array: ");
        int row = sc.nextInt();
        int col = row;

        matrix = new int [row][col];

        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.println("Enter value("+i+","+j+")");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        sc.close();

        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int sum1=0;
        int sum2=0;
        for(int i=0;i<matrix.length;i++){
            sum1 += matrix[i][i]; //starting at index 0,0 goes to 1,1 to 2,2 etc. forming the top left to bottom right sum
            sum2 += matrix[i][matrix.length-1-i];//going top right to bottom left (ex 0,5 to 1,4) 
        }
        System.out.println();
        System.out.println("Sum of diagonals = "+(sum1+sum2));

    }
}
