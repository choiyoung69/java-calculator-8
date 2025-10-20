package calculator.domain;

import java.util.List;

public class Calculator {

    public static int add(List<NumberValue> numbers) {
        int sum = numbers.stream()
                .mapToInt(NumberValue::intValue)
                .sum();

        return sum;
    }
}
