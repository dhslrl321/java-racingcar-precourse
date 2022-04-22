package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomUtil {
    public int pickRaceNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
