package org.laddergame.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ladder {

    private List<String> names;
    private List<String> outputs;
    private int height;

    private ArrayList<Line> lines = new ArrayList<>();

    public Ladder(UserVO userVO){
        this.names = Arrays.asList(userVO.getNames().split(","));
        this.outputs = Arrays.asList(userVO.getOutputs().split(","));
        this.height = userVO.getHeight();
    }

    public void makeLadder(){
        int countOfPerson = this.names.size();

        for(int row = 0; row < this.height; row++){
            this.lines.add(new Line(countOfPerson));
        }
    }

    public int getHeight(){return this.height;}
    public List<String> getNames(){return this.names;}
    public ArrayList<Line> getLines(){return this.lines;}
    public List<String> getOutputs(){return this.outputs;}
}

