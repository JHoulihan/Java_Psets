/**
 * ReverseString
 * program that takes a string and reverses it.
 */
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String(sc.nextLine());

        for(int i=s.length()-1;i>=0;i--){
            char letter = s.charAt(i);
            System.out.print(letter);
        }
    }
    
}