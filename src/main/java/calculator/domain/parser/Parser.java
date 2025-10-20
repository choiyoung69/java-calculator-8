package calculator.domain.parser;

public class Parser {

    private DelimiterStrategy delimiterStrategy;

    public Parser(DelimiterStrategy delimiterStrategy) {
        this.delimiterStrategy = delimiterStrategy;
    }

    public String[] parse(String input) {
        return delimiterStrategy.split(input);
    }
}