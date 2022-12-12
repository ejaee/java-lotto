package lotto.domain.lottoticket;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LottoNumberPoolTest {

    @Test
    void caching_test() {
        LottoNumber lottoNumber = LottoNumberPool.get(1);

        assertThat(lottoNumber).isEqualTo(LottoNumber.from(1));
        assertThat(lottoNumber == LottoNumberPool.get(1)).isTrue();
    }
}