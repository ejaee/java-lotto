package lotto.domain.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lotto.domain.lottoticket.LottoTicket;

public class LottoTicketInputParser {

    private static  final String LOTTO_NUMBERS_DELIMITER = ",";

    private LottoTicketInputParser() {
    }

    public static LottoTicket parseLottoTicket(final String input) {
        return parseWithCheckingEmpty(input);
    }

    private static LottoTicket parseWithCheckingEmpty(final String input) {
        EmptyChecker.check(input);

        List<Integer> lottoNumbers = parse(input);
        return new LottoTicket(lottoNumbers);
    }

    private static List<Integer> parse(final String input) {
        return Arrays.stream(input.split(LOTTO_NUMBERS_DELIMITER))
            .map(String::trim)
            .filter(i -> i.matches("[1-9]+[0-9]*$"))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }
}
