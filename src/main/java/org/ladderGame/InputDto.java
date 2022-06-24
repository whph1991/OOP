package org.ladderGame;

public class InputDto {
    private String names;
    private String outputs;
    private int height;

    InputDto(){
    }

    InputDto(String names){
        this.names = names;
    }

    InputDto(String names, String outputs, int height){
        this.names = names;
        this.height = height;
        this.outputs = outputs;
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

    public String getOutputs(){
        return this.outputs;
    }

    public void setOutputs(String returns) {
        this.outputs = returns;
    }
}