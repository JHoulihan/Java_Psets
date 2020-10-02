/*
*Using recursion to reverse a user inputted string
*/
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String("");
        System.out.println("Enter a sentence: ");
        str = sc.nextLine();

        sc.close();

        System.out.println(getReverse(str));
    }

    public static String getReverse(String str){
        if(str.length() == 1) return str;
        else return getReverse(str.substring(1, str.length())) + str.charAt(0);
    }
}
