public class SplitCSV {
    public static void main(String[] args) {
        String text = "apple,banana,grape,mango";
        String[] results = text.split(",");

        for(String result : results){
            System.out.println(result);
        }
    }
}
