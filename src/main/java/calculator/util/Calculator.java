package calculator.util;

import calculator.domain.Number;

import java.util.List;

public class Calculator {
    public long calculate(List<calculator.domain.Number> num) {
        long sum = 0;
        for (Number number : num) {
            sum += number.getVal();
        }
        return sum;
    }
}