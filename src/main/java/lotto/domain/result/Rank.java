package lotto.domain.result;

import java.util.Arrays;

public enum Rank {

    FIRST(6, false),
    SECOND(5, true),
    THIRD(5, false),
    FOURTH(4, false),
    FIFTH(3, false),
    NONE(0, false);

    private final int matchingCount;
    private final boolean isBonus;

    Rank(final int matchingCount, final boolean isBonus) {
        this.matchingCount = matchingCount;
        this.isBonus = isBonus;
    }

    public static Rank findValue(final int matchingCount, final boolean isBonus) {
        if (isBonus) {
            return SECOND;
        }
        return findValueWithoutSecond(matchingCount);
    }

    private static Rank findValueWithoutSecond(final int matchingCount) {
        return Arrays.stream(values())
            .filter(rank -> rank.isNotSecond(rank))
            .filter(rank -> rank.matchCount(matchingCount))
            .findFirst()
            .orElse(NONE);
    }

    private boolean isNotSecond(Rank rank) {
        return !rank.isBonus;
    }

    private boolean matchCount(final int matchingCount) {
        return matchingCount == this.matchingCount;
    }
}
