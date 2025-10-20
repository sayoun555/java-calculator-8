package calculator.util;

import java.util.ArrayList;
import java.util.List;

public class NumberParser {
    public List<Number> parseNumbers(String[] token) {
        List<Number> numbers = new ArrayList<>();
        for (String string : token) {
            if (string.isEmpty()) {
                continue;
            }
            numbers.add(new Number(string));
        }
        return numbers;
    }
}