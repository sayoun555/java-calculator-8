package calculator.util;

import java.util.List;

public class StringSplitter {
    public String[] splitByDelimiter(String input, List<String> delimiters) {
        StringBuilder regex = new StringBuilder("[");
        for (String delimiter : delimiters) {
            regex.append(delimiter);
        }
        regex.append("]");
        return input.split(regex.toString());
    }
}
