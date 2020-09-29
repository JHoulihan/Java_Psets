/**
 * arraySwap
 * Create an array of size 5, prompt 
 * user to fill the array with integers
 * swap the first element with the last element of the array
 */
import java.util.Scanner;

public class ArraySwap {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int[] array = new int[5];

        //traverse array indexes. At each index prompt user to enter a value
        for(int i=0; i<array.length; i++){
            System.out.println("Enter digit "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        
        sc.close();

        //print pre-swap
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

        //create a temporary variable to store int while swapping
        int temp = 0;

        temp = array[0];
        array[0] = array[4];
        array[4] = temp;

        System.out.println();

        //print post-swap
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    
}