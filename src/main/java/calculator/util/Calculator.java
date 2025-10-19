package calculator.util;

import java.util.List;

public class Calculator {
    public long calculate(List<Long> num) {
        long sum = 0;
        for(int i = 0; i < num.size(); i++) {
            sum += num.get(i);
        }
        return sum;
    }
}
