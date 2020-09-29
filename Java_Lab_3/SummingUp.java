/*Write a java program that uses for loops to compute
The sum of all numbers divisible by 13 between 1 and 100 (inclusive).
The sum of all numbers squared between 1 and 100(inclusive).
*/

public class SummingUp {
    public static void main(final String[] args) {
        int sum = 0;
        int sumSquare = 0;

        for(int i = 1; i<=100; i++){
            if(i%13==0){
               sum += i; 
            }
        }
        for(int i=1;i<=100;i++){
            sumSquare += i*i;
        } 
            
        System.out.println(sum);
        System.out.println(sumSquare);
    }
}
