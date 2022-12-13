package lotto.domain.lottoticket;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LottoTicketsTest {

    List<LottoTicket> lottoTicket;

    @BeforeEach
    void setUp() {
        // given
        List<Integer> lottoNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        lottoTicket = Arrays.asList(new LottoTicket(lottoNumbers), new LottoTicket(lottoNumbers), new LottoTicket(lottoNumbers));
    }

    @Test
    void create() {
        // when
        LottoTickets lottoTickets = LottoTickets.from(lottoTicket);

        // then
        assertThat(lottoTickets).isNotNull();
    }

    @Test
    void equals() {
        // when
        LottoTickets lottoTickets = LottoTickets.from(lottoTicket);

        // then
        assertThat(lottoTickets).isEqualTo(LottoTickets.from(lottoTicket));
    }

    @Test
    void size() {
        LottoTickets lottoTickets = LottoTickets.from(lottoTicket);

        // then
        assertThat(lottoTickets.size()).isEqualTo(3);
    }

}