package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.util.RandomUtil;

class RaceRoundTest {
    final int RACE_ROUND_NUMBER = 3;
    final int CAR_COUNT = 2;

    RaceRound sut;

    RandomUtil randomUtil = mock(RandomUtil.class);

    Car car1 = mock(Car.class);
    Car car2 = mock(Car.class);

    @BeforeEach
    void setUp() {
        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        sut = RaceRound.of(3, list, randomUtil);
    }

    @Test
    void 라운드마다_랜덤한_수를_자동차에게_넘겨준다() {
        int random = 4;
        given(randomUtil.pickRaceNumber()).willReturn(random);

        sut.race();

        int randomTimes = RACE_ROUND_NUMBER * CAR_COUNT;

        verify(randomUtil, times(randomTimes)).pickRaceNumber();
        verify(car1, times(RACE_ROUND_NUMBER)).moveByNumber(random);
        verify(car2, times(RACE_ROUND_NUMBER)).moveByNumber(random);
    }

    @Test
    void 라운드가_종료되면_자동차들의_최종_위치를_반환한다() {
        RaceResult result = sut.race();

        assertThat(result).isNotNull();
    }
}