public class SplitOnVowel {
    public static void main(String[] args) {
        String text = "ljljlavdsebsdishshouhhh";
        String[] results = text.split("[aeiou]+");
        
        for(String result : results){
            System.out.println(result);
        }
    }
}
