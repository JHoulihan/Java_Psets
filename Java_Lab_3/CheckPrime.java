/*Do while loop to check whether a positive integer number
is a prime number*/

public class CheckPrime {
    public static void main(String[] args) {
        int n = 153;
        int count=2;

        do{
            if(n == 2){
                System.out.println(n+" is a prime number");
                break;
            }
            if(n%count == 0){
                System.out.println(n+" is NOT a prime number");
                break;
            }
        count++;
        }while(count<=n-1);
        
        if(count==n){
            System.out.println(n+" is a prime number");
        }
    }
}
