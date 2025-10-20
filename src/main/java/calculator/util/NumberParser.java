package calculator.util;

import calculator.domain.Number;

import java.util.ArrayList;
import java.util.List;

public class NumberParser {
    public List<calculator.domain.Number> parseNumbers(String[] token) {
        List<calculator.domain.Number> numbers = new ArrayList<>();
        for (String string : token) {
            if (string.isEmpty()) {
                continue;
            }
            numbers.add(new Number(string));
        }
        return numbers;
    }
}