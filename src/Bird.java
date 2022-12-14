public class Bird extends Animal  {
    protected boolean fly;

    public Bird(String name, int age, float weight, boolean fly) {
        super(name, age, weight);
        this.fly = fly;
    }

    public Bird(String name, boolean fly) {
        super(name);
        this.fly = fly;
    }

    public Bird() {
        super("Pasha", 2, 0.3F);
        fly = true;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public void Flying() {
        System.out.println("Bird is flying, lol!");
    }

    @Override
    public void getVoice() {
        System.out.println("CR! CR! CR! Crrr!");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating worms!!!");
    }
}
