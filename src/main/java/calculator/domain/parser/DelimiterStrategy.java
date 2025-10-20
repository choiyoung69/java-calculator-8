package calculator.domain.parser;

public interface DelimiterStrategy {
    boolean canHandle(String input);

    String[] split(String input);
}
