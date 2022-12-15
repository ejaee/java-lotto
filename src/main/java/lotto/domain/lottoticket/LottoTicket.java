package lotto.domain.lottoticket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import lotto.domain.exception.DuplicationOfLottoTicketException;
import lotto.domain.exception.SizeOfLottoTicketException;

public class LottoTicket {

    public static final int LOTTO_TICKET_SIZE = 6;

    private final List<Integer> numbers;

    public LottoTicket(List<Integer> numbers) {
        validate(numbers);

        List<Integer> numbersList = new ArrayList<>(numbers);
        Collections.sort(numbersList);

        this.numbers = numbersList;
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

    public boolean contained(LottoNumber lottoNumber) {
        return numbers.contains(lottoNumber.getLottoNumber());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final LottoTicket that = (LottoTicket) o;
        return Objects.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
