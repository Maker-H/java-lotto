package lotto.Input;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputNumber {

    public String insertMoney() {
        PrintInstruction.BUY.printMessage();
        return Console.readLine();
    }

    public List<Integer> insertSixNum() throws IllegalArgumentException {
        List<Integer> lottoSixNum = new ArrayList<>();
        PrintInstruction.ENTER_NUM.printMessage();
        String[] userInputs = Console.readLine().split(",");

        for (String userInput : userInputs) {
            if(!userInput.matches("[+-]?\\d*(\\.\\d+)?")){
                throw new IllegalArgumentException(PrintError.NO_COMMA.getMessage());
            }
            lottoSixNum.add(Integer.parseInt(userInput));
        }

        return lottoSixNum;
    }

    public String insertOneNum() {
        PrintInstruction.ENTER_BONUS.printMessage();

        return Console.readLine();
    }


}
