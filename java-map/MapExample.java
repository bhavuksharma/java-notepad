import java.util.HashMap;
import java.util.Map;

public class MapExample{
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        map.put("grapes", 15);
        int quantity = map.get("apple");
        boolean containKey =  map.containsKey("grapes");
        boolean containValue = map.containsValue("14");
        map.remove("banana");
        int mapSize = map.size();

        // Print the map
        System.out.println("Map content: " + map);


        // Iterate Map

        // using keyset()
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // using keySet()
        for(String key : map.keySet()){
            System.out.println("key: " + key);
        }

        // using values()
        for(Integer value : map.values()){
            System.out.println("Value: " + value);
        }
    }
}