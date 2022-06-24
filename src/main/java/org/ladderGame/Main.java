package org.ladderGame;

public class Main {
    public static void main(String[] args){
        InputView inputView = new InputView();
        InputDto inputDto = inputView.show();

        Ladder ladder = new Ladder(inputDto);
        ladder.makeLadders();

        ResultView resultView = new ResultView();
        resultView.printResult(ladder);

        InputDto requestDto = inputView.request();
        resultView.printRequest(ladder, requestDto);
    }
}
