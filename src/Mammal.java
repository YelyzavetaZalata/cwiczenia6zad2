public class Mammal extends Animal {
    public String getColorWool() {
        return colorWool;
    }

    public void setColorWool(String colorWool) {
        this.colorWool = colorWool;
    }

    protected String colorWool;

    public Mammal(String name, int age, float weight, String colorWool) {
        super(name, age, weight);
        this.colorWool = colorWool;
    }

    public Mammal(String name, int age, float weight) {
        super(name, age, weight);
    }

    public Mammal(String colorWool) {
        this.colorWool = colorWool;
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating meat!");
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal is screaming...");
    }

    public void drinkBeer() {
        System.out.println("I like thisssss!");
    }
}
