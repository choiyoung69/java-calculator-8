package calculator.domain;

public class DefaultDelimiterStrategy implements DelimiterStrategy {

    private static final String DEFAULT_DELIMITERS = ",|;";

    @Override
    public String[] split(String input) {
        return input.split(DEFAULT_DELIMITERS);
    }
}
