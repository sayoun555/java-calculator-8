package calculator.service;

import calculator.util.Calculator;
import calculator.util.DelimiterParser;
import calculator.util.NumberParser;
import calculator.util.StringSplitter;

import java.util.List;

public class CalculatorServiceImpl implements CalculatorService{
    private final Calculator calculator;
    private final DelimiterParser delimiterParser;
    private final NumberParser numberParser;
    private final StringSplitter stringSplitter;

    public CalculatorServiceImpl() {
        this.calculator = new Calculator();
        this.delimiterParser = new DelimiterParser();
        this.numberParser = new NumberParser();
        this.stringSplitter = new StringSplitter();
    }
    public long calculatorSum(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        List<String> delimiters = delimiterParser.extractDelimiters(input);
        String calcPart = delimiterParser.extractCalculation(input);
        String[] stringSplit = stringSplitter.splitByDelimiter(calcPart, delimiters);
        List<Long> numbers = numberParser.parseNumbers(stringSplit);
        return calculator.calculate(numbers);
    }
}