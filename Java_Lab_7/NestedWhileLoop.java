//nested while loop example printing a character in the shape of a pyramid

public class NestedWhileLoop {
    public static void main(String[] args){
        int row = 0;
        int col = 0;
        char hash = '#';

        while(row<5){
            col = 0;
            while(col<=row){// first loop 0,1/second 1/2 etc.
            System.out.print(hash);
            col++;
            }
            System.out.println(); 
        row++;
        } 
    }
}
