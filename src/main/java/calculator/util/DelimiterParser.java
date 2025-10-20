package calculator.util;

import java.util.ArrayList;
import java.util.List;

public class DelimiterParser {
    private final String DOUBLE_SLASH = "//";
    private final String NEWLINE = "\\n";

    public List<String> extractDelimiters(String input) {
        List<String> delimiters = new ArrayList<>();
        if (input.startsWith(DOUBLE_SLASH)) {
            int lineIndex = input.indexOf(NEWLINE);
            if (lineIndex != -1) {
                String custom = input.substring(2, lineIndex);
                delimiters.add(custom);
            }
        } else {
            delimiters.add(",");
            delimiters.add(":");
        }
        return delimiters;
    }

    public String extractCalculation(String input) {
        if (input.startsWith(DOUBLE_SLASH)) {
            int lineIndex = input.indexOf(NEWLINE);
            if (lineIndex != -1) {
                return input.substring(lineIndex + 2);
            }
        }
        return input;
    }
}