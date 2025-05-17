import java.util.Comparator;
import java.util.function.Consumer;

public class ExampleLamdaExpression {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("hello");
        Consumer<String> consumer = str -> System.out.println(str);
        Comparator<String> comparator = (String str1, String str2) -> str1.compareToIgnoreCase(str2);
    }
}
