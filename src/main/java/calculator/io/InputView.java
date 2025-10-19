package calculator.io;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String readInput() {
        System.out.println("덧셈할 문자열을 입력해주세요.");
        String input = Console.readLine();
        if (input == null)
            throw new IllegalArgumentException("입력값이 없습니다.");
        return input;
    }
}
