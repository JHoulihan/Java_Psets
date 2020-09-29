/*
* Program which will print to the screen the largest "clump" that appears in an array. 
* A "clump" in an array is a sequence of 2 or more adjacent elements with the same value. 
* The size of the array is decided by user input and the elements are also decided by user input.
*/

import java.util.Scanner;

public class Clumps {
    public static void main(final String[] args) {

        int[] array;

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        final int size = scanner.nextInt();
        array = new int[size];

        for(int i=0; i<array.length;i++){
            System.out.println("Populate the array: ");
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int clump=1;
        int clump_size=1;

        for(int i=0;i <array.length-1;i++){
            if(array[i]==array[i+1]){
                clump_size++;
            }
            else{
                clump_size=1; //clump_size reset in order to compare the next possible biggest clump with current clump
            }
            if(clump_size>clump){
                clump=clump_size;
            }
        }
            System.out.println("Biggest Clump Size: "+clump); 

            //ternary method
            //clump_size = (array[i]==array[i+1]) ? clump_size+1 : 1;
            //if(clump_size>clump) clump = clump_size;
    }
}
