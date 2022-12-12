package lotto.domain.lottoticket;

import lotto.domain.exception.LottoMoneyException;

public class LottoMoney {

    public static final long PRICE_OF_LOTTO_TICKET = 1000;

    private final long lottoMoney;

    private LottoMoney(final long lottoMoney) {
        validateMoney(lottoMoney);

        this.lottoMoney = lottoMoney;
    }

    public static LottoMoney from(final long lottoMoney) {
        return new LottoMoney(lottoMoney);
    }

    private void validateMoney(long lottoMoney) {
        if (!isValidateMoney(lottoMoney)) {
            throw new LottoMoneyException();
        }
    }

    private boolean isValidateMoney(long lottoMoney) {
        return lottoMoney % PRICE_OF_LOTTO_TICKET == 0;
    }

    public long calculateSizeOfTicket() {
        return lottoMoney / PRICE_OF_LOTTO_TICKET;
    }
}
