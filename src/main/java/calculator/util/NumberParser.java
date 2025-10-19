package calculator.util;

import java.util.ArrayList;
import java.util.List;

public class NumberParser {
    public List<Long> parseNumbers(String[] token) {
        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i < token.length; i++) {
            long num = Long.parseLong(token[i]);
            numbers.add(num);
        }
        return numbers;
    }
}
