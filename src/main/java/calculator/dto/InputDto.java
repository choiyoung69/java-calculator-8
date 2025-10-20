package calculator.dto;

public class InputDto {

    private final String delimitedNumbers;

    private InputDto(String delimitedNumbers) {
        this.delimitedNumbers = delimitedNumbers;
    }

    public static InputDto from(String delimitedNumbers) {
        validateNotNull(delimitedNumbers);
        return new InputDto(delimitedNumbers);
    }


    private static void validateNotNull(String delimitedNumbers) {
        if (delimitedNumbers == null) {
            throw new IllegalArgumentException("input이 null일 수 없습니다.");
        }
    }

    public String getDelimitedNumbers() {
        return delimitedNumbers;
    }
}
