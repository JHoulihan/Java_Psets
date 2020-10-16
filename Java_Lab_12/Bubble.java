/**
 * Bubble
 * A program that takes a user filled array of length 15, using bubble sort to
 * put the value of each element in ascending order. 
 * 
 */

import java.util.*;

public class Bubble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[15];
        int temp = 0;

        for(int i=0; i<array.length;i++){
            System.out.println("Enter number "+(i+1)+": ");
            array[i] = sc.nextInt();
        }

        sc.close();

        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }

        for(int j=1; j<array.length; j++){
            
            for(int i=0; i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }

        }

            System.out.println();
            for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
            }
    }
}