class Duck{
    private static Duck duck;

    private Duck(){}

    public static Duck getDuck(){
        if(duck == null){
            duck = new Duck();
        }
        return duck;
    }
}

public class TestSingleton {

    public static void main(String[] args) {
        Duck d1 = Duck.getDuck();
        Duck d2 = Duck.getDuck();

        System.out.println(d1 == d2);
    }
    

    
}
