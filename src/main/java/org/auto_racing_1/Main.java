package org.auto_racing_1;

import java.io.Reader;
import java.io.FileReader;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // scanner 선언
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력
        System.out.println("자동차의 대수는 몇 대 인가요?");
        int n = scanner.nextInt();

        System.out.println("시도할 회수는 몇 회 인가요?");
        int count = scanner.nextInt();

        ArrayList<Car> cars = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            cars.add(new Car());
        }

        Reader reader = new FileReader(".\\src\\main\\java\\org\\auto_racing_1\\condition.json");
        Gson gson = new Gson();
        JsonObject obj = gson.fromJson(reader, JsonObject.class);

        Condition condition = new Condition(obj.get("threshold").getAsInt(), obj.get("range_min").getAsInt(), obj.get("range_max").getAsInt());

        for(int i = 0; i < count; i++)
        {
            for (Car car: cars)
            {
                if (condition.move())
                {
                    car.move();
                }
            }
        }

        String marker = "-";
        for (Car car: cars)
        {
            System.out.println(String.join("", Collections.nCopies(car.get_position(), marker)));
        }
    }
}
