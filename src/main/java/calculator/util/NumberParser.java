package calculator.util;

import java.util.ArrayList;
import java.util.List;

public class NumberParser {
    public List<Long> parseNumbers(String[] token) {
        List<Long> numbers = new ArrayList<>();
        try {
            for (String string : token) {
                long num = Long.parseLong(string);
                numbers.add(num);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못 된 입력입니다.");
        }
        Validator validator = new Validator();
        validator.checkNegative(numbers);
        return numbers;
    }
}