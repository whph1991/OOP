package org.laddergame.algorithm;

import org.laddergame.utils.Ladder;
import org.laddergame.utils.Line;

import java.util.ArrayList;

public class LadderGameAlgorithm {
    private Ladder ladder;
    private ArrayList<Integer> positions = new ArrayList<>();
    private int countOfPerson;

    public LadderGameAlgorithm(Ladder ladder){
        this.ladder = ladder;
        this.countOfPerson = ladder.getNames().size();

        initPositions();
    }

    public void initPositions(){
        for(int position = 0; position < this.countOfPerson; position++){
            this.positions.add(position);
        }
    }

    public void run(){
        int height = this.ladder.getHeight();
        ArrayList<Line> lines = this.ladder.getLines();

        for (int row = 0; row < height; row++){
            moveDown(lines.get(row).getPoints());
        }
    }

    public void moveDown(ArrayList<Boolean> points){
        for(int position = 0; position < this.countOfPerson; position++){
            checkPosition(position, points);
        }
    }

    public void checkPosition(int position, ArrayList<Boolean> points){
        int currentPosition;

        if (checkSwap(position, points)){
            currentPosition = this.positions.get(position);
            this.positions.set(position, this.positions.get(position+1));
            this.positions.set(position + 1, currentPosition);
        }
    }

    public boolean checkSwap(int position, ArrayList<Boolean> points){
        return position < points.size()  && points.get(position);
    }

    public ArrayList<Integer> getPositions(){return this.positions;}
}
