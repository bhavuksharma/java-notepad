public class TernaryOperatorExample {
    public static void main(String[] args){
        // integer variables
        int age = 20;

        // Using ternary operator to check if the person is an adult
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age: " + age + ", Status: " + result);
    }
}
