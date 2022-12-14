package lotto.domain.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import lotto.domain.lottoticket.LottoMoney;
import lotto.domain.lottoticket.LottoNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class BasicLottoInputParserTest {

    @Test
    void parseLottoMoney() {
        // given
        String input = "14000";

        // when
        LottoMoney lottoMoney = BasicLottoInputParser.parseLottoMoney(input);

        // then
        Assertions.assertThat(lottoMoney).isNotNull();
    }

    // given
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {"-1", "string"})
    void parseLottoMoney_exception(String input) {
        // when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> BasicLottoInputParser.parseLottoMoney(input));

        // then
        assertThat(exception.getMessage()).contains("[ERROR]");
    }

    @Test
    void parseLottoNumber() {
        // given
        String input = "1";

        // when
        LottoNumber lottoNumber = BasicLottoInputParser.parseLottoNumber(input);

        // then
        Assertions.assertThat(lottoNumber).isNotNull();
    }

    // given
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {"-1", "string"})
    void parseLottoNumber_exception(String input) {
        // when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> BasicLottoInputParser.parseLottoNumber(input));

        // then
        assertThat(exception.getMessage()).contains("[ERROR]");
    }

}