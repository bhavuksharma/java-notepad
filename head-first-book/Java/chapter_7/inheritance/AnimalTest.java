public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Hippo();
        animals[3] = new Lion();
        animals[4] = new Tiger();

        for(Animal animal: animals){
            animal.eat();
            animal.roam();
        }
    }
}
