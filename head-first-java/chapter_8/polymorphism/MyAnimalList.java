public class MyAnimalList {
    Animal[] animals = new Animal[5];
    int nextIndex = 0;

    public void add(Animal a){
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added at: " + nextIndex);
            nextIndex++;
        }
    }
}
