/**
 * BackwardsSentence
 * Reverse a sentence
 */
public class BackwardsSentence {
    public static void main(String[] args) {
        String sentence = new String("pay no attention to that man behind the curtain");

        for(int i=sentence.length()-1; i>=0; i--){
            if(sentence.charAt(i) == ' '){
                System.out.println(sentence.substring(i+1, sentence.length()));
                sentence = sentence.substring(0, i);
            } else if(i == 0) {
                System.out.print(sentence);
                sentence=" ";
            } 
        }
    }
    
}