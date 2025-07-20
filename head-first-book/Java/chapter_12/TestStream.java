import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        List<String> list = List.of("I","am","a","working","stream","example");
        // Stream<String> listStream = list.stream();
        // Stream<String> limit = listStream.limit(4);
        // List<String> result = limit.collect(Collectors.toList());
        // System.out.println(result);

        // List<String> result = list.stream()
        //                             .sorted()
        //                             .limit(4)
        //                             .collect(Collectors.toList());
        // System.out.println(result);

        // List<String> result = list.stream()
        //                             .sorted((s1,s2) -> s1.compareToIgnoreCase(s2))
        //                             .limit(4)
        //                             .collect(Collectors.toList());
        // System.out.println(result);

        List<String> result = list.stream()
                                    .sorted((s1,s2) -> s1.compareToIgnoreCase(s2))
                                    .skip(2)
                                    .limit(4)
                                    .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(result);
    }
}
