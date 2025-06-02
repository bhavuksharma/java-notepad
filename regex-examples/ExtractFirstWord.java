import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractFirstWord {
    public static void main(String[] args) {
        String text = "Jai Ho";
        Pattern pattern = Pattern.compile("^(\\w+)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("first word: " + matcher.group(1));
        }
    }
}
