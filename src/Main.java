import java.util.ArrayList;
import java.util.List;

public class Main extends Animal {
    public static void main(String[] args) {
        Blowfish nemo = new Blowfish("nemo", 31, 1.0f, true, true);
        Dog dog = new Dog();
        Pigeon pigeon = new Pigeon();
        List<AnimalBehavior> arrayList = new ArrayList<>();
        arrayList.add(nemo);
        arrayList.add(dog);
        arrayList.add(pigeon);
        List<AnimalMove> arrayList1 = new ArrayList<>();
        arrayList1.add(nemo);
        arrayList1.add(dog);
        arrayList1.add(pigeon);
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add(nemo.getName());
        arrayList2.add(dog.getName());
        arrayList2.add(pigeon.getName());


        for(AnimalBehavior animal: arrayList){
            animal.sleep();
        }

        for (AnimalMove animal: arrayList1) {
            animal.move();
        }
        for (String animal: arrayList2){
            AnimalName.Name(animal);
        }







        //System.out.println(nemo);
        /*System.out.println(mammal.getAge());
        System.out.println(mammal.getName());
        System.out.println(mammal.getWeight());
        System.out.println(mammal.getColorWool());*/



    }
}
