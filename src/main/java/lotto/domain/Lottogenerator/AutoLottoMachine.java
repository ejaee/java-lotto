package lotto.domain.Lottogenerator;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import lotto.domain.lottoticket.LottoTicket;

public class AutoLottoMachine implements LottoMachine{

    @Override
    public LottoTicket generateLotto() {
        List<Integer> lottoTicket = Randoms.pickUniqueNumbersInRange(1, 45, 6);

        return new LottoTicket(lottoTicket);
    }
}
