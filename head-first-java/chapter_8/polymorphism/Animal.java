public abstract class Animal{
    String picture;
    String food;
    String hunger;
    String boundaries;
    String location;

    public void makeNoise(){
        System.out.println("Animal class makeNoise()");
    }

    public void eat(){
        System.out.println("Animal class eat()");
    }

    public void sleep(){
        System.out.println("Animal class sleep()");
    }

    public void roam(){
        System.out.println("Animal class roam()");
    }
}