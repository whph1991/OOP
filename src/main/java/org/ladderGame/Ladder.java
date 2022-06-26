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

    public String playGame(int position){
        int startPosition = position;

        for (int row = 0; row < this.height; row++){
            position = move(position, this.lines.get(row).getPoints());
        }

        return this.names.get(startPosition) + ":" + this.outputs.get(position);
    }

    public int move(int position, ArrayList<Boolean> points){
        // move left
        if (position > 0 && points.get(position-1)){
            return position - 1;
        }

        // move right
        if (points.size() > position && points.get(position)){
            return position + 1;
        }

        return position;
    }

    public int getHeight(){return this.height;}
    public List<String> getNames(){return this.names;}
    public ArrayList<Line> getLines(){return this.lines;}
    public List<String> getOutputs(){return this.outputs;}
}

