package lotto.domain.utils;

import lotto.domain.exception.EmptyCheckException;

public class EmptyChecker {
    private EmptyChecker() {
    }

    public static void check(final String input) {
        if (isEmptyOrNull(input)) {
            throw new EmptyCheckException();
        }
    }

    private static boolean isEmptyOrNull(String input) {
        return input == null || input.isEmpty();
    }
}
