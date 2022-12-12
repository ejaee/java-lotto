package lotto.domain.exception;

public class SizeOfLottoTicketException extends IllegalArgumentException{

    public static final String SIZE_LOTTO_TICKET_MESSAGE
        = "[ERROR] LottoTicket 잘못된 값이 들어갔습니다.";

    public SizeOfLottoTicketException() {
        super(SIZE_LOTTO_TICKET_MESSAGE);
    }
}
