package calculator;

import calculator.controller.CalculatorController;
import calculator.service.CalculatorService;

public class Application {
    public static void main(String[] args) {
        try {
            Service service = new CalculatorService();
            Controller controller = new CalculatorController(service);
            controller.run();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
