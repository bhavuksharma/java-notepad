// code to test constructors (no-args and args)

class Duck{
    // // old version
    // public Duck(){
    //     System.out.println("Quack");
    // }

    // new version
    int size;
    public Duck(int newSize){
        System.out.println("Quack");

        size = newSize;

        System.out.println("the size of the duck is: "+ size);
    }
}

class Duck2{
    int size;

    public Duck2(){
        size = 27;
    }

    public Duck2(int newSize){
        size = newSize;
    }
}

public class UseDuck{
    public static void main(String[] args) {
        // Duck d = new Duck(); // old version

        Duck d = new Duck(32);
        Duck2 d2 = new Duck2();
    }
}