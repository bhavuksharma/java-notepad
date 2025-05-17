class Animal{
    Animal(){
        System.out.println("making an Animal");
    }
}

class Hippo extends Animal{
    Hippo(){
        System.out.println("making a Hippo");
    }
}

public class TestHippo {
    public static void main(String[] args) {
        System.out.println("Starting....");
        Hippo h = new Hippo();
    }
}
