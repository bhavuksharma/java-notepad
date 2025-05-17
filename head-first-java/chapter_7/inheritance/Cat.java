public class Cat extends Feline{
    
    @Override
    public void makeNoise(){
        System.out.println("Cat makeNoise() impl");
    }

    @Override
    public void eat(){
        System.out.println("Cat eat() impl");
    }
}
