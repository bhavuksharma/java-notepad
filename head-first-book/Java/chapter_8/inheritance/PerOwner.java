public class PerOwner {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Cat cat = new Cat();

        vet.giveShot(dog);
        vet.giveShot(cat);
    }
}
