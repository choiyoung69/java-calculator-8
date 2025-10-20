package calculator.domain;

public class DelimiterStrategyFactory {

    public static DelimiterStrategy from(String input) {
        if (input.startsWith("//")) {
            return new CustomDelimiterStrategy();
        }
        return new DefaultDelimiterStrategy();
    }
}
