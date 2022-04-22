package racingcar.io;

public class GameConsole {
    public static final String GREETING_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String RETRY = "";

    private final InputReader reader = new InputReader();

    public String queryCarNames() {
        String input;
        do {
            System.out.println(GREETING_MESSAGE);
            input = readLineWithHandleException();
        } while(input.equals(RETRY));
        return input;
    }

    private String readLineWithHandleException() {
        try {
            return reader.readStringWithCommas();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return RETRY;
        }
    }
}
