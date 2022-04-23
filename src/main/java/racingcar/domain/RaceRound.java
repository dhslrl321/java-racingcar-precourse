package racingcar.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.util.RandomUtil;

public class RaceRound {

    private final List<Car> cars;
    private final RandomUtil randomUtil;

    private RaceRound(List<Car> cars, RandomUtil randomUtil) {
        this.cars = cars;
        this.randomUtil = randomUtil;
    }

    public static RaceRound of(List<Car> cars, RandomUtil randomUtil) {
        return new RaceRound(cars, randomUtil);
    }

    public RaceResult race() {
        moveCarWithRandomNumber();
        return RaceResult.of(cars);
    }

    private void moveCarWithRandomNumber() {
        for (Car car : cars) {
            int random = randomUtil.pickRaceNumber();
            car.moveByNumber(random);
        }
    }
}
