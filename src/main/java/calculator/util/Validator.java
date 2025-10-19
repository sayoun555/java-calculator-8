package calculator.util;

import java.util.List;

public class Validator {
    public void checkNegative(List<Long> numbers) {
        for (long num : numbers) {
            if (num < 0) {
                throw new IllegalArgumentException("음수 입니다.");
            }
        }
    }
}
