package lotto.view;

import lotto.domain.lottoticket.LottoTickets;

public class OutputView {

    public void showExceptionMessage(Exception e) {
        print(e.getMessage());
    }

    public void printLottoTickets(LottoTickets lottoTickets) {
        final String BUY_MESSAGE = String.format("%d개를 구매했습니다.", lottoTickets.size());

        print(BUY_MESSAGE);
        print(lottoTickets.toString());
    }

    public void print(String message) {
        System.out.println(message);
    }



}
