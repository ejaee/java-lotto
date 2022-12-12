package lotto.domain.exception;

import lotto.domain.lottoticket.LottoNumber;

public class LottoNumberException extends IllegalArgumentException {

    public static final String LOTTO_NUMBER_MESSAGE
        = String.format("[ERROR] %d에서 %d 범위 내에서 입력해야 합니다.", LottoNumber.MIN_VALUE, LottoNumber.MAX_VALUE);

    public LottoNumberException() {
        super(LOTTO_NUMBER_MESSAGE);
    }
}
