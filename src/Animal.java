abstract class Animal {
    public static boolean AnimalBehavior;

    public  String name;
    private int age;
    private float weight;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name=' " + name + '\'' +
                ", Age=' " + age + '\'' +
                ", Weight=' " + weight + '\'' +
                '}';
    }

    public void eat() {
        System.out.println("Animal is eating!");
    }

    public void getVoice() {
        System.out.println("");
    }
}
