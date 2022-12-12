package lotto.domain.lottoticket;

import java.util.List;

public class LottoTicket {
    private final List<Integer> numbers;

    public LottoTicket(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // TODO: 추가 기능 구현
}
