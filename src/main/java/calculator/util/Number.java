package calculator.util;

public class Number {
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
            throw new IllegalArgumentException("잘못 된 입력 입니다.");
        }
    }

    private void valdate(long val) {
        if (val < 0) {
            throw new IllegalArgumentException("음수 입니다.");
        }
    }
}