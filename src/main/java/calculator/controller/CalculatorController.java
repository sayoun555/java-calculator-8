package calculator.controller;

import calculator.io.InputView;
import calculator.io.OutputView;
import calculator.service.CalculatorService;

public class CalculatorController {
    private final CalculatorService calculatorService;
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController (CalculatorService calculatorService, InputView inputView, OutputView outputView) {
        this.calculatorService = calculatorService;
        this.inputView = inputView;
        this.outputView = outputView;
    }
    public void run() {
        String input = inputView.readInput();
        long result = calculatorService.calculatorSum(input);
        outputView.outputResult(result);
    }
}