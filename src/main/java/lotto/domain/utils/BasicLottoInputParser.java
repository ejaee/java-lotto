package lotto.domain.utils;

import java.util.function.IntFunction;
import java.util.stream.Stream;
import lotto.domain.exception.BasicParseException;
import lotto.domain.lottoticket.LottoMoney;
import lotto.domain.lottoticket.LottoNumber;

public class BasicLottoInputParser {

    private BasicLottoInputParser() {
    }

    public static LottoMoney parseLottoMoney(final String input) {
        return parseWithCheckingEmpty(input, LottoMoney::from);
    }

    public static LottoNumber parseLottoNumber(final String input) {
        return parseWithCheckingEmpty(input, LottoNumber::from);
    }

    private static <T> T parseWithCheckingEmpty(final String input, final IntFunction<T> creationFunction) {
        EmptyChecker.check(input);

        return parse(input, creationFunction);
    }

    private static <T> T parse(final String input, final IntFunction<T> creationFunction) {
        return Stream.of(input)
            .map(String::trim)
            .filter(i -> i.matches("[1-9]+[0-9]*$"))
            .map(Integer::parseInt)
            .map(creationFunction::apply)
            .findFirst()
            .orElseThrow(BasicParseException::new);
    }

}
