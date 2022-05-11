package org.auto_racing_1;

public class Car {
    private int position;

    Car()
    {
        this.position = 0;
    }

    void move()
    {
        this.position += 1;
    }

    int get_position()
    {
        return position;
    }
}
