package lotto.domain.utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

class EmptyCheckerTest {

    // given
    @ParameterizedTest
    @NullSource
    @EmptySource
    void checkEmpty(String input) {
        // when
        Exception exception = assertThrows(IllegalArgumentException.class, () -> EmptyChecker.check(input));

        // then
        assertThat(exception.getMessage()).contains("[ERROR]");
    }
}