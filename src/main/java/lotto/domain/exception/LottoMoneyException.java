package lotto.domain.exception;

import lotto.domain.lottoticket.LottoMoney;

public class LottoMoneyException extends IllegalArgumentException{

    public static final String LOTTO_MONEY_MESSAGE
            = String.format("[ERROR] %d 단위로 입력해야 합니다.", LottoMoney.PRICE_OF_LOTTO_TICKET);

    public LottoMoneyException() {
        super(LOTTO_MONEY_MESSAGE);
    }
}
