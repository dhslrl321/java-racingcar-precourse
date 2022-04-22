package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomUtil {

    public static final int START_INCLUSIVE = 0;
    public static final int END_INCLUSIVE = 9;

    public int pickRaceNumber() {
        return Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
    }
}
