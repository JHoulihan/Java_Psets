//A set of methods that carry out procedures on an inputted array


import java.util.Scanner;

public class VariousArrayTasks{

    public static void main(String[] args){

        int array [] = fillArray();
        System.out.println("Sum = " +sumArray(array));
        System.out.println("Average = " +avgArray(array));
        printArray(array);
    }

    public static int[] fillArray(){
        
        int [] array;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        array = new int[size];
        
        for(int i = 0; i<array.length;i++){
            System.out.println("Populate array: ");
            array[i] = sc.nextInt();
        }

        sc.close();
        return array;
    }

    public static int sumArray(int array[]){

        int sum = 0;
        
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static double avgArray(int array[]){
        
        double avg = 0;
        int sum = sumArray(array);
        avg = (double) sum/array.length; //changing the type is called casting, we are casting int sum to boolean to return a decimal result for the average

        return avg;
    } 

    public static void printArray(int[] array){
        
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        return;
    }


}