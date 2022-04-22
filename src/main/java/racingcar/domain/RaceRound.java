package racingcar.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.util.RandomUtil;

public class RaceRound {

    private final int roundForLoop;
    private final List<Car> cars;
    private final RandomUtil randomUtil;

    private RaceRound(int round, List<Car> cars, RandomUtil randomUtil) {
        this.roundForLoop = round;
        this.cars = cars;
        this.randomUtil = randomUtil;
    }

    public static RaceRound of(int round, List<Car> cars, RandomUtil randomUtil) {
        return new RaceRound(round, cars, randomUtil);
    }

    public RaceResult race() {
        for (int i = 0; i < roundForLoop; i++) {
            moveCarWithRandomNumber();
        }
        return RaceResult.of(cars);
    }

    private void moveCarWithRandomNumber() {
        for (Car car : cars) {
            int random = randomUtil.pickRaceNumber();
            car.moveByNumber(random);
        }
    }
}
