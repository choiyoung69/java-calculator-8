package calculator.controller;

import calculator.dto.InputDto;
import calculator.service.CalculationService;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {

    public static void run() {

        InputDto userInput = InputView.getUserInput();
        int result = CalculationService.calculate(userInput);
        System.out.println(result);
        OutputView.printResult(result);

    }
}
