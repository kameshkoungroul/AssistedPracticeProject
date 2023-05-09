package assistedPracticeProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "kamesh@gmail.com";

        // Regular expression pattern for email validation
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()) {
            System.out.println(email + " is a valid email address");
        } else {
            System.out.println(email + " is an invalid email address");
        }
    }
}

