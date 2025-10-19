package calculator;

import calculator.controller.CalculatorController;
import calculator.service.CalculatorService;
import calculator.service.CalculatorServiceImpl;

public class Application {
    public static void main(String[] args) {
        try {
            CalculatorService service = new CalculatorServiceImpl();
            CalculatorController controller = new CalculatorController(service);
            controller.run();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
