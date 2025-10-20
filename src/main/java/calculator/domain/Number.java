package calculator.domain;

public class Number {
    private final String NOT_MESSAGE = "잘못 된 입력입니다.";
    private final String NEGATIVE_MESSAGE = "음수 입니다.";
    private final long val;

    public Number(String element) {
        long val = parse(element);
        valdate(val);
        this.val = val;
    }

    public long getVal() {
        return val;
    }

    private long parse(String element) {
        try {
            return Long.parseLong(element);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NOT_MESSAGE);
        }
    }

    private void valdate(long val) {
        if (val < 0) {
            throw new IllegalArgumentException(NEGATIVE_MESSAGE);
        }
    }
}