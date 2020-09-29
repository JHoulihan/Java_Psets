/*
* A program that creates an array of size 10 and puts in the first 10 even numbers greater 
* than a given user input. The user then is repeatedly prompted to enter a number and the 
* program prints out the array value at that position to the screen. If an invalid entry is 
* entered an appropriate message is printed to the screen. The program stops the user from
* inputting an element position when they enter -1 as the position in the array they want printed.
*/

import java.util.*;

public class EvenArrays {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] array = new int[10];

        System.out.println("Enter a whole number: ");
        int input = scanner.nextInt();
        input++;

        int count = 0;

        while (count < 10) {

            if (input % 2 == 0) {
                array[count] = input;
                count++;
            }

            input++;

        }

        while (true) {

            System.out.println("Enter a position in the array:");
            final int location = scanner.nextInt();
            
           if(location == -1){
               break;
           }
           if(location < 10 && location >=0){
               System.out.println("Position "+location+": "+array[location]);
           }
           else{
               System.out.println("Position "+location+": No such index!");
           }
        }
        scanner.close();
    }
}
