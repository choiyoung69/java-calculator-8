package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String REQUIRE_OPERAND_STRING_MESSAGE = "덧셈할 문자열을 입력해 주세요.";

    public String getUserInput() {
        System.out.println(REQUIRE_OPERAND_STRING_MESSAGE);
        return Console.readLine();
    }

}
