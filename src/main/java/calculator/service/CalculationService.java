package calculator.service;

import calculator.domain.Calculator;
import calculator.domain.NumberValue;
import calculator.domain.parser.DelimiterStrategy;
import calculator.domain.parser.DelimiterStrategyFactory;
import calculator.domain.parser.Parser;
import calculator.dto.InputDto;
import java.util.List;

public class CalculationService {

    public static int calculate(InputDto inputDto) {
        String input = inputDto.getDelimitedNumbers();

        DelimiterStrategy strategy = DelimiterStrategyFactory.from(input);
        Parser parser = new Parser(strategy);
        String[] stringNumbers = parser.parse(input);

        List<NumberValue> numbers = NumberValue.from(stringNumbers);

        return Calculator.add(numbers);
    }
}
