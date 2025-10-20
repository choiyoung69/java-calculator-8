package calculator.domain.parser;

public class DefaultDelimiterStrategy implements DelimiterStrategy {

    protected static final String DEFAULT_DELIMITERS = ",|;";

    @Override
    public boolean canHandle(String input) {
        return true;
    }

    @Override
    public String[] split(String input) {
        return input.split(DEFAULT_DELIMITERS);
    }
}
