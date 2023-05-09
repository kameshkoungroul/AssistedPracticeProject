package assistedPracticeProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExpressions {

	public static void main(String[] args) {
	      String text = "The quick brown fox jumps over the lazy dog.";

	        // match the word "quick" in the text
	        Pattern pattern = Pattern.compile("quick");
	        Matcher matcher = pattern.matcher(text);
	        if (matcher.find()) {
	            System.out.println("Match found!");
	        } else {
	            System.out.println("Match not found.");
	        }

	        // match any word containing the letter "o" in the text
	        pattern = Pattern.compile("\\b\\w*o\\w*\\b");
	        matcher = pattern.matcher(text);
	        while (matcher.find()) {
	            System.out.println("Match found: " + matcher.group());
	        }

	        // replace all occurrences of "the" with "THE" in the text
	        String replacedText = text.replaceAll("the", "THE");
	        System.out.println("Replaced text: " + replacedText);

	}

}
