//finding the exponent of user inputted number via a method using recursion
//the first number represents the base, the second the power.

import java.util.*;

public class Exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: " );
        int num1 = sc.nextInt();
        System.out.println("Enter the power to: ");
        int num2 = sc.nextInt();
        sc.close();

        System.out.println(powerTo(num1, num2));
    }

    public static int powerTo(int x, int y){
        if(y==0) return 1;
        if(y == 1) return x;
        else return powerTo(x, y-1) * x;
    }
}
