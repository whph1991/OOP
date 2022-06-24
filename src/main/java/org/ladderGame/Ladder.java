package org.ladderGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ladder {

    private List<String> names;
    private List<String> outputs;
    private int height;

    private ArrayList<Line> lines = new ArrayList<>();

    Ladder(InputDto inputDto){
        this.names = Arrays.asList(inputDto.getNames().split(","));
        this.outputs = Arrays.asList(inputDto.getOutputs().split(","));
        this.height = inputDto.getHeight();

    }

    public void makeLadders(){
        int countOfPerson = this.names.size();

        for(int row = 0; row < height; row++){
            lines.add(new Line(countOfPerson));
        }
    }

    public int getHeight(){return this.height;}
    public List<String> getNames(){return this.names;}
    public ArrayList<Line> getLines(){return this.lines;}
    public List<String> getOutputs(){return this.outputs;}
}

