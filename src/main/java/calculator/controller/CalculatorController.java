package calculator.controller;

import calculator.io.InputView;
import calculator.io.OutputView;
import calculator.service.CalculatorService;

public class CalculatorController {
    private final CalculatorService service;
    private final InputView inputview;
    private final OutputView outputview;

    public CalculatorController (CalculatorService service, InputView inputview, OutputView outputview) {
        this.service = service;
        this.inputview = inputview;
        this.outputview = outputview;
    }
    public void run() {
        String input = inputview.readInput();
        long result = service.calculatorSum(input);
        outputview.outputResult(result);
    }
}
