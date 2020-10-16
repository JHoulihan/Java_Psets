/*
* A program that uses a static method. The method is a boolean that accepts two parameters. 
* A double array and a double number entered by the user. The program searchers
* the array and checks if the user double is in the array.
*/

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        double num[] = {254.98, 3.43, 43321.54};
        Scanner sc = new Scanner(System.in);
        double userInput = sc.nextDouble();
        findElement(num, userInput);

        sc.close();
    }

    public static boolean findElement(double array[], double input) {
        
        for(int i=0; i<array.length;) {
            System.out.println(array[i]+ " ");

            if(input == array[i]){
                System.out.println(input+" was found in the array");
                return true;
            } else{
                System.out.println(input+ " was NOT found in the array");
                return false;
            }
        }
        return true;
    }
}
