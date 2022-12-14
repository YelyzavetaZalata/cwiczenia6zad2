public class Dog extends Mammal implements AnimalBehavior, AnimalMove, AnimalName{

    protected String Breed;

    public Dog(String name, int age, float weight, String colorWool, String breed) {
        super(name, age, weight, colorWool);
        Breed = breed;


    }

    public Dog() {
        super("Bobby", 12, 34.2F, "Red");
        setBreed("Pitbull");
    }

    public Dog(String name, int age, float weight, String colorWool) {
        super(name, age, weight, colorWool);
    }

    public String getBreed() {
        return Breed;

    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating meat!");
    }

    @Override
    public void getVoice() {
        System.out.println("Dog is barking...");
    }

    @Override
    public void drinkBeer() {
        System.out.println("I like sport, sorry.");
    }

    public void Poop() {
        System.out.println("I`m pooping. Please, close the door");
    }


    @Override
    public void sleep() {
        System.out.println(getName() + " - sleeping!");
    }

    @Override
    public void move() {
        System.out.println(getName() + "- run on four paws");
    }



}
