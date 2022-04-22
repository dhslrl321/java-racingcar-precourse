package racingcar.domain;

public class Car {

    public static final String DASH = "-";
    private final String carName;
    private final StringBuilder distance = new StringBuilder("");

    private Car(String carName) {
        this.carName = carName;
    }

    public static Car withName(String carName) {
        return new Car(carName);
    }

    public void moveByNumber(int number) {
        if (isUnderFour(number)) {
            return;
        }
        distance.append(DASH);
    }

    private boolean isUnderFour(int number) {
        return number < 4;
    }

    public String getMovedDistance() {
        return distance.toString();
    }

    public String getName() {
        return this.carName;
    }
}
