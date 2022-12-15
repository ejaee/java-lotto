package lotto.controller;

import lotto.domain.Lottogenerator.AutoLottoMachine;
import lotto.domain.Lottogenerator.LottoGenerator;
import lotto.domain.lottoticket.LottoMoney;
import lotto.domain.lottoticket.LottoNumber;
import lotto.domain.lottoticket.LottoTicket;
import lotto.domain.lottoticket.LottoTickets;
import lotto.domain.utils.BasicLottoInputParser;
import lotto.domain.utils.LottoTicketInputParser;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputView;

    public LottoController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        try {
            LottoMoney LottoMoney = inputBudget();
            LottoTickets lottoTickets = buyLottoTicket(LottoMoney);
            outputView.printLottoTickets(lottoTickets);

            LottoTicket winningLotto = inputWinningLotto();

            LottoNumber bonusNumber = inputBonusNumber();
        } catch (IllegalArgumentException e) {
            outputView.showExceptionMessage(e);
        }
    }

    private LottoMoney inputBudget() {
        String inputMoney = inputView.scanLottoMoney();

        return BasicLottoInputParser.parseLottoMoney(inputMoney);
    }

    private LottoTickets buyLottoTicket(LottoMoney lottoMoney) {
        LottoGenerator lottoGenerator = LottoGenerator.getInstance();

        return lottoGenerator.createLottoTicket(lottoMoney, new AutoLottoMachine());
    }

    private LottoTicket inputWinningLotto() {
        String inputLottoNumbers = inputView.scanWinningLotto();

        return LottoTicketInputParser.parseLottoTicket(inputLottoNumbers);
    }

    private LottoNumber inputBonusNumber() {
        String inputNumber = inputView.scanBonusNumber();

        return BasicLottoInputParser.parseLottoNumber(inputNumber);
    }

}
