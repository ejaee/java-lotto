package lotto.domain.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import lotto.domain.lottoticket.LottoTicket;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class LottoTicketInputParserTest {

    @Test
    void parseLottoTicket() {
        // given
        String input = "1,2,3,4,5,6";

        // when
        LottoTicket lottoTicket = LottoTicketInputParser.parseLottoTicket(input);

        // then
        Assertions.assertThat(lottoTicket).isNotNull();
    }

    // given
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {"1,2,3,4,5", "1,2,3,4,5,6,7"})
    void parseLottoTicket_exception(String input) {
        // when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> LottoTicketInputParser.parseLottoTicket(input));

        // then
        assertThat(exception.getMessage()).contains("[ERROR]");
    }



}