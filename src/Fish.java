public class Fish extends Animal{
    protected boolean eatMeat;

    public Fish(String name, int age, float weight, boolean eatMeat) {
        super(name, age, weight);
        this.eatMeat = eatMeat;
    }

    public Fish(String name, boolean eatMeat) {
        super(name);
        this.eatMeat = eatMeat;
    }

    public Fish() {
        super("Nemo", 2, 1F);
        setEatMeat(true);
    }

    public boolean isEatMeat() {
        return eatMeat;
    }

    public void setEatMeat(boolean eatMeat) {
        this.eatMeat = eatMeat;
    }

    @Override
    public void eat() {
        if (isEatMeat())
            System.out.println("I am eating right now!");
        else
            System.out.println("I am not eating!");
    }

    @Override
    public void getVoice() {
        System.out.println("O! o! o! O! o!");
    }

    public void Swim() {
        System.out.println("Fish is swimming!");
    }

}
