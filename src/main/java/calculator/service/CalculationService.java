package calculator.service;

import calculator.domain.Calculator;
import calculator.domain.CustomDelimiterStrategy;
import calculator.domain.DefaultDelimiterStrategy;
import calculator.domain.DelimiterStrategy;
import calculator.domain.Parser;
import calculator.dto.InputDto;
import java.util.Arrays;

public class CalculationService {

    public static int calculate(InputDto inputDto) {
        String input = inputDto.getDelimitedNumbers();

        DelimiterStrategy strategy = input.startsWith("//")
                ? new CustomDelimiterStrategy()
                : new DefaultDelimiterStrategy();

        Parser parser = new Parser(strategy);
        String[] stringNumbers = parser.parse(inputDto.getDelimitedNumbers());

        int[] numbers = Arrays.stream(stringNumbers)
                .mapToInt(Integer::parseInt)
                .toArray();

        return Calculator.add(numbers);
    }

}
