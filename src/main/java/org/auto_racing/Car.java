package org.auto_racing;

public class Car {
    private int position;
    private String name;

    Car()
    {
        this.position = 0;
    }

    Car(String name)
    {
        this.name = name;
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

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}