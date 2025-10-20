package calculator.controller;

import calculator.dto.InputDto;
import calculator.service.CalculationService;
import calculator.view.InputView;

public class CalculatorController {

    private final CalculationService calculationService;

    public static void run() {

        InputDto userInput = InputView.getUserInput();

    }
}
