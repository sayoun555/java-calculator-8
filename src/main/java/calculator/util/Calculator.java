package calculator.util;

import java.util.List;

public class Calculator {
    public long calculate(List<Long> num) {
        long sum = 0;
        for (Long aLong : num) {
            sum += aLong;
        }
        return sum;
    }
}
