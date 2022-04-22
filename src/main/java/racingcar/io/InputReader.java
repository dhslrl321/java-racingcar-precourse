package racingcar.io;

import camp.nextstep.edu.missionutils.Console;

public class InputReader {

    public static final String NAME_LENGTH_EXCEED_MESSAGE = "[ERROR] 자동차 이름은 5글자 이내이어야 한다.";
    public static final String COMMA = ",";

    public String readStringWithCommas() {
        String input = Console.readLine();

        String[] carNames = input.split(COMMA);
        for (String carName : carNames) {
            validateCarNames(carName);
        }
        return input;
    }

    private void validateCarNames(String carName) {
        if (5 < carName.length()) {
            throw new IllegalArgumentException(NAME_LENGTH_EXCEED_MESSAGE);
        }
    }
}