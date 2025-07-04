import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapGroupingByAndPartitioningByExercise {
    public static void main(String[] args) {
        // Example usage of MapGroupingByAndPartitioningByExercise
        // This class is a placeholder for demonstrating how to use grouping and partitioning with maps.
        
        // Grouping and partitioning logic can be added here as needed.
        
        // Group names by their first letter
        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
        Map<Character , List<String>> groupByFirstLetter = names.stream()
            .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("Grouped by First Letter: " + groupByFirstLetter);

        // Partition a list of numbers into >10 and <=10
        List<Integer> numbers = List.of(5, 12, 3, 8, 15, 20);
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
            .collect(Collectors.partitioningBy(number -> number > 10));
        System.out.println("Partitioned Numbers: " + partitionedNumbers);

        // Count how many words starts with each letter
        List<String> words = List.of("apple", "banana", "apricot", "blueberry", "avocado");
        Map<Character, Long> countByFirstLetter = words.stream()
            .collect(Collectors.groupingBy(word -> word.charAt(0), Collectors.counting()));
        System.out.println("Count by First Letter: " + countByFirstLetter);

    }
}
