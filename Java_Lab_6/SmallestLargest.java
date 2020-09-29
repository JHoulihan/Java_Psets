/*
* A program that prompts the user to select the 
* size of the array and then asks them to fill it.
* Then swaps the greatest int value with the smallest
* via a linear search.
*/

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter number "+(i+1)+":");
            array[i] = sc.nextInt();
        }

        sc.close();

        //array print pre-swap        
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();

        int bigNum = array[0];
        int smallNum = array[0];
        int bigPos = 0;
        int smallPos = 0;

        for(int i=0; i<size; i++){
            if(array[i]<smallNum){
                smallNum = array[i];
                smallPos = i;
            }
        }

        for(int i=1; i<size; i++){
            if(array[i]>bigNum){
                bigNum = array[i];
                bigPos = i;
            }
        }

        //swapping the highest int value with the last position
        //and the lowest with first position using temporary variables.
        int bigTemp = array[size-1];
        array[size-1] = array[bigPos];
        array[bigPos] = bigTemp;

        int smallTemp = array[0];
        array[0] = array[smallPos];
        array[smallPos] = smallTemp;

        //array post-swap
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
    }
}
