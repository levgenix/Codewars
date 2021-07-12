import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (like the name of this kata).
 *
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 * Examples:
 *
 * spinWords("Hey fellow warriors") => "Hey wollef sroirraw"
 * spinWords("This is a test") => "This is a test"
 * spinWords("This is another test") => "This is rehtona test"
 */
public class SpinWords {
    public String spinWords(String sentence) {

        Pattern pattern = Pattern.compile("([^[A-Za-z]]*)([A-Za-z]+)([^[A-Za-z]]*)");
        return Arrays.stream(sentence.split(" ")).map((input) -> {
            Matcher matcher = pattern.matcher(input);
            return matcher.find() ? matcher.group(1) + (matcher.group(2).length() >= 5 ? new StringBuilder(matcher.group(2)).reverse().toString() : matcher.group(2)) + matcher.group(3) : null;
        }).collect(Collectors.joining(" "));
    }
}
