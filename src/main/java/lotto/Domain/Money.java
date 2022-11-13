package lotto.Domain;

import lotto.Input.CheckException;

public class Money {
    private final int userlottonum;
    public Money(String userInput){
        this.userlottonum = validate(userInput);
    }

    public int validate(String userInput) throws IllegalArgumentException {
        CheckException checkException = new CheckException();
        int convertedUserInput = checkException.check_HaveChar(userInput);

        checkException.check_Thousand(convertedUserInput);
        return convertedUserInput/1000;
    }

    public int getUserlottonum() {
        return userlottonum;
    }
}
