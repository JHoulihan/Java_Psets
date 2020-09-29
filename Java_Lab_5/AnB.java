/* 
* A program that determines the number of a's and b's in a user inputted sentence
* using toLowerCase method in order to accept capital letters. If there are the same 
* number of a's and b's print match to the screen, otherwise print no match.
*/

import java.util.*;

public class AnB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String userInput = new String(sc.nextLine());
        sc.close();
        String s = userInput.toLowerCase();
        int numA = 0;
        int numB = 0;

        for(int i=0; i<=s.length()-1; i++){
            if(s.charAt(i) == 'a'){
                numA++;
            } if(s.charAt(i) == 'b'){
                numB++;
            }
        }
        if(numA == numB){
            System.out.println(numA+" a's and "+numB+" b's, Match!");
        } else{
            System.out.println(numA+" a's and "+numB+" b's, No match!");
        }
    }
}
