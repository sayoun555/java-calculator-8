package calculator.util;

import java.util.List;

public class Validator {
    public void checkNegative(List<Long> numbers) {
        for(int i = 0; i < numbers.size(); i++) {
            long num = numbers.get(i);
            if (num < 0) {
                throw new IllegalArgumentException("음수 입니다.");
            }
        }
    }
}
