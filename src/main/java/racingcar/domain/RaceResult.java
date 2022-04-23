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

    public int longestDistance() {
        int longestDistance = Integer.MIN_VALUE;
        for (String key : map.keySet()) {
            String distance = map.get(key);
            longestDistance = Math.max(longestDistance, distance.length());
        }

        return longestDistance;
    }

    public Map<String, String> eachCarPosition() {
        return map;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (String key : map.keySet()) {
            String item = map.get(key);
            sb.append(String.format("%s : %s\n", key, item));
        }

        return sb.toString();
    }
}
