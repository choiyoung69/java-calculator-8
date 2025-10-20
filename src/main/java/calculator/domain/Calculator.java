package calculator.domain;

import java.util.List;

public class Calculator {

    public static int add(List<NumberValue> numbers) {
        int sum = 0;
        try {
            for (NumberValue number : numbers) {
                sum = Math.addExact(sum, number.intValue());
            }
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("계산할 떄 오버플로우가 발생했습니다.", e);
        }
        return sum;
    }
}
