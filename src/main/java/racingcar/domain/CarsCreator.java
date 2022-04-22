package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarsCreator {

    private static final String COMMA = ",";

    private CarsCreator() {}

    public static CarsCreator create() {
        return new CarsCreator();
    }

    public List<Car> createCarsBy(String carNames) {
        String[] names = carNames.split(COMMA);
        List<Car> cars = new ArrayList<>();

        for (String name : names) {
            cars.add(Car.withName(name));
        }

        return cars;
    }
}
