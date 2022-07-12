package org.laddergame;

import org.laddergame.algorithm.LadderGameAlgorithm;
import org.laddergame.utils.UserVO;
import org.laddergame.utils.Ladder;
import org.laddergame.view.InputView;
import org.laddergame.view.ResultView;

public class LadderGame {
    public static void main(String[] args){
        UserVO userVO = InputView.show();
        Ladder ladder = new Ladder(userVO);
        ladder.makeLadder();

        ResultView.printLadder(ladder);

        LadderGameAlgorithm algorithm = new LadderGameAlgorithm(ladder);
        algorithm.run();

        String requestName = InputView.request();
        ResultView.printRequest(requestName, ladder, algorithm.getPositions());
    }
}
