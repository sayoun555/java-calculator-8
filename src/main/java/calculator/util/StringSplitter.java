package calculator.util;

import java.util.List;
import java.util.regex.Pattern;

public class StringSplitter {
    public String[] splitByDelimiter(String input, List<String> delimiters) {
        StringBuilder regex = new StringBuilder();
        for (int i = 0; i < delimiters.size(); i++) {
            if (i > 0) {
                regex.append("|");
            }
            regex.append(Pattern.quote(delimiters.get(i)));
        }
        return input.split(regex.toString());
    }
}