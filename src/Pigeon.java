public class Pigeon extends Bird implements AnimalBehavior, AnimalMove, AnimalName{

    private boolean isGrey;

    public Pigeon(String name, int age, float weight, boolean fly) {
        super(name, age, weight, fly);
    }

    public Pigeon(String name, boolean fly) {
        super(name, fly);
    }

    public Pigeon() {
        super("Pigi", 1, 0.25F, true);
        isGrey = false;
    }

    public boolean isGrey() {
        return isGrey;
    }

    public void setGrey(boolean grey) {
        isGrey = grey;
    }

    @Override
    public void Flying() {
        System.out.println("Pigeon is flying!!!");
    }

    @Override
    public void getVoice() {
        System.out.println("Crrrrrr! Crrrrr!");
    }

    public void name(){
        AnimalName.Name(getName());
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " - sleeping! Dont scream!");
    }

    @Override
    public void move() {
        System.out.println(getName() + "slide on stomach");
    }


}
