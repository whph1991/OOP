package org.auto_racing;

public class InputDTO {
    private String names;
    private int count;

    InputDTO(){
    }

    InputDTO(String names, int count){
        this.names = names;
        this.count = count;
    }

    public String getNames(){
        return this.names;
    }

    public void setNames(String n){
        this.names = n;
    }

    public int getCount(){
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}