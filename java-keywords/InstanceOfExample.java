class Shape{

}

class Circle extends Shape{
    public int radius(){
        return 5;
    }
}

class Square extends Shape{
    public int sideLength(){
        return 4;
    }
}

public class InstanceOfExample{

    public void process(Shape shape){
        if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            System.out.println("Circle with radius: " + circle.radius());
        }
        else if(shape instanceof Square square){
            System.out.println("Square with side length: " + square.sideLength());
        }
    }

    public static void main(String[] args){
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        InstanceOfExample example = new InstanceOfExample();
        example.process(shape1);
        example.process(shape2);

    }
}