/**
 * Palindromes
 * Program to determine if a String is a palindrome
 */
import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String("");
        s = sc.nextLine();
        String s1 = s.toLowerCase();
        String reverse = "";

        for(int i=s1.length()-1;i>=0;i--){
            reverse += s1.charAt(i);
        } if(reverse.equals(s1)){
            System.out.println(s+" is a palindrome");
        } else{
            System.out.println(s+" is NOT a palindrome");
        }
    }
}