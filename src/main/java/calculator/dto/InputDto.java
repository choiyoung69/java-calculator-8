package calculator.dto;

public class InputDto {
    private final String delimitedNumbers;

    public InputDto(String delimitedNumbers) {
        validateNotNull(delimitedNumbers);
        this.delimitedNumbers = delimitedNumbers;
    }

    private static void validateNotNull(String delimitedNumbers) {
        if (delimitedNumbers == null) {
            throw new IllegalArgumentException("입력 문자열이 null일 수 없습니다.");
        }
    }

    public String getDelimitedNumbers() {
        return delimitedNumbers;
    }
}
