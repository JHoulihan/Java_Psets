/**
 * Vowels
 * Using recursion to count the number of vowels in a given sentence
 */

 import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();

        sc.close();

        System.out.println(vowelCount(s));
    }

    public static int vowelCount(String s){
        s = s.toLowerCase();
        int count = 0;
        char c;

        if(s.length() < 1) return 0;
        else 
            c =s.charAt(0);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
            return count+vowelCount(s.substring(1));
    }
    
}
