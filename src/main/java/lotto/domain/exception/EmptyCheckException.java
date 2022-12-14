package lotto.domain.exception;

public class EmptyCheckException extends IllegalArgumentException{

    public static final String EMPTY_CHECK_EXCEPTION
        = "[ERROR] input 값이 null 또는 empty 입니다.";

    public EmptyCheckException() {
        super(EMPTY_CHECK_EXCEPTION);
    }

}
