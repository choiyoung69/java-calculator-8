package calculator.service;

import calculator.domain.Calculator;
import calculator.domain.DelimiterStrategy;
import calculator.domain.DelimiterStrategyFactory;
import calculator.domain.Parser;
import calculator.dto.InputDto;
import java.util.Arrays;

public class CalculationService {

    public static int calculate(InputDto inputDto) {
        String input = inputDto.getDelimitedNumbers();

        if (input.isEmpty()) {
            return 0;
        }

        DelimiterStrategy strategy = DelimiterStrategyFactory.from(input);
        Parser parser = new Parser(strategy);
        String[] stringNumbers = parser.parse(inputDto.getDelimitedNumbers());

        int[] numbers = Arrays.stream(stringNumbers)
                .mapToInt(Integer::parseInt)
                .toArray();

        return Calculator.add(numbers);
    }

}
