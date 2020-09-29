/* A program that prompts the user to input ten decimal point numbers into an array. 
*  The program adds every number entered to the previous number entered and 
*  prints the calculation to the screen to 2 decimal places.
*/

import java.util.*;

public class AddElements {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final float[] array = new float[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a decimal point number: ");
            array[i] = scanner.nextFloat();
        }

        scanner.close();
        // index 0-9
        for (int i = 0; i < array.length - 1; i++) {
            final double result = (double) Math.round((array[i] + array[i + 1]) * 100) / 100;
            System.out.println(array[i + 1]+" + "+array[i]+" = "+ result);
        }
    }
}
