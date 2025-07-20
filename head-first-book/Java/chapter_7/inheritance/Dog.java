public class Dog extends Canine{
    
    @Override
    public void makeNoise(){
        System.out.println("Dog makeNoise() impl");
    }

    @Override
    public void eat(){
        System.out.println("Dog eat() impl");
    }
}
