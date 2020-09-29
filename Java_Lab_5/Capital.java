//Take a user's sentence and capitalize the first letter of every word// 

import java.util.Scanner;

import jav.util.*;

public class Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lower case sentence: ");
        String s = sc.nextLine();
        String upperCaseLine = "";
        Scanner lineScan = new Scanner(s);
        
        while(lineScan.hasNext()){
            String word = lineScan.next();
            upperCaseLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upperCaseLine.trim());
        sc.close();
        lineScan.close();
    }
}
