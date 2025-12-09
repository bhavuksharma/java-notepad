import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args){
        List<List<String>> strings = List.of(
            List.of("jai", "veeru", "som"),
            List.of("monkey", "dog", "pig", "cat"),
            List.of("har", "kar", "chal", "Chalk")
        );

        strings.stream()
                .flatMap(list -> list.stream())
                .filter(word -> word.matches("^[cC].*"))
                .forEach(word -> System.out.println(word));

        Map<String, List<String>> mapStringStartsWithC = strings.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.groupingBy(word -> word.substring(0,1)));
                // .collect(Collectors.partitioningBy(word -> word.matches("^[cC].*")));
        
        System.out.println(mapStringStartsWithC);
    }

    
}
