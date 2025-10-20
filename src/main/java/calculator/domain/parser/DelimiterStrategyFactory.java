package calculator.domain.parser;

import java.util.List;

public class DelimiterStrategyFactory {

    private static final List<DelimiterStrategy> strategies = List.of(
            new CustomDelimiterStrategy(),
            new DefaultDelimiterStrategy()
    );

    public static DelimiterStrategy from(String input) {
        return strategies.stream()
                .filter(strategies -> strategies.canHandle(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("적절한 구분자 전략이 없습니다."));
    }
}
