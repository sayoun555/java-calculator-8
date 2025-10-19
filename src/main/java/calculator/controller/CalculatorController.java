package calculator.controller;

import calculator.service.CalculatorService;
import camp.nextstep.edu.missionutils.Console;

public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController (CalculatorService service) {
        this.service = service;
    }
    public void run() {
        System.out.println(" 덧셈할 문자열을 입력해주세요.");
        String input = Console.readLine();
        service.calculatorSum(input);
    }
}
