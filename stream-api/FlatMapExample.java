import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args){

        // first simple example
        List<List<String>> names = List.of(
            List.of("Charles","Jade"),
            List.of("King","Queen")
        );

        List<String> result = names.stream()
            .flatMap(list -> list.stream())
            .collect(Collectors.toList());
        
        System.out.println(result);

        // 2nd example
        List<String> sentences = List.of(
            "Java is fun",
            "Stream api is powerful"
        );

        List<String> words = sentences.stream()
            .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
            .collect(Collectors.toList());
        System.out.println("words collected: " + words);

        // 3rd simple example
        List<List<Integer>> numbers = List.of(
            List.of(1,2,3),
            List.of(2,3,4),
            List.of(4,5,6)
        );

        List<Integer> uniqueNumbers = numbers.stream()
                                            .flatMap(list -> list.stream())
                                            .distinct()
                                            .collect(Collectors.toList());
        System.out.println("unique numbers: "+ uniqueNumbers);

        // 4th simple example
        // Cartisian product example
        List<Integer> list1 = List.of(1,2);
        List<Integer> list2 = List.of(3,4);
        List<String> pairs = list1.stream()
            .flatMap(i -> list2.stream().map(j -> "( " + i + " , " + j + " )"))
            .collect(Collectors.toList());
        System.out.println(pairs);

        // 5th simple example
        // add 2 to all numbers in the list
        List<List<Integer>> numberlist = List.of(
            List.of(1,2,3,4),
            List.of(5,6,7,8),
            List.of(1,2,3,4)
        );

        List<Integer> listAfterAdding2 = numberlist.stream()
                .flatMap(list -> list.stream().map(num -> num+2))
                .collect(Collectors.toList());

        List<Integer> listAfterAddingNumber2 = numberlist.stream()
            .flatMap(list -> list.stream())
            .map(num -> num+2)
            .collect(Collectors.toList());
        System.out.println("list after 2 added: "+ listAfterAdding2);
        System.out.println("list after adding 2 the numbers: "+ listAfterAddingNumber2);
    }
}
