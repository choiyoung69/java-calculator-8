package calculator.service;

import calculator.domain.Calculator;
import calculator.domain.Parser;
import calculator.dto.InputDto;
import java.util.Arrays;

public class CalculationService {

    public static int calculate(InputDto inputDto) {
        String[] stringNumbers = Parser.parse(inputDto.getDelimitedNumbers());

        int[] numbers = Arrays.stream(stringNumbers)
                .mapToInt(Integer::parseInt)
                .toArray();

        return Calculator.add(numbers);
    }

}
