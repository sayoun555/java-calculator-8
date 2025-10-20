package calculator.util;

import java.util.List;

public class Calculator {
    public long calculate(List<Number> num) {
        long sum = 0;
        for (Number number : num) {
            sum += number.getVal();
        }
        return sum;
    }
}