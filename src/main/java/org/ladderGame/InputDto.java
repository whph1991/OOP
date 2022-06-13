package org.ladderGame;

public class InputDto {
    private String names;
    private int height;

    InputDto(){
    }

    InputDto(String names, int height){
        this.names = names;
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public String getNames(){
        return this.names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}