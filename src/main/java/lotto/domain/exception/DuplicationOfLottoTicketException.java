package lotto.domain.exception;

public class DuplicationOfLottoTicketException extends IllegalArgumentException{

    public static final String DUPLICATED_LOTTO_TICKET_MESSAGE
        = "[ERROR] LottoTicket 에 중복된 값이 들어갔습니다.";

    public DuplicationOfLottoTicketException() {
        super(DUPLICATED_LOTTO_TICKET_MESSAGE);
    }
}
