package calculator.domain.parser;

import java.util.regex.Pattern;

public class CustomDelimiterStrategy extends DefaultDelimiterStrategy {

    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String CUSTOM_DELIMITER_SEPARATOR = "\\n";

    @Override
    public boolean canHandle(String input) {
        return input != null && input.startsWith(CUSTOM_DELIMITER_PREFIX) && input.contains(CUSTOM_DELIMITER_SEPARATOR);
    }

    @Override
    public String[] split(String input) {
        int customDelimiterIndex = input.indexOf(CUSTOM_DELIMITER_SEPARATOR);
        String customDelimiter = Pattern.quote(
                input.substring(CUSTOM_DELIMITER_PREFIX.length(), customDelimiterIndex));

        validateCustomDelimiter(customDelimiter);

        input = input.substring(customDelimiterIndex + CUSTOM_DELIMITER_SEPARATOR.length());

        String allDelimiters = DEFAULT_DELIMITERS + "|" + customDelimiter;

        return input.split(allDelimiters);
    }

    private void validateCustomDelimiter(String customDelimiter) {
        if (customDelimiter == null || customDelimiter.isEmpty()) {
            throw new IllegalArgumentException("커스텀 구분자가 비어 있습니다.");
        }
    }
}
