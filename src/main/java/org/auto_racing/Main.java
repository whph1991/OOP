package org.auto_racing;

public class Main {
    public static void main(String[] args){
        InputView inputView = new InputView();
        Condition condition = new Condition();

        InputDTO inputDTO = inputView.show();
        RacingGame racingGame = new RacingGame(inputDTO);
        racingGame.racing(condition);

        ResultView resultView = new ResultView();
        resultView.printResult(racingGame);
    }
}