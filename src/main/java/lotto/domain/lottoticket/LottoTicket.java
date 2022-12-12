package lotto.domain.lottoticket;

import java.util.List;
import lotto.domain.exception.DuplicationOfLottoTicketException;
import lotto.domain.exception.SizeOfLottoTicketException;

public class LottoTicket {
    public static final int LOTTO_TICKET_SIZE = 6;

    private final List<Integer> numbers;

    public LottoTicket(List<Integer> numbers) {
        validate(numbers);

        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        checkElements(numbers);
        checkDuplicated(numbers);
    }

    private static void checkElements(List<Integer> numbers) {
        if (numbers.size() != LOTTO_TICKET_SIZE) {
            throw new SizeOfLottoTicketException();
        }
    }

    private void checkDuplicated(List<Integer> numbers) {
        long count = numbers.stream()
            .distinct()
            .count();

        if (count != LOTTO_TICKET_SIZE) {
            throw new DuplicationOfLottoTicketException();
        }
    }

}
