import java.util.ArrayList;
import java.util.List;

class Animal {
    void speak(){
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal{
    void braks(){
        System.out.println("Dog barks");
    }
}
public class PECSPractice {

    public void printAnimals(List<? extends Animal> animalsList){
        for(Animal animal : animalsList){
            System.out.println("Animal: ");
            animal.speak();
        }
    }

    public void addDogs(List<? super Dog> dogList){
        dogList.add(new Dog());
    }

    public <T extends Number> void copyList(List<? extends T> src, List<? super T> dest){
        for(T item : src){
            dest.add(item);
        }
    }

    public static void main(String[] args){

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Animal());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        PECSPractice pecsPractice = new PECSPractice();
        pecsPractice.printAnimals(animals);
        pecsPractice.addDogs(dogs);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Integer> changedNumbers = new ArrayList<>();

        pecsPractice.copyList(numbers, changedNumbers);

    }
}
