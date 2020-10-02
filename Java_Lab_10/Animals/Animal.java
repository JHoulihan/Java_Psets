public class Animal{

    private String animalDiet;
    private String animalSound;

    public Animal(){
        animalDiet = "undefined";
        animalSound = "undefined";
    }

    public Animal(String diet, String sound){
        this.animalDiet = diet;
        this.animalSound =sound;
    }

    public String getAnimalDiet(){
        return this.animalDiet;
    }

    public void setAnimalDiet(String diet){
        this.animalDiet = diet;
    }

    public String getAnimalSound(String sound){
        return this.animalSound;
    }

    public void setAnimalSound(String sound){
        this.animalSound = sound;
    }

    public void printDetails(){
        System.out.println("Diet: "+this.animalDiet);
        System.out.println("Animal Sound: "+this.animalSound);
    }
}
