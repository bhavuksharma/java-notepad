class ConstantInit{
    public static final int NUMBER;
    public static final int NUMBER2 =20;
    static int x;

    static{
        NUMBER = 10;
    }

    private ConstantInit(){}

    private static void check(){
        System.out.println("checking");
    }

    public void sum(){
        System.out.println(x);
        check();
    }
}

public class TestStaticFinal{

    public static void main(String[] args) {
        System.out.println(ConstantInit.NUMBER);
        System.out.println(ConstantInit.NUMBER2);

        // ConstantInit c = new ConstantInit();
    }
    
}
