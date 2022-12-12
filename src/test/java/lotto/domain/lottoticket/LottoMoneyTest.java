package lotto.domain.lottoticket;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LottoMoneyTest {

    @ParameterizedTest
    @ValueSource(ints = {1000, 2000, 3000})
    void 클래스_생성_테스트(int input) {
        // given
        final int price = input;

        // when
        LottoMoney lottoMoney = LottoMoney.from(price);

        // then
        assertThat(lottoMoney).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 999, 18238})
    void 잘못된_입력값에_대한_테스트(int input) {
        // given
        final int price = input;

        // when
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> LottoMoney.from(price));

        // then
        assertThat(exception.getMessage()).contains("[ERROR]");
    }
}