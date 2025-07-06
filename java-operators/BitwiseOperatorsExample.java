public class BitwiseOperatorsExample {
    public static void main(String[] args){
        // integer variables
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        System.out.println("Initial values: " + "a = " + a + ", b = " + b + "\n" 
            + "Binary representation: a = " + Integer.toBinaryString(a) + ", b = " + Integer.toBinaryString(b));

        // using bitwise operators
        System.out.println("bitwise a & b: " + (a&b));
        System.out.println("bitwise a | b: " + (a|b));
        System.out.println("bitwise a ^ b: " + (a^b));
        System.out.println("bitwise ~a: " + (~a));
        System.out.println("bitwise a << 1: " + (a << 1)); // left shift
        System.out.println("bitwise a >> 1: " + (a >> 1)); // right shift
        System.out.println("bitwise a >>> 1: " + (a >>> 1)); // unsigned right shift
    }
}
