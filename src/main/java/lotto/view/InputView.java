package lotto.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    private static final String LOTTO_MONEY_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String WINNING_LOTTO_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final String BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";

    public String scanLottoMoney() {

        return MessageForScan(LOTTO_MONEY_MESSAGE);
    }

    public String scanWinningLotto() {

        return MessageForScan(WINNING_LOTTO_MESSAGE);
    }

    public String scanBonusNumber() {

        return MessageForScan(BONUS_NUMBER_MESSAGE);
    }


    private String MessageForScan(String message) {
        System.out.println(message);

        return scan();
    }


    private String scan() {

        return readLine();
    }

}
