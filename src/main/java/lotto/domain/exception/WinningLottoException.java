package lotto.domain.exception;

public class WinningLottoException extends IllegalArgumentException{

    public static final String WINNING_LOTTO_MESSAGE
        = "[ERROR] bonusNumber에 중복된 값이 들어갔습니다.";

    public WinningLottoException() {
        super(WINNING_LOTTO_MESSAGE);
    }
}
