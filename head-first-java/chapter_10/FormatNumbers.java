public class FormatNumbers {
    public static void main(String[] args) {
        long myBillion = 1_000_000_000;
        // String s = String.format("%,d", myBillion);
        String s = String.format("%d,",myBillion);
        System.out.println(s);

        String s1 = String.format("I have %.2f, bugs to fix", 476578.09876);
        System.out.println(s1);

        String s2 = String.format("I have %,.2f bugs to fix.", 476578.09876);
        System.out.println(s2);

        System.out.println(String.format("%,8.2f", 42.000));

        long one = 20435834;
        double two = 80000000.355332;
        String newFormatted = String.format("Students %,d out of %,.2f are selected in the exam.", one,two);
        System.out.println(newFormatted);
        

        int num2 = 24;
        float num3 = 23.5455535f; 
        String num2String = String.format("numbers are: %2$04d and %1$.3f", num3,num2);
        System.out.println(num2String);
    }
}
