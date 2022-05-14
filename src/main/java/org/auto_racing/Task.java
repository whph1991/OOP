package org.auto_racing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    Task(){
    }

    public void run(){
        ArrayList<Car> cars = new ArrayList<>();
        Condition condition = new Condition();

        InputDTO inputDto = inputStage();
        enrollParticipant(inputDto, cars);
        autoRacing(inputDto, cars, condition);
        printResult(cars);
    }

    public InputDTO inputStage(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차의 대수는 몇 대 인가요?");
        int n = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int count = scanner.nextInt();

        return new InputDTO(n, count);
    }

    public void enrollParticipant(InputDTO inputDto, ArrayList<Car> cars){
        for(int i = 0; i < inputDto.getN(); i++) {
            cars.add(new Car());
        }
    }

    public void autoRacing(InputDTO inputDto, ArrayList<Car> cars, Condition condition){
        for(int i = 0; i < inputDto.getCount(); i++) {
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

    public void printResult(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(String.join("", Collections.nCopies(car.getPosition(), "-")));
        }
    }
}