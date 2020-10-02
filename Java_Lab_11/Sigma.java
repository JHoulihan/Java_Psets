/**
 * Sigma
 * Using recursion to find the sum of a users input (integer)
 */
import java.util.Scanner;

public class Sigma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(getSigma(n));
    }

    public static int getSigma(int num){
        if(num == 1) return num;
        else return getSigma(num-1) + num;
    }
}