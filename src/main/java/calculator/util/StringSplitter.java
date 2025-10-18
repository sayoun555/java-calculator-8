package calculator.util;

import java.util.List;

public class StringSplitter {
    public String[] splitByDelimiter(String input, List<String> delimiters) {
        String regex = "[";
        for (int i = 0; i < delimiters.size(); i++) {
            regex += delimiters.get(i);
        }
        regex += "]";
        String[] stringSplit = input.split(regex);
        return stringSplit;
    }
}
