// checking expection in the parseInt()
// code compiles but at runtime throws NumberFormatException

public class TestParse {
    public static void main(String[] args) {
        String s = "2";
        int num = Integer.parseInt(s);
        System.out.println(num);

        // String s1 = "two";
        // int num1 = Integer.parseInt(s1);

        // turning primitve to String
        double d = 42.5;
        String s1 = d+"";
        String s2 = Double.toString(d);
        String s3 = String.valueOf(d);
        System.out.println(s1+" "+s2 + " " + s3);
    }
}
