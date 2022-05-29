package org.ladderGame;

public class InputDto {
    private int count;
    private int height;

    InputDto(){
    }

    InputDto(int count, int height){
        this.count = count;
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getCount(){
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}