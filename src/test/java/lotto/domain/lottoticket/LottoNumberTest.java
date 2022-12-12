package lotto.domain.lottoticket;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LottoNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 45, 30})
    void 클래스_생성_테스트(int input) {
        // given
        final int number = input;

        // when
        LottoNumber lottoNumber = LottoNumber.from(number);

        // then
        assertThat(lottoNumber).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 46, 0})
    void 잘못된_입력값에_대한_테스트(int input) {
        // given
        final int number = input;

        // when
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> LottoNumber.from(number));

        // then
        assertThat(exception.getMessage()).contains("[ERROR]");
    }
}