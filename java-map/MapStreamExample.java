import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamExample {
    public static void main(String[] args) {
        
        Map<String,Integer> map = Map.of(
            "A", 10,
            "B", 20,
            "C", 30
        );

        map.entrySet().stream()
            .forEach(entry -> {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
            );

        // filter map entries and store to another map
        Map<String, Integer> filteredMap = map.entrySet().stream()
            .filter(entry -> entry.getValue() > 15)
            .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
        System.out.println("Filtered Map: " + filteredMap);

        // mapping values
        Map<String, Integer> mappedValues = map.entrySet().stream()
            .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue() + 5));
        System.out.println("Mapped Values: " + mappedValues);

        // grouping by with streams
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "kiwi");
        Map<Integer, List<String>> groupedByLength = words.stream()
            .collect(Collectors.groupingBy(element -> element.length()));
        System.out.println("Grouped by Length: " + groupedByLength);
    }
}
