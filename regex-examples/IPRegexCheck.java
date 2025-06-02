import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPRegexCheck {
    public static void main(String[] args) {
        String text = "15.000.234.150";
        String regex = "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.find());
    }
}
