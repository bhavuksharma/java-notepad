import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapPartitioningByExample {
    public static void main(String[] args){
        // Example usage of MapPartitioningByExample
        // This class is a placeholder for demonstrating how to use partitioning with maps.
        
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Partitioning numbers into even and odd
        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
            .collect(Collectors.partitioningBy(element -> element % 2 == 0));

        System.out.println("Partitioned Numbers: " + partitionedNumbers);
    }
    
}
