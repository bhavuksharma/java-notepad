public class ReplaceString {
    public static void main(String[] args) {
        String text = "Order ID: 12345 with the transaction number 98765";
        String result = text.replaceAll("\\d", "X");
        System.out.println("modified text: "+ result);

        String vowel = "adeiou";
        String vowelResult = vowel.replaceAll("[aeiou]", "\\*");
        System.out.println("vowel result after replacement: "+ vowelResult);
    }
}
