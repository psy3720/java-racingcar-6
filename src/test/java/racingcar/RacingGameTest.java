package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingGameTest {

    @Test
    @DisplayName("자동차이름을_문자열로_입력하면_리스트로_반환한다(콤마기준으로 구분)")
    void 자동자이름을_입력하면_자동차리스트를_반환한다() {
        RacingGame racingGame = new RacingGame();

        List<Car> cars = racingGame.createCars("pobi,woni,jun");

        assertThat(cars).extracting("name").containsExactly("pobi", "woni", "jun");
    }
}