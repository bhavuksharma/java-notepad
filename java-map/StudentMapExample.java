import java.util.HashMap;
import java.util.Map;

public class StudentMapExample {
    public static void main(String[] args){

        HashMap<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Charlie", 20);
        studentMap.put("Mohan", 50);
        studentMap.put("Chaplin", 30);

        for(Map.Entry<String,Integer> entry : studentMap.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());  

        }
    }
}