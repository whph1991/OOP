package org.auto_racing;

import java.util.*;
import java.util.stream.Collectors;

public class AutoRacing {

    AutoRacing(){
    }

    public void run(){
        ArrayList<Car> cars = new ArrayList<>();
        Condition condition = new Condition();
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        InputDTO inputDTO = inputView.show();

        enrollParticipant(inputDTO, cars);
        autoRacing(inputDTO, cars, condition);

        resultView.printPositions(cars);
        resultView.printWinners(rank(cars));
    }

    public void enrollParticipant(InputDTO inputDTO, ArrayList<Car> cars){
        String[] names = inputDTO.getNames().split(",");

        for(String name : names) {
            cars.add(new Car(name));
        }
    }

    public void autoRacing(InputDTO inputDTO, ArrayList<Car> cars, Condition condition){
        for(int i = 0; i < inputDTO.getCount(); i++) {
            oneGame(cars, condition);
        }
    }

    public void oneGame(ArrayList<Car> cars, Condition condition){
        for (Car car: cars){
            driveCar(car, condition);
        }
    }

    public void driveCar(Car car, Condition condition){
        if (condition.canMove()){
            car.move();
        }
    }

    public ArrayList<String> rank(ArrayList<Car> cars){
        String name;
        int position, maxPosition = 0;
        Map<Integer, ArrayList<String>> map = new LinkedHashMap<>();

        for (Car car : cars) {
            name = car.getName();
            position = car.getPosition();
            maxPosition = Math.max(maxPosition, position);

            addMap(map, position, name);
        }

        return map.get(maxPosition);
    }

    public void addMap(Map<Integer, ArrayList<String>> map, int position, String name){
        if (map.get(position) == null){
            ArrayList<String> names = new ArrayList<>();
            names.add(name);

            map.put(position, names);
        }
        else {
            map.get(position).add(name);
        }
    }
}