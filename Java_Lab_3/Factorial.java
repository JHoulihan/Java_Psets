/**
 * Using a while loop find the factorial of a number.
 * 
 * Bonus recursive example of above problem.
 */
public class Factorial {

    public static void main(final String[] args) {

    System.out.println(getFact(7));
    
        final int n = 7;
        int factorial = 1;
        int count = 1;

        while(count <= n){
            
            factorial = factorial*count;
            count++;
        }
        System.out.println(factorial);
    }

    public static int getFact(final int n){
        if(n == 1)
        return n;
        else return n*getFact(n-1);
    }



}