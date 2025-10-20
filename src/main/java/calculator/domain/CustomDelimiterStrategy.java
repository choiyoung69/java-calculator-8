package calculator.domain;

import java.util.regex.Pattern;

public class CustomDelimiterStrategy extends DefaultDelimiterStrategy {

    @Override
    public String[] split(String input) {
        int customDelimiterIndex = input.indexOf("\\n");
        String customDelimiter = Pattern.quote(input.substring(2, customDelimiterIndex));
        input = input.substring(customDelimiterIndex + 2);

        String allDelimiters = DEFAULT_DELIMITERS + "|" + customDelimiter;

        return input.split(allDelimiters);
    }
}
