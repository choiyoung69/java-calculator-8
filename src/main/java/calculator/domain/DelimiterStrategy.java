package calculator.domain;

public interface DelimiterStrategy {
    boolean canHandle(String input);

    String[] split(String input);
}
