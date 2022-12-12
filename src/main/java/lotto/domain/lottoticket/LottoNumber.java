package lotto.domain.lottoticket;

import java.util.Objects;
import lotto.domain.exception.LottoNumberException;

public class LottoNumber {
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 45;

    public final int lottoNumber;

    private LottoNumber(int number) {
        validateLottoNumber(number);

        lottoNumber = number;
    }

    public static LottoNumber from(int number) {
        return new LottoNumber(number);
    }

    private void validateLottoNumber(int number) {
        if (!isValidateRange(number)) {
            throw new LottoNumberException();
        }
    }

    private static boolean isValidateRange(int number) {
        return MIN_VALUE <= number && number <= MAX_VALUE;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final LottoNumber that = (LottoNumber) o;
        return lottoNumber == that.lottoNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottoNumber);
    }
}
