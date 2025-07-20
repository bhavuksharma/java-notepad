class Calc{
    public void square(Integer a){
        System.out.println(a*a);
    }
}

public class TestAutoboxing {

    public static void main(String[] args) {
        Calc c= new Calc();
        c.square(3);
        c.square(new Integer(7));
    }
    
   

}
