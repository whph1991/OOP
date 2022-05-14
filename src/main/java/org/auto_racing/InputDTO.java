package org.auto_racing;

public class InputDTO {
    private int n;
    private int count;

    InputDTO(){
    }

    InputDTO(int n, int count){
        this.n = n;
        this.count = count;
    }

    public int getN(){
        return this.n;
    }

    public void setN(int n){
        this.n = n;
    }

    public int getCount(){
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}