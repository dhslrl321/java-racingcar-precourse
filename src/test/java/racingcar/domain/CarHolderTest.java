package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarHolderTest {
    CarHolder sut;

    @BeforeEach
    void setUp() {
        sut = CarHolder.from("a,b,c");
    }

    @Test
    void 자동차의_개수는_컴마로_구분된_문자열의_수다() {
        List<Car> actual = sut.getCars();

        assertThat(actual.size()).isEqualTo(3);
    }
}