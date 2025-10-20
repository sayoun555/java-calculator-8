package calculator.io;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final String INPUT_MESSAGE = "덧셈할 문자열을 입력해주세요.";

    public String readInput() {
        System.out.println(INPUT_MESSAGE);
        return Console.readLine();
    }
}