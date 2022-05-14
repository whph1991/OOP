package org.auto_racing;

public class Car {
    private int position;

    Car()
    {
        this.position = 0;
    }

    public void move()
    {
        this.position += 1;
    }

    public int getPosition()
    {
        return position;
    }
}