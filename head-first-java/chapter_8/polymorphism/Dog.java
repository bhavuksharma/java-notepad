public class Dog extends Canine implements Pet{
    
    @Override
    public void makeNoise(){
        System.out.println("Dog makeNoise() impl");
    }

    @Override
    public void eat(){
        System.out.println("Dog eat() impl");
    }

    @Override
    public void beFriendly() {
        // TODO Auto-generated method stub
        System.out.println("Dog beFriendly() method impl");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Dog play() method impl");
    }
}
