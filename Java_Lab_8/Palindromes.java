//Creating a a boolean method to determine whether a user sentence is a palindrome


import java.util.Scanner;

public class Palindromes{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String pal = sc.nextLine();
        isPalindrome(pal);

        sc.close();
    }
    
    public static boolean isPalindrome(String pal){


        String s1 = pal.toLowerCase(); 
        String reverse = new String("");

        boolean b;

        for(int i = s1.length()-1; i>=0; i--){
            reverse += s1.charAt(i);
        } 
        
        if(reverse.equals(s1)){
            System.out.println(pal.toUpperCase()+ " is a palindrome");
            b = true;
        } else{
            System.out.println(pal.toUpperCase()+ " is NOT a palindrome");
            b = false;
        }
         return b;
    }
}