package calculator.util;

import java.util.ArrayList;
import java.util.List;

public class DelimiterParser {
    public List<String> extractDelimiters(String input) {
        List<String> delimiters = new ArrayList<>();
        if (input.startsWith("//")) {
            int lineIndex = input.indexOf("\n");
            String custom = input.substring(2, lineIndex);
            delimiters.add(custom);
        } else {
            delimiters.add(",");
            delimiters.add(":");
        }
        return delimiters;
    }
}
