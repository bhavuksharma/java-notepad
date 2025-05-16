import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        // MyAnimalList list = new MyAnimalList();
        Cat c = new Cat();
        Dog d = new Dog();
        // list.add(c);
        // list.add(d);

        // // using equals() method
        // if (c.equals(d)) {
        //     System.out.println("ture");
        // }else{
        //     System.out.println("false");
        // }

        // // using getClass() method
        // System.out.println(c.getClass());

        // // using hashCode() method
        // System.out.println(c.hashCode());

        // // using toString() method
        // System.out.println(c.toString());

        // ArrayList<Dog> myDogsList = new ArrayList<Dog>();
        // Dog aDog = new Dog();
        // myDogsList.add(aDog);

        // Dog d1 = myDogsList.get(0);

        // ArrayList<Object> myObjectList = new ArrayList<Object>();
        // myObjectList.add(aDog);
        // Dog d2 = myObjectList.get(0); // it will not work

        Object object  = new Dog();
        if(object instanceof Dog){
            Dog dogObj = (Dog) object;
        }
    }
}
