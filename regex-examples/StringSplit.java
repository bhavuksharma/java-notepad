public class StringSplit {
    public static void main(String[] args) {
        String text = "Java  is     wonderful";
        String[] results = text.split("\\s+");

        for(String result : results){
            System.out.println(result);
        }
    }
}
