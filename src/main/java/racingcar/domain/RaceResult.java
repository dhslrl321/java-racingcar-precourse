package racingcar.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RaceResult {

    private final Map<String, String> map;

    private RaceResult(Map<String, String> map) {
        this.map = map;
    }

    public static RaceResult of(List<Car> cars) {
         Map<String, String> map = new HashMap<>();
        for (Car car : cars) {
            map.put(car.getName(), car.getMovedDistance());
        }
        return new RaceResult(map);
    }
}
