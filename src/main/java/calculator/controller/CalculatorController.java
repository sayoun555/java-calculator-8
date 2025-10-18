package calculator.controller;

import calculator.service.CalculatorService;

public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController (Service service) {
        this.service = service;
    }

}
