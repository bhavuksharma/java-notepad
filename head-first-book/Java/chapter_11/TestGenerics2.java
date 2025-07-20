import java.util.List;

abstract class Animal{
    void eat(){
        System.out.println("animal eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking");
    }
}

class Cat extends Animal{
    void meow(){}
}

public class TestGenerics2 {
    public static void main(String[] args) {

        TestGenerics2 tg2 = new TestGenerics2();
        tg2.go();


    }

    public void go(){
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Dog> listDogs = takeAnimals(dogs);
        System.out.println(listDogs);
    }

    public static <T extends Animal> List<T> takeAnimals(List<T> animals){
        for(Animal a : animals){
            a.eat();
        }
        return animals;
    }
}
