package org.auto_racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ResultView {
    ResultView(){
    }

    public void printResult(RacingGame racingGame){
        printPositions(racingGame.getCars());
        printWinners(racingGame.rank());
    }

    public void printPositions(ArrayList<Car> cars){
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + String.join("", Collections.nCopies(car.getPosition(), "-")));
        }
    }

    public void printWinners(ArrayList<String> winners){
        System.out.print(String.join(", ", winners) + "가 최종 우승했습니다.");

    }
}
