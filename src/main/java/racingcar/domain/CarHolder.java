package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarHolder {
    private final List<Car> cars = new ArrayList<>();

    public static CarHolder from(String carNames) {
        return new CarHolder(carNames);
    }

    private CarHolder(String carNameString) {
        String[] carNames = carNameString.split(",");

        for (String carName : carNames) {
            cars.add(Car.withName(carName));
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
