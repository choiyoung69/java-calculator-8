package calculator.controller;

import calculator.service.CalculationService;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {

    public static void run() {

        int result = CalculationService.calculate(InputView.getUserInput());
        OutputView.printResult(result);

    }
}
