package lotto.domain.result;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RankTest {

    @Test
    void values() {
        // when
        // then
        assertThat(Rank.findValue(6, false)).isEqualByComparingTo(Rank.FIRST);
        assertThat(Rank.findValue(5, true)).isEqualByComparingTo(Rank.SECOND);
        assertThat(Rank.findValue(5, false)).isEqualByComparingTo(Rank.THIRD);
        assertThat(Rank.findValue(4, false)).isEqualByComparingTo(Rank.FOURTH);
        assertThat(Rank.findValue(3, false)).isEqualByComparingTo(Rank.FIFTH);
        assertThat(Rank.findValue(2, false)).isEqualByComparingTo(Rank.NONE);
        assertThat(Rank.findValue(1, false)).isEqualByComparingTo(Rank.NONE);
        assertThat(Rank.findValue(0, false)).isEqualByComparingTo(Rank.NONE);

    }
}