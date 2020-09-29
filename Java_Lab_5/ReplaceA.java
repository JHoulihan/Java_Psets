/* A program that takes a user inputted sentence and replaces
*  every occurence of a with '@' unless there are
*  more than 3 occurences of a, then all a's will 
*  be replaced by '#'.
*/

import java.util.*;

public class ReplaceA {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        String sentenceChange = new String("");
        int count = 0;
        sc.close();

        for(int i=0; i<sentence.length()-1; i++){
            
            if(sentence.charAt(i) == 'a'){
                count++;
            } if(count > 3){
                sentenceChange = sentence.replace('a', '#');
            } else{
                sentenceChange = sentence.replace('a', '@');
            }

        }
        
        System.out.println(sentenceChange);
    }
}



