/*
* Using input provided by user (arrray size and element values)
* output the sum of all elements, the product and the element 
* that has the greatest value.
*/

import java.util.Scanner;

public class SumProduct {
    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);

        int[] array;
        int sum = 0;
        int product = 1;

        System.out.println("Enter array size: ");
        final int size = sc.nextInt();
        array = new int[size];
        int biggerNum = array[0];

        for(int i = 0; i<array.length;i++){
            System.out.println("Enter value: ");
            array[i] = sc.nextInt();
            sum += array[i];
            product *=array[i];

            if(array[i] > biggerNum){
                biggerNum = array[i];
            }
        }
        
        sc.close();
        
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
        System.out.println("Largest number: "+biggerNum);
    }
}
