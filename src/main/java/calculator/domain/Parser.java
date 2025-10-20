package calculator.domain;

import java.util.regex.Pattern;

public class Parser {

    private static final String DEFAULT_DELIMITERS = ",|:";

    public String[] parse(String input) {

        if (input.startsWith("//")) {
            int customDelimiterIndex = input.indexOf("\n");
            String customDelimiter = Pattern.quote(input.substring(2, customDelimiterIndex)); // 특수문자 처리
            input = input.substring(customDelimiterIndex + 1);

            String allDelimiters = DEFAULT_DELIMITERS + "|" + customDelimiter;
            return input.split(allDelimiters);
        }

        return input.split(DEFAULT_DELIMITERS);
    }
}
