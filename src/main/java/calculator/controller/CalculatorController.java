package calculator.controller;

import calculator.io.InputView;
import calculator.io.OutputView;
import calculator.service.CalculatorService;

public class CalculatorController {
    private final CalculatorService service;
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController (CalculatorService service, InputView inputView, OutputView outputView) {
        this.service = service;
        this.inputView = inputView;
        this.outputView = outputView;
    }
    public void run() {
        String input = inputView.readInput();
        long result = service.calculatorSum(input);
        outputView.outputResult(result);
    }
}
