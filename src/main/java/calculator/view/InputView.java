package calculator.view;

import calculator.dto.InputDto;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String REQUIRE_OPERAND_STRING_MESSAGE = "덧셈할 문자열을 입력해 주세요.";

    public static InputDto getUserInput() {
        System.out.println(REQUIRE_OPERAND_STRING_MESSAGE);
        return new InputDto(Console.readLine());
    }

}
