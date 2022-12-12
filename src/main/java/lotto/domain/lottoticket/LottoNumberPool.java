package lotto.domain.lottoticket;

import java.util.HashMap;
import java.util.Map;

public class LottoNumberPool {
    private static final Map<Integer, LottoNumber> LOTTO_NUMBERS = new HashMap<>();

    public static LottoNumber get(int number) {
        if (LOTTO_NUMBERS.containsKey(number)) {
            return LOTTO_NUMBERS.get(number);
        }

        return createWithCaching(number);
    }

    private static LottoNumber createWithCaching(int number) {
        LottoNumber newLottoNumber = LottoNumber.from(number);
        LOTTO_NUMBERS.put(number, newLottoNumber);

        return newLottoNumber;
    }

}
