/*
* A method that first checks if a number is prime
* then finds the next prime number that is a palindrome ex 101 is both prime and palindrome
*/

import java.util.Scanner;

public class PrimePalindrome{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("The next prime palindrome is " +isPrimePal(n));
        System.out.println(isPrime(n));

        sc.close();

    }

    static boolean isPrime(int num){
        if(num < 2 || num % 2 == 0) 
            return num == 2;
        for(int i = 3; i*i <= num; i+=2)
            if(num % i == 0) return false;
        return true;
    }

    static int isPrimePal(int N){
        if(8 <= N && N <= 11) 
            return 11;

        for(int x = 1; x < 100000; ++x) {

            String s = Integer.toString(x);
            StringBuffer buffer = new StringBuffer(s);
            buffer.reverse();

            int y = Integer.parseInt(s + 
            buffer.substring(1).toString());

            if(y >= N && isPrime(y) == true) 
            return y; 
        }
        return -1;
    }
}