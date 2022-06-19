package org.ladderGame;

import java.util.ArrayList;

public class Line {
    private ArrayList<Boolean> points = new ArrayList<>();
    private final int TRHESHOLD = 4;
    private final int RANGE = 9;

    public Line(int countOfPerson){
        // 라인의 좌표 값에 선이 있는지 유무를 판단하는 로직 추가
        for(int column = 0; column < countOfPerson; column++){
            addColumn();
        }
    }

    public void addColumn(){
        Boolean value = this.TRHESHOLD <= (int)(Math.random() * this.RANGE);

        if(this.points.size() != 0 && this.points.get(this.points.size()-1))
        {
            value = Boolean.FALSE;
        }

        this.points.add(value);
    }

    public void printLine(){
        for (Boolean point: this.points){
            System.out.print(checkLine(point) + "|");
        }

        System.out.println();
    }

    public String checkLine(Boolean point){
        return point ? "-----" : "     ";
    }
}
