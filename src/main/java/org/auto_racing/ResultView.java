package org.auto_racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ResultView {
    private ArrayList<Car> cars;
    private ArrayList<String> winners;
    private int maxPosition;

    ResultView(ArrayList<Car> cars){
        this.cars = cars;
        this.winners = new ArrayList<>();
    }

    public void printPositions(){
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + String.join("", Collections.nCopies(car.getPosition(), "-")));
        }
    }

    public void findMaxPosition(){
        int length = this.cars.size();
        int [] positions = new int[length];

        for (int i = 0; i < length; i++){
            positions[i] = cars.get(i).getPosition();
        }

        Arrays.sort(positions);

        this.maxPosition = positions[length-1];
    }

    public void findWinners(){
        for (Car car : cars) {
            winnerRating(car);
        }
    }

    public void winnerRating(Car car){
        if (car.getPosition() == this.maxPosition){
            this.winners.add(car.getName());
        }
    }

    public void printWinners(){
        findMaxPosition();
        findWinners();

        System.out.print(String.join(", ", this.winners) + "가 최종 우승했습니다.");

    }
}
