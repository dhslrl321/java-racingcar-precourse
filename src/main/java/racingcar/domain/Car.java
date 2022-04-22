package racingcar.domain;

public class Car {

    private final String carName;
    private final StringBuilder distance = new StringBuilder("");

    private Car(String carName) {
        this.carName = carName;
    }

    public static Car withName(String carName) {
        return new Car(carName);
    }

    public void moveByNumber(int i) {
        if (i < 4) {
            return;
        }
        distance.append("-");
    }

    public String getMovedDistance() {
        return distance.toString();
    }
}
