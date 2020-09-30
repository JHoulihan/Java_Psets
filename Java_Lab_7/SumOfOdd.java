/*
* A program that prompts a user to determine the size of a 2D array, then fill it with integers. 
* The program then prints the total occurences of odd numbers and the sum of odd numbers to the screen.
*/
import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter number for each position("+i+","+j+") ");
                array[i][j]=scanner.nextInt();
            }
        }

        scanner.close();

        int sum = 0;
        int oddTotal = 0;

        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                if(array[i][j]%2!=0){
                    sum+=array[i][j];
                    oddTotal++;
                }
            }
        }

        System.out.println("Odd number total count = "+oddTotal);
        System.out.println("Sum of odd numbers = "+sum);
    }
}
