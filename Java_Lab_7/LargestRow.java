/*
* A program that prompts the user to input an integer, this integer forms the number
* of columns and rows for a square 2D array. The user then populates the array. From this 
* input the program prints the largest row to the screen.
*/

import java.util.*;

public class LargestRow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matrix;

        System.out.println("Enter number: ");
        int row = sc.nextInt();
        int col = row;

        matrix = new int [row][col]; 

        //populating array with user input.
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.println("Enter number for each position("+i+","+j+") ");
                matrix[i][j]=sc.nextInt();
                }
            }

            sc.close();

        //visual representation of 2D array/notice print() on inside while println() on outside loop
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(); // gives desired shape
        }


        int currentSum = 0;
        int maxSum = 0;
        int location = 0;

        for(int i=0;i<matrix.length; i++){
            
            currentSum=0;
            for(int j=0; j<matrix[0].length; j++){
                currentSum += matrix[i][j];

                if(currentSum>maxSum){
                    maxSum = currentSum;
                    location = i+1;
                }
            }
        }

        System.out.println("Largest row = R"+location);
        
        }
}
