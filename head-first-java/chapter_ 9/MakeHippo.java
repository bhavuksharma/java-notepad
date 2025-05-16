// Example to test the need of constructor in abstract class

abstract class Animal{
    private String name;

    Animal(String theName){
        name = theName;
    }

    public String getName(){
        return name;
    }

}

class Hippo extends Animal{
    Hippo(String theName){
        super(theName);
    }

}

public class MakeHippo {
    public static void main(String[] args) {
        
        Hippo h = new Hippo("Buffy");
        System.out.println(h.getName());
    }
}
