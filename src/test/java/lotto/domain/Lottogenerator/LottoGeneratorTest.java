package lotto.domain.Lottogenerator;

import static org.assertj.core.api.Assertions.assertThat;

import lotto.domain.lottoticket.LottoTickets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LottoGeneratorTest {

    LottoGenerator lottoGenerator;

    @BeforeEach
    void setUp() {
        // given
        lottoGenerator = LottoGenerator.getInstance();
    }

    @Test
    void create() {
        // when

        // then
        assertThat(lottoGenerator).isEqualTo(LottoGenerator.getInstance());

    }

    @Test
    void createLottoTickets() {
        // when
        LottoTickets lottoTickets = lottoGenerator.createLottoTicket(3, new AutoLottoMachine());

        // then
        assertThat(lottoTickets.size()).isEqualTo(3);
    }

}