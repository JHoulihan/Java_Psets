//A boolean method to determine if a user inputted number is a prime number


import java.util.Scanner;

public class Primes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int n = sc.nextInt();
        isPrime(n);

        sc.close();
    }

    public static boolean isPrime(int num){
        
        int count = 2;

        do{
        
        if(num==2){

            System.out.println(num+ " is a prime");
            return true;

        } if(num%count==0){
            
            System.out.println(num+" is NOT a prime");
            return false;

        } count++;
        
        } while(count<=num-1);

        if(count == num){
            
            System.out.println(num+" is a prime");
            return true;
            
        }
        
        return true;

    } 
}
