package lotto.view;

public class OutputView {

    public void showExceptionMessage(Exception e) {
        print(e.getMessage());
    }

    public void print(String message) {
        System.out.println(message);
    }



}
