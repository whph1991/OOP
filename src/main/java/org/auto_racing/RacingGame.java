package org.auto_racing;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class RacingGame {
    private InputDTO inputDTO;
    private ArrayList<Car> cars;

    RacingGame(InputDTO inputDTO){
        this.inputDTO = inputDTO;

        enrollParticipant();
    }

    public void enrollParticipant(){
        this.cars = new ArrayList<>();
        String[] names = this.inputDTO.getNames().split(",");

        for(String name : names) {
            this.cars.add(new Car(name));
        }
    }

    public void racing(Condition condition){
        for(int i = 0; i < this.inputDTO.getCount(); i++) {
            oneGame(condition);
        }
    }

    public void oneGame(Condition condition){
        for (Car car: this.cars){
            driveCar(car, condition);
        }
    }

    public void driveCar(Car car, @NotNull Condition condition){
        if (condition.canMove()){
            car.move();
        }
    }

    public ArrayList<String> rank(){
        String name;
        int position, maxPosition = 0;
        Map<Integer, ArrayList<String>> map = new LinkedHashMap<>();

        for (Car car : this.cars) {
            name = car.getName();
            position = car.getPosition();
            maxPosition = Math.max(maxPosition, position);

            addMap(map, position, name);
        }

        return map.get(maxPosition);
    }

    public void addMap(@NotNull Map<Integer, ArrayList<String>> map, int position, String name){
        if (map.get(position) == null){
            ArrayList<String> names = new ArrayList<>();
            names.add(name);

            map.put(position, names);
        }
        else {
            map.get(position).add(name);
        }
    }

    public ArrayList<Car> getCars(){
        return this.cars;
    }
}
