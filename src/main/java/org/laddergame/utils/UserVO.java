package org.laddergame.utils;

public class UserVO {
    private String names;
    private String outputs;
    private int height;

    public UserVO(){
    }
    public UserVO(String names, String outputs, int height){
        this.names = names;
        this.outputs = outputs;
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

    public void setOutputs(String outputs) {
        this.outputs = outputs;
    }

    public int getHeight() { return this.height; }

    public void setHeight(int height){
        this.height = height;
    }

    @Override
    public String toString(){
        return "UserVO[names=" + names + ", outputs=" + outputs + ", height=" + height + "]";
    }
}