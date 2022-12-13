package lotto.domain.lottoticket;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WinningLottoTest {
    LottoTicket winningNumbers;
    LottoNumber properBonusNumber;
    LottoNumber illegalBonusNumber;

    @BeforeEach
    void setUp() {
        // given
        winningNumbers = new LottoTicket(List.of(1, 2, 3, 4, 5, 6));
        properBonusNumber = LottoNumberPool.get(7);
        illegalBonusNumber = LottoNumberPool.get(1);
    }

    @Test
    void create() {
        // when
        WinningLotto winningLotto = WinningLotto.of(winningNumbers, properBonusNumber);

        // then
        assertThat(winningLotto).isNotNull();
    }

    @Test
    void equals() {
        // when
        WinningLotto winningLotto = WinningLotto.of(winningNumbers, properBonusNumber);

        // then
        assertThat(winningLotto).isEqualTo(WinningLotto.of(winningNumbers, properBonusNumber));
    }

    @Test
    void createException() {
        // when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> WinningLotto.of(winningNumbers, illegalBonusNumber));

        // then
        assertThat(exception.getMessage()).contains("[ERROR]");
    }

}