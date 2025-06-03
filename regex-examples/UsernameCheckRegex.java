import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameCheckRegex {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z][\\w]{7,29}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("Samantha?10_2A");

        System.out.println(matcher.find());
    }
}
