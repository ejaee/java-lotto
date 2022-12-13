package lotto.domain.Lottogenerator;

import java.util.ArrayList;
import java.util.List;
import lotto.domain.lottoticket.LottoTicket;
import lotto.domain.lottoticket.LottoTickets;

public class LottoGenerator {

    private LottoGenerator() {
    }

    public static LottoGenerator getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        public static final LottoGenerator INSTANCE = new LottoGenerator();
    }

    public LottoTickets createLottoTicket(int amount, LottoMachine lottoMachine) {
        List<LottoTicket> lottoTicketList = new ArrayList<>();

        for (int i = 0; i < amount; ++i) {
            lottoTicketList.add(lottoMachine.generateLotto());
        }
        return LottoTickets.from(lottoTicketList);
    }
}
