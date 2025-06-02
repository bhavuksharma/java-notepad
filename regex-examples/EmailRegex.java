import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex{
    public static void main(String[] args) {
        String email = "bello@gmail.com";
        Pattern pattern = Pattern.compile("(\\w+)@(\\w+)\\.(\\w+)");
        Matcher matcher = pattern.matcher(email);

        System.out.println(matcher.find());
    }
}