package racingcar.game;

import racingcar.io.GameConsole;

public class CarRacingGame {

    private final GameConsole console = new GameConsole();

    public void run() {
        String carNames = console.queryCarNames();
    }
}
