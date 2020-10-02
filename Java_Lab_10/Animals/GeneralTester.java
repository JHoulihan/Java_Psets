public class GeneralTester{
    public static void main(String[] args){
        Dog marv = new Dog();
        Tiger tony = new Tiger("ominvore", "purr");
        Horse bojack = new Horse("herbivore", "neigh", 40);

        marv.printDetails();
        marv.setAnimalSound("woof");
        marv.eatDogBiscuit();
        marv.printDetails();
        System.out.println(marv.getBiscuitsEaten());

        bojack.printDetails();
        bojack.setSpeed(48);
        System.out.println(bojack.getSpeed());

        tony.setAnimalDiet("carnivore");
        tony.printDetails();

    }
}