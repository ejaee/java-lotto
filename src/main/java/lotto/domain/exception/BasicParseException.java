package lotto.domain.exception;

public class BasicParseException extends IllegalArgumentException{

    public static final String BASIC_PARSE_EXCEPTION
        = "[ERROR] input 값이 잘못 입력 되었습니다";

    public BasicParseException() {
        super(BASIC_PARSE_EXCEPTION);
    }


}
