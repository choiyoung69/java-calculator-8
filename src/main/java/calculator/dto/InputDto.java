package calculator.dto;

public class InputDto {
    private final String delimitedNumbers;
    ;

    public InputDto(String delimitedNumbers) {
        this.delimitedNumbers = delimitedNumbers;
    }

    public String getUserInput() {
        return delimitedNumbers;
    }
}
