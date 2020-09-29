//print every number evenly divided by 7 between 7 and 70.
public class Sevens {
    public static void main(final String[] args) {
        for(int i = 10; i<70;i++){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}
