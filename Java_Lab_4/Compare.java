/**
 * Compare
 * Program to check whether two string are equal or not
 */
import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String("");
        System.out.println("Enter a sentence: ");
        s = sc.nextLine();
        String caseNumb = s.toLowerCase();
        String s1 = new String("");
        System.out.println("Enter another sentence: ");
        s1 = sc.nextLine();
        String caseNumb1 = s.toLowerCase();

        if(s.equals(s1)){
            System.out.println("Exactly the same: True");
        } else{
            System.out.println("Exactly the same: False");
        }
        if(caseNumb.equals(caseNumb1)){
            System.out.println("Similar: True");
        } else {
            System.out.println("Similar: False");
        }
    }
    
}