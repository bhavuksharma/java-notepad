public class ModelDuck extends Duck{
    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I am a Model Duck");
    }
}
