package lotto.domain.lottoticket;

import java.util.List;
import java.util.Objects;

public class LottoTickets {
    private final List<LottoTicket> lottoTickets;

    private LottoTickets(List<LottoTicket> lottoTickets) {
        this.lottoTickets = lottoTickets;
    }

    public static LottoTickets from(List<LottoTicket> lottoTickets) {
        return new LottoTickets(lottoTickets);
    }

    public int size() {
        return lottoTickets.size();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final LottoTickets that = (LottoTickets) o;
        return Objects.equals(lottoTickets, that.lottoTickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottoTickets);
    }

}
