/*A program that will return the characters of a String from the even number indexes
* note that within the for loop the incrementation is i = i+2 
*/ 

import java.util.*;

public class printEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String even = new String(sc.nextLine());
        sc.close();

        for(int i = 0; i <= even.length()-1; i += 2){
            System.out.print(even.charAt(i));
        }
    }
}
