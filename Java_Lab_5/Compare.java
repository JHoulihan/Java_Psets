/**
 * Compare
 * 
 * A program using if else statements to return which of two user inputted integers are greater 
 * or whether they are in fact equal
 * 
 */
import java.util.*;
public class Compare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number: ");
        int num2 = sc.nextInt();

        sc.close();

        if(num1>num2){
            System.out.println(num1>num2);
        }
         else if(num1<num2){
             System.out.println(num1<num2);
         } else if(num1 == num2){
            System.out.println(num1+ " = "+num2);
         }
    }
}