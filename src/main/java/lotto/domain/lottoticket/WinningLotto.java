package lotto.domain.lottoticket;

import java.util.Objects;
import lotto.domain.exception.WinningLottoException;

public class WinningLotto {

    private final LottoTicket winningNumbers;
    private final LottoNumber bonusNumber;

    private WinningLotto(LottoTicket winningNumbers, LottoNumber bonusNumber) {
        validate(winningNumbers, bonusNumber);

        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    public static WinningLotto of(LottoTicket winningNumbers, LottoNumber bonusNumber) {
        return new WinningLotto(winningNumbers, bonusNumber);
    }

    private void validate(LottoTicket winningNumbers, LottoNumber bonusNumber) {
        if (isContained(winningNumbers, bonusNumber)) {
            throw new WinningLottoException();
        }
    }

    private static boolean isContained(LottoTicket winningNumbers, LottoNumber bonusNumber) {
        return winningNumbers.contained(bonusNumber);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final WinningLotto that = (WinningLotto) o;
        return Objects.equals(winningNumbers, that.winningNumbers)
                && Objects.equals(bonusNumber, that.bonusNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winningNumbers, bonusNumber);
    }
}
