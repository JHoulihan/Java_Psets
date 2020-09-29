//use a while loop to count how many times a number can be divided by two

public class HowMany {
    public static void main(String[] args) {
        int count1 = 1;
        int num1 = 40;
        while(num1>2){
            num1 = num1/2;
            count1++;
        }System.out.println(count1);
    }
}
