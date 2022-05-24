package org.auto_racing;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    Task(){
    }

    public void run(){
        ArrayList<Car> cars = new ArrayList<>();
        Condition condition = new Condition();

        InputView inputView = inputStage();
        enrollParticipant(inputView, cars);
        autoRacing(inputView, cars, condition);

        ResultView resultView = new ResultView(cars);
        resultView.printPositions();
        resultView.printWinners();
    }

    public InputView inputStage(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
        String names = scanner.next();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int count = scanner.nextInt();

        return new InputView(names, count);
    }

    public void enrollParticipant(InputView inputView, ArrayList<Car> cars){
        String[] names = inputView.getNames().split(",");
        int n = names.length;

        for(String name : names) {
            cars.add(new Car(name));
        }
    }

    public void autoRacing(InputView inputView, ArrayList<Car> cars, Condition condition){
        for(int i = 0; i < inputView.getCount(); i++) {
            oneGame(cars, condition);
        }
    }

    public void oneGame(ArrayList<Car> cars, Condition condition){
        for (Car car: cars){
            driveCar(car, condition);
        }
    }

    public void driveCar(Car car, Condition condition){
        if (condition.move()){
            car.move();
        }
    }
}