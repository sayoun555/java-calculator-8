package calculator;

import calculator.controller.CalculatorController;
import calculator.io.InputView;
import calculator.io.OutputView;
import calculator.service.CalculatorService;
import calculator.service.CalculatorServiceImpl;

public class Application {
    public static void main(String[] args) {
        try {
            CalculatorService service = new CalculatorServiceImpl();
            InputView inputView = new InputView();
            OutputView outputView = new OutputView();
            CalculatorController controller = new CalculatorController(service, inputView, outputView);
            controller.run();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
