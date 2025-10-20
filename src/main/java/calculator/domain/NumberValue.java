package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class NumberValue {

    private final Number value;

    private NumberValue(Number value) {
        this.value = value;
    }

    public static List<NumberValue> from(String[] inputs) {
        List<NumberValue> result = new ArrayList<>();

        for (String input : inputs) {
            result.add(parseSingle(input));
        }

        return result;
    }

    private static NumberValue parseSingle(String input) {
        String trimmed = input.trim();

        validateNotEmpty(trimmed);

        try {
            int parsed = Integer.parseInt(trimmed);
            validateNotNegative(parsed);
            return new NumberValue(parsed);

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("정수가 아닌 값입니다: " + input);
        }
    }

    private static void validateNotNegative(int parsed) {
        if (parsed < 0) {
            throw new IllegalArgumentException("음수는 허용되지 않습니다: " + parsed);
        }
    }

    private static void validateNotEmpty(String trimmed) {
        if (trimmed.isEmpty()) {
            throw new IllegalArgumentException("빈 문자열 또는 공백만 입력되었습니다.");
        }
    }

    public int intValue() {
        return value.intValue();
    }
}