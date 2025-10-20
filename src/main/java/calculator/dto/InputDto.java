package calculator.dto;

public class InputDto {
    private final String userInput;

    public InputDto(String userInput) {
        this.userInput = userInput;
    }

    public String getUserInput() {
        return userInput;
    }
}
