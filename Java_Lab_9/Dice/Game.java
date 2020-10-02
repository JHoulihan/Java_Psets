public class Game {
    public static void main(String[] args){
        Dice d1 = new Dice();
        Dice d2 = new Dice(6, 4);

        System.out.println(d2.getNumOfSides());

        System.out.println(d2.getFaceValue());

        d1.setNumOfSides(4);
        
        System.out.println(d1.getNumOfSides());

        System.out.println(d2.rollDice());
    }
}
